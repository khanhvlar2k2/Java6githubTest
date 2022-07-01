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
@RequestMapping("/login")
public class LoginController {

	@Autowired AccountDAO accDAO;
	
	@Autowired
	MailerService mailer;

	
	@RequestMapping("")
	public String login(Model model,HttpSession session) {
		if(session.getAttribute("user")!=null) {
			return "redirect:/index";
		}
		return "login";
		
	}
	@ModelAttribute(name="logMess")
	public String logMess() {
		String logMess = "";
		return logMess;
	}
	@RequestMapping(params="btnLogin")
	public String login(Model model, Account user,HttpSession session) {
		Account acc = accDAO.findByEmailANDPassword(user.getEmail(),user.getPassword());
		if (acc!=null) {
			session.setAttribute("user", acc.getEmail());
			session.setAttribute("userName", acc.getUsername());



		    return "redirect:/index";

		}
		else {
			model.addAttribute("logMess",  "Tài khoản hoặc mật khẩu không chính xác ");
			
		}
		return "login";
		
	}
	@RequestMapping(params="btnForget")
	public String forgetPass(Model model, Account user) {
		Account accz = accDAO.findByEmail(user.getEmail());
		if (accz!=null) {
			try {
				mailer.send(user.getEmail(), "Recovery Password - Dont Reply", accz.getPassword());
				model.addAttribute("logMess",  "Đã gửi mật khẩu về mail, hãy kiểm tra mail của bạn ");

			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		else {
			model.addAttribute("logMess",  "Tài khoản không tồn tại ");
			
		}
		return "login";
		
	}
	
	
	
	
	
	
	
}
