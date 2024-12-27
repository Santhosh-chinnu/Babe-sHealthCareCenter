package com.pack.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pack.entity.Babes;
import com.pack.service.IBabeServiceMgmt;

@Controller
public class BabesControllerOpeartion {
	
	@Autowired
	private IBabeServiceMgmt bservice;
	
	@RequestMapping("/")
	public String ShowHome() {
		return"welcome";
	}
	@RequestMapping("/register")
	public  String registrationFormPage(@ModelAttribute("babe")Babes babe) {
		return"babe_registration";
	}
	@PostMapping("/register")
	public String registerBabes(RedirectAttributes attrs,@ModelAttribute("babe")Babes babe) {
		String msg=bservice.registerBabes(babe);
		attrs.addFlashAttribute("resultMsg",msg);
		return "report";
	}
	@GetMapping("/report")
	public   String ShowCourierData(@PageableDefault(page = 0,size = 5,sort = "name",direction = Sort.Direction.ASC)Pageable page,Map<String, Object>map) {
	Page<Babes> pg=bservice.getBabesReportByDataBypage(page);
	map.put("cdata", pg);
	return "report";
	}
	 @GetMapping("/edit")
	    public String showEditFormPage(@RequestParam("no") int no,
	    		                                                      @ModelAttribute("babe") Babes babe) {
		 Babes bae=bservice.getBabesByid(no);
		  BeanUtils.copyProperties(bae, babe);
	    	return "babe_edit";	
	}
	 @PostMapping("/edit")
	 public String ShowEditSavebabes(@ModelAttribute("babe") Babes babe,RedirectAttributes attrs) {
		 String msg=bservice.saveEditBabes(babe);
		 attrs.addFlashAttribute("resultMsg",msg);
		 return "report"; 
	 }
	 @GetMapping("/delete")
	public String deleteByIdBabes(RedirectAttributes attrs,
			                                                                                 @RequestParam int no) {
	String	msg=bservice.deleteBabes(no);
	attrs.addFlashAttribute("resultMsg",msg);
	return"report";
		
	}
	 @RequestMapping("/login")
		public  String loginFormPage(@ModelAttribute("babe") Babes babe) {
			return"babe_login";
	 }

	 @GetMapping("/login")
	public String LoginBabe(@RequestParam int bid,
			                                                          @ModelAttribute("babe") Babes babe,RedirectAttributes attrs) {
		Babes  id= bservice.getBabesByid(bid);
		 attrs.addFlashAttribute("cdata", id);
		return"login_report";
	}

}
