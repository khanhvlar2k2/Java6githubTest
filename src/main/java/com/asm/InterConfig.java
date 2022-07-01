package com.asm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.asm.interceptor.LoggerInterceptor;
import com.asm.interceptor.SecurityInterceptor;



@Configuration
public class InterConfig implements WebMvcConfigurer{

	@Autowired
	LoggerInterceptor interceptor;
	
	@Autowired
	SecurityInterceptor auth;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor)
			.addPathPatterns("/**")
			.excludePathPatterns("/assets/**");
		
		
		registry.addInterceptor(auth)
			.addPathPatterns("/admin/**","/cart/**")
			.excludePathPatterns("/login", "/index");
		
	}
}