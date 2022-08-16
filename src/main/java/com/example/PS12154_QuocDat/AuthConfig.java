package com.example.PS12154_QuocDat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.client.endpoint.DefaultAuthorizationCodeTokenResponseClient;
import org.springframework.security.oauth2.client.endpoint.OAuth2AccessTokenResponseClient;
import org.springframework.security.oauth2.client.endpoint.OAuth2AuthorizationCodeGrantRequest;
import org.springframework.security.oauth2.client.web.AuthorizationRequestRepository;
import org.springframework.security.oauth2.client.web.HttpSessionOAuth2AuthorizationRequestRepository;
import org.springframework.security.oauth2.core.endpoint.OAuth2AuthorizationRequest;

import com.example.PS12154_QuocDat.Service.UserService;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class AuthConfig extends WebSecurityConfigurerAdapter {
    // mã hóa mật khẩu
    @Bean
    public BCryptPasswordEncoder getBCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public AuthorizationRequestRepository<OAuth2AuthorizationRequest> getRepository(){
        return new HttpSessionOAuth2AuthorizationRequestRepository();
    }
    @Bean
    public OAuth2AccessTokenResponseClient<OAuth2AuthorizationCodeGrantRequest> getToken(){
        return new DefaultAuthorizationCodeTokenResponseClient();
    }

    // quản lý dữ liệu người dùng
    @Autowired
    UserService userService;
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
         auth.userDetailsService(userService);
    }

    // Phân quyền sử dụng và hình thức đăng nhập
    @Override
    protected void configure(HttpSecurity http) throws Exception {
              //CSRF,CORS
              http.csrf().disable().cors().disable();

              // phân quyền sử dụng
              http.authorizeRequests()
              
              .antMatchers("/home/admins").hasRole("ADMIN")  
              .antMatchers("/home/users").hasAnyRole("ADMIN","USER")
              .antMatchers("/home/authenticated").authenticated().anyRequest().permitAll();

              http.exceptionHandling().accessDeniedPage("/auth/access/denied");
              http.formLogin()
              .loginPage("/auth/login/form")
              .loginProcessingUrl("/auth/login") //login
              .defaultSuccessUrl("/auth/login/success",false)
              .failureUrl("/auth/login/error")
              .usernameParameter("username")
              .passwordParameter("password");
              http.rememberMe().rememberMeParameter("remember");
      
              //đăng xuất
              http.logout()
              .logoutUrl("/auth/logoff")
              .logoutSuccessUrl("/auth/logoff/success");

               //OAuth2 - đăng nhập từ mạng xã hội
               http.oauth2Login()
               .loginPage("/auth/login/form")
               .defaultSuccessUrl("/oauth2/login/success", true)
               .failureUrl("/auth/login/error")
               .authorizationEndpoint()
               .baseUri("/oauth2/authorization");
            //    .authorizationRequestRepository(getRepository())
            //    .and().tokenEndpoint()
            //    .accessTokenResponseClient(getToken());
}
          }   

   
