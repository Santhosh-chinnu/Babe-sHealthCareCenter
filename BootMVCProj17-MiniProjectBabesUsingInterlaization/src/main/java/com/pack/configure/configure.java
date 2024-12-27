package com.pack.configure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

public class configure implements WebMvcConfigurer{
	
	@Autowired
	private LocaleChangeInterceptor interceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	registry.addInterceptor(interceptor);
	}	

   
}
