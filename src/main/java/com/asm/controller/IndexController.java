package com.asm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.asm.dao.CategoryDAO;
import com.asm.dao.ProductDAO;
import com.asm.entity.CartItem;
import com.asm.entity.Category;
import com.asm.entity.Product;
import com.asm.entity.Account;

import com.asm.service.ShoppingCartService;

import javax.persistence.Entity;
import javax.servlet.http.HttpSession;




@Controller
@RequestMapping("/index")

public class IndexController {

	@Autowired CategoryDAO cateDAO;
	
	@Autowired ProductDAO productDAO;
	
	@Autowired 	ShoppingCartService cart;

	@RequestMapping()
	public String index(Model model,
			HttpSession session) {
		List<Category> cate = cateDAO.findAll();
		model.addAttribute("cateDAO",cate);
		System.out.println(session.getAttribute("user"));
		return "index";
	}
	@RequestMapping("/logout")
	public String logOut(Model model,
			HttpSession session) {
		session.removeAttribute("user");
		return "redirect:/login";
	}
//	@RequestMapping("/productDetails/${id}")
//	public String productDetails(Model model,@PathVariable("id") Integer id) {
//		Product productDetails = productDAO.findbyProductId(id);
//		
//		model.addAttribute("ProductDetails",productDetails);
//		return "redirect:/productDetails";
//	}
	@ModelAttribute(name="user")
	public Object userAuth(
			HttpSession session) {
		Object user ;
		if( session.getAttribute("user")!=null) {
			user =  session.getAttribute("user");
		}else {
			user = "Đăng nhập";

		}
		return user;

	}
	@ModelAttribute(name="categoName")
	public List<Category> Cate() {
		List<Category> categoName = cateDAO.findAll();
		return categoName;
	}
	@ModelAttribute(name="product")
	public Page<Product> getProduct(@RequestParam("p") Optional<Integer> p) {
		Pageable pageable = PageRequest.of(p.orElse(0), 8);
		Page<Product> prod = productDAO.findAll(pageable);
		return prod;
	}
	@RequestMapping("/{id}")
	public String AddtoCart(@PathVariable("id") Integer id) {
		Product prd = productDAO.findbyProductId(id);
		if(prd != null) {
			CartItem item = new CartItem();
			item.setProductId(prd.getId());
			item.setProductName(prd.getName());
			item.setPrice(prd.getSalePrice());
			item.setOldprice(prd.getPrice());
			item.setQuantity(1);
			item.setImage(prd.getImage());
			item.setSale(prd.getSale());
			
			cart.add(item);
			System.out.println("added");
		}
		System.out.println(cart.getItems());
		return "index";
	}
	@ModelAttribute(name="cartNum")
	public int cartNumber() {
		int cartNum = cart.getItems().size();
		return cartNum;
	}
	
}
