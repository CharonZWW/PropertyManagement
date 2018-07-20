package com.wsw.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wsw.pms.service.TestService;

@Controller
public class TestController {
    
	@Autowired
	private TestService service;
	
	@RequestMapping("/test.action")
	public String test(){
		
		System.out.println("成功");
		service.test();
		return "index.jsp";
		
		
	}
	
}
