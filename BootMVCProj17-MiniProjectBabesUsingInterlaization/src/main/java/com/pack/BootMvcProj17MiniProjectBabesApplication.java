package com.pack;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class BootMvcProj17MiniProjectBabesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj17MiniProjectBabesApplication.class, args);
	}
	
   public SessionLocaleResolver createSLResolver() {
	   SessionLocaleResolver resolver=new SessionLocaleResolver();
	   resolver.setDefaultLocale(new Locale("en","US"));
	   return resolver;
   }
   @Bean
	public LocaleChangeInterceptor createLCInterceptor() {
		LocaleChangeInterceptor lci=new LocaleChangeInterceptor();
		lci.setParamName("lang");
		return lci;
	}
	
	
}
