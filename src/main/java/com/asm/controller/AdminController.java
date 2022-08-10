package com.asm.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.asm.dao.AccountDAO;
import com.asm.dao.CategoryDAO;
import com.asm.dao.OrderDAO;
import com.asm.dao.ProductDAO;
import com.asm.dao.ShoppingCartDAO;
import com.asm.entity.Account;
import com.asm.entity.CartItem;
import com.asm.entity.Category;
import com.asm.entity.Order;
import com.asm.entity.Product;

import com.asm.service.ShoppingCartService;

import javax.persistence.Entity;
import javax.servlet.http.HttpSession;




@Controller
@RequestMapping("/admin")

public class AdminController {

	@Autowired ProductDAO productDAO;
	@Autowired CategoryDAO cateDAO;
	@Autowired AccountDAO accDAO;
	@Autowired OrderDAO orderDAO;
	String kk;


	@Autowired 	ShoppingCartService cart;
	private static final Path CURRENT_FOLDER = Paths.get(System.getProperty("user.dir"));



	@RequestMapping()
	public String productRq(Model model,
			@RequestParam("p") Optional<Integer> p,HttpSession session) {

		return "admin/admin";
	}
	@RequestMapping("/profile")
	public String profile(Model model,
			@RequestParam("p") Optional<Integer> p,HttpSession session) {

		return "/admin/profile";
	}
	@RequestMapping("/searchBtn")
	public String searchByKeyword(Model model,
			@RequestParam("p") Optional<Integer> p,HttpSession session, @RequestParam(value="searchE", required = false) String inputSearch) {
		Pageable pageable = PageRequest.of(p.orElse(0), 8);
		//Page<Account> account = accDAO.findByKeyWord(pageable,inputSearch);
		//model.addAttribute("alluserinfo",account);
		System.out.println(inputSearch);
		
		
		return "redirect:/admin";
	}
	
	@RequestMapping("/save")
	public String create(Model model ,@RequestParam("file") 
							MultipartFile image,@RequestParam("discription") String discription,
							@ModelAttribute("product")  Product product) throws IOException {
			Path staticPath = Paths.get("src/main/webapp");
			Path imagePath = Paths.get("images");

			if (!Files.exists(CURRENT_FOLDER.resolve(staticPath).resolve(imagePath))) {
			 Files.createDirectories(CURRENT_FOLDER.resolve(staticPath).resolve(imagePath));
			}
			Path file = CURRENT_FOLDER.resolve(staticPath)
			     .resolve(imagePath).resolve(image.getOriginalFilename());
			try (OutputStream os = Files.newOutputStream(file)) {
			 os.write(image.getBytes());
			}
			
			System.out.println(CURRENT_FOLDER);
			product.setImage(image.getOriginalFilename().toString());
			Product saveProduct = productDAO.save(product);
			return "redirect:/admin/profile";
	}
	@ModelAttribute("userinfo")
	public Account userAttribute(HttpSession session) {
		String username = (String) session.getAttribute("userName");
		
		Account account = accDAO.findByUserName(username);
		
		return account ;
	}

	@ModelAttribute(name="alluserinfo")
	public Page<Account> allUserAttribute(@RequestParam("p") Optional<Integer> p) {
		Pageable pageable = PageRequest.of(p.orElse(0), 8);
		Page<Account> account = accDAO.findAll(pageable);
		return account;
	}
	@ModelAttribute(name="allorderinfo")
	public Page<Order> allOrder(@RequestParam("p") Optional<Integer> p) {
		Pageable pageable = PageRequest.of(p.orElse(0), 4);
		Page<Order> order = orderDAO.findAll(pageable);
		return order;
	}
}

