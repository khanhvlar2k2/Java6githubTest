package com.asm.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.asm.dao.AccountDAO;
import com.asm.dao.CategoryDAO;
import com.asm.dao.OrderDAO;
import com.asm.dao.OrderDetailDAO;
import com.asm.dao.ProductDAO;
import com.asm.dao.ShoppingCartDAO;
import com.asm.entity.Account;
import com.asm.entity.CartItem;
import com.asm.entity.Category;
import com.asm.entity.Order;
import com.asm.entity.OrderDetail;
import com.asm.entity.Product;
import com.asm.service.MailerService;
import com.asm.service.ShoppingCartService;
import com.asm.service.MailTemPlate;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

import javax.mail.MessagingException;
import javax.persistence.Entity;
import javax.servlet.http.HttpSession;




@Controller
@RequestMapping("/cart")
public class ShoppingCartController {

	@Autowired ProductDAO productDAO;
	@Autowired 	ShoppingCartService cart;
	@Autowired AccountDAO accDAO;
	@Autowired OrderDAO orderDAO;
	@Autowired OrderDetailDAO orderdetailDAO;
	@Autowired CategoryDAO cateDAO;
	@Autowired
	MailerService mailer;

	@RequestMapping("/view")
	public String CartRv(Model model) {
		model.addAttribute("cart",cart);
		model.addAttribute("cart2",cart.getItems());

		return "ShoppingCart";
	}
	@RequestMapping("/update/{id}")
	public String update(@PathVariable("id") Integer id, @RequestParam("quantity") Integer quantity) {
		cart.update(id, quantity);
//		System.out.println("Update ITEM: " + id + "; Qty = " + quantity);
		return "redirect:/cart/view";
	}
	
	@RequestMapping("/remove/{id}")
	public String remove(@PathVariable("id") Integer id) {
		cart.remove(id);
		return "redirect:/cart/view";
	}
	@ModelAttribute("userCart")
	public Account userAttribute(HttpSession session) {
		String username = (String) session.getAttribute("userName");
		
		Account account = accDAO.findByUserName(username);
		
		return account ;
	}
	@GetMapping("/khanh")
	public String string(HttpSession session,@RequestParam(name="account", required = false) String fullname
			,@RequestParam(name="email", required = false) String email
			,@RequestParam(name="address", required = false) String address
			, @ModelAttribute("order") Order order ) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		Date now = new Date();  
		Account account = userAttribute(session);
		System.out.println(account.getUsername());
		now.getTime();
		orderDAO.save(order);
		for (CartItem item : cart.getItems()) {
			Order o = orderDAO.findByOrderId(order.getId());
			Product product = productDAO.findbyProductId(item.getProductId());
			orderdetailDAO.save(new OrderDetail(item.getPrice(), item.getQuantity(), product, o));
		}
		try {
			mailer.send(
					email, 
					"THÔNG BÁO ĐẶT HÀNG THÀNH CÔNG- K&M SHOP", MailTemPlate.DEFAULT_TEMPLATE );
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				cart.getItems().clear();
				
				
		return "redirect:/index";
 
	}
	@RequestMapping("/{id}")
	public String AddtoCart(@PathVariable("id") Integer id) {
		Product prd = productDAO.findbyProductId(id);
		if(prd != null) {
			CartItem item = new CartItem();
			item.setProductId(prd.getId());
			item.setProductName(prd.getName());
			item.setPrice(prd.getPrice());
			item.setQuantity(1);
			
			cart.add(item);
		}
		System.out.println(cart.getItems());
		return "Product";
	} 
	}
//	@ModelAttribute(name="product")
//	public Page<Product> getProduct(@RequestParam("p") Optional<Integer> p) {
//		Pageable pageable = PageRequest.of(p.orElse(0), 8);
//		Page<Product> prod = productDAO.findAll(pageable);
//		return prod;
//	}
//	@ModelAttribute(name="prd")
//	public List<Product> getProductz() {
//		List<Product> zz = productDAO.findAll();
//		return zz;
//	}
//	@ModelAttribute(name="cateFromProductId")
//	public List<Category> Cate(@PathVariable("id") Integer id) {
//		List<Category> categoName = cateDAO.findByProductId(id);
//		categoName.get
//		return categoName;
//	}
	


