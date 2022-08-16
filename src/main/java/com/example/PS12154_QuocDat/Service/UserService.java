package com.example.PS12154_QuocDat.Service;

import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Service;

import com.example.PS12154_QuocDat.DAO.EmployeeDAO;
import com.example.PS12154_QuocDat.Model.Employee;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    EmployeeDAO employeeDAO;
    @Autowired
    BCryptPasswordEncoder pe;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            System.out.println(username);   
            Employee employee = employeeDAO.findById(username).get();
            // tạo UserDetails từ Employee      
            String password = employee.getPassword();
            System.out.println(password);   
            String[] roles = employee.getEmployeerole().stream()
                                     .map(au -> au.getRole().getId())
                                     .collect(Collectors.toList()).toArray(new String[0]);
            return User.withUsername(username)
                       .password(pe.encode(password))
                        .roles(roles).build();
        } catch (Exception e) {
            throw new UsernameNotFoundException(username + " not found!");
        }
    }

    public void loginFromOAuth2(OAuth2AuthenticationToken oauth2) {
  
            String email = oauth2.getPrincipal().getAttribute("name");
            System.out.println(email);
            String password = Long.toHexString(System.currentTimeMillis());
            UserDetails user = User.withUsername(email)
                .password(pe.encode(password)).roles("GUEST").build();
            Authentication auth = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(auth);
  
    }

}
