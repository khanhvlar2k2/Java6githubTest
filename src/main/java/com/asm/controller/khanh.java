package com.asm.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;import org.hibernate.hql.internal.ast.tree.IsNullLogicOperatorNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import javax.mail.MessagingException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.asm.dao.AccountDAO;
import com.asm.dao.ProductDAO;
import com.asm.entity.Account;
import com.asm.entity.Product;
import com.asm.service.MailerService;
import javax.persistence.Entity;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;




@Controller
@RequestMapping("/khanh")
public class khanh {

	@Autowired AccountDAO accDAO;
	


	
	@RequestMapping("")
	public String login(Model model,HttpSession session) {
		
		return "khanh";
		
	}

	@RequestMapping(params="btnLoginzzz")
	public String loginButton(Model model, Account acc) {
		//insert
		accDAO.save(acc);
	
		
		return "redirect:/khanh";
	}
	//lay het thong tin trong database cua bang account
	@ModelAttribute("accountjs")
	public List<Account> dasjdhsa(){
		List<Account> khanh =accDAO.findAll();
		return khanh;
	}
	@RequestMapping("/edit/{username}")
	public String edit(Model model,@PathVariable("username") String username,Account acc) {
		Account listAcc = accDAO.findByUserName(username);
		model.addAttribute("accountneeded",listAcc);
		
		return "khanh";

	}
	@RequestMapping("/remove/{username}")
	public String remove(Model model,@PathVariable("username") String username,Account acc ) {
		accDAO.deleteById(username);
		
		return "redirect:/khanh";

	}
	@RequestMapping("/update")
	public String updateBtn(Model model, Account acc) {
		//insert
		accDAO.save(acc);
	
		
		return "redirect:/khanh/edit/"+acc.getUsername();
	}
	@RequestMapping(params="btnSearchne")
	public String searchBtn(Model model, Account acc,@RequestParam(name="searchInput") String search) {
		//insert
		List<Account> cc = accDAO.findByKeyWord("%"+search+"%");
		model.addAttribute("accountjs",cc);
		return "khanh";
	}
	
	
	
	
	
}
