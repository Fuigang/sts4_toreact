package com.kedu.study.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kedu.study.services.AuthService;

@RestController // 모든 전송방식이 ResponseBody임을 전제하에 
@RequestMapping("/auth")
public class AuthController {
		
	
	
	@Autowired
	public AuthService authService;
}
