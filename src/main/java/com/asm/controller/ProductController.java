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
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.asm.dao.CategoryDAO;
import com.asm.dao.ProductDAO;
import com.asm.dao.ShoppingCartDAO;
import com.asm.entity.CartItem;
import com.asm.entity.Category;
import com.asm.entity.Product;

import com.asm.service.ShoppingCartService;

import javax.persistence.Entity;




@Controller
@RequestMapping("/product")

public class ProductController {

	@Autowired ProductDAO productDAO;
	@Autowired CategoryDAO cateDAO;
	@Autowired 	ShoppingCartService cart;
;


	@RequestMapping()
	public String productRq(Model model,
			@RequestParam("p") Optional<Integer> p) {
		
		return "Product";
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
	@ModelAttribute(name="product")
	public Page<Product> getProduct(@RequestParam("p") Optional<Integer> p) {
		Pageable pageable = PageRequest.of(p.orElse(0), 8);
		Page<Product> prod = productDAO.findAll(pageable);
		return prod;
	}
	@ModelAttribute(name="prd")
	public List<Product> getProductz() {
		List<Product> zz = productDAO.findAll();
		return zz;
	}
	@ModelAttribute(name="categoName")
	public List<Category> Cate() {
		List<Category> categoName = cateDAO.findAll();
		return categoName;
	}
	@ModelAttribute(name="cartNum")
	public int cartNumber() {
		int cartNum = cart.getItems().size();
		return cartNum;
	}
	
}

