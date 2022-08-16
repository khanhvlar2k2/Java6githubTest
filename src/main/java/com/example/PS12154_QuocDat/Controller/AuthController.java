package com.example.PS12154_QuocDat.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.PS12154_QuocDat.Service.UserService;

@Controller
public class AuthController {
    @RequestMapping("/auth/login/form")
    public String form(){
        return "auth/login";
    }
    
    @RequestMapping("/auth/login/success")
    public String success(Model model){
        model.addAttribute("message","Đăng Nhập Thành Công!");
        return "forward:/auth/login/form";
    }

    @RequestMapping("/auth/login/error")
    public String error(Model model){
        model.addAttribute("message","Sai thông tin đăng nhập!");
        return "forward:/auth/login/form";
    }

    @RequestMapping("/auth/logoff/success")
    public String logoff(Model model){
        model.addAttribute("message","Đăng Xuất Thành Công!");
        return "auth/login";
    }

  @RequestMapping("/auth/access/denied")
  public String denied(Model model){
    model.addAttribute("message","Bạn Không Có Quyền Truy Xuất!");
    return "auth/login";
  }

  /* 
  * OAuth2
  */
  @Autowired
  UserService userService;

  @RequestMapping("/oauth2/login/success")
  public String success(OAuth2AuthenticationToken oauth2){
      userService.loginFromOAuth2(oauth2);
      return "forward:/auth/login/success";
  }

}
