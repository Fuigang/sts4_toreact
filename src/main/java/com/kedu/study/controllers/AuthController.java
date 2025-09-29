package com.kedu.study.controllers;

import java.security.Provider.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kedu.study.dto.AuthDTO;
import com.kedu.study.services.AuthService;

@RestController // 모든 전송방식이 ResponseBody임을 전제하에 
@RequestMapping("/auth")
public class AuthController {
		
	
	
	@Autowired
	public AuthService authService;
	
	
	
	@PostMapping //C [create]
	public ResponseEntity<Void> insert(@RequestBody AuthDTO dto){
		authService.insert(dto);
		return ResponseEntity.ok().build();
	}
	
	@PostMapping("/check")
	public ResponseEntity<Boolean> idCheck(@RequestBody AuthDTO dto){
		boolean isExist = authService.Idcheck(dto);
		return new ResponseEntity<>(isExist, HttpStatus.OK);
		
	}
	
	
}


