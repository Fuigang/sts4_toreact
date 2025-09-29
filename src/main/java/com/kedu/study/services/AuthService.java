package com.kedu.study.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedu.study.dao.AuthDAO;

@Service
public class AuthService {
		
	@Autowired
	public AuthDAO dao;	
}
