package com.example.PS12154_QuocDat.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    // @Autowired
    // HttpServletRequest request;

    @RequestMapping("/home/index")
    public String index(Model model) {
        model.addAttribute("message", "This is Home Page");
        return "home/index";
    }

    @RequestMapping("/home/about")
    public String about(Model model) {
        model.addAttribute("message", "This is About Page");
        return "home/index";
    }

    // @PreAuthorize("hasRole('ADMIN')") //security bằng anno
    @RequestMapping("/home/admins")
    public String admins(Model model) {
        
        // if(!request.isUserInRole("ADMIN")){           // security tự định nghĩa
        // return "redirect:/auth/access/denied";
        // }

        model.addAttribute("message", "Chào Admin!");
        return "home/index";
    }

    // @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @RequestMapping("/home/users")
    public String users(Model model) {

         // if(!request.isUserInRole("ADMIN") || !request.isUserInRole("USERS")){       
        // return "redirect:/auth/access/denied";
        // }

        model.addAttribute("message", "Chào User!");
        return "home/index";
    }

    // @PreAuthorize("isAuthenticated()")
    @RequestMapping("/home/authenticated")
    public String authenticated(Model model) {
        // if(!request.getRemoteUser() == null){      //nếu chưa đăng nhập thì trả về form login
        //     return "redirect:/auth/login/form";
        // }
        model.addAttribute("message", "Chào authenticated user!");
        return "home/index";
    }

    @RequestMapping("/home/thymeleaf1")
    public String thymeleaf1(Model model) {
        model.addAttribute("message","Thymeleaf-Without Extras");
        return "home/thymeleaf1";
    }

    @RequestMapping("/home/thymeleaf2")
    public String thymeleaf2(Model model) {
        model.addAttribute("message","Thymeleaf-With Extras");
        return "home/thymeleaf2";
    }
}
