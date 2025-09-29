package com.kedu.study.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedu.study.dao.AuthDAO;
import com.kedu.study.dto.AuthDTO;

@Service
public class AuthService {
		
	@Autowired
	public AuthDAO dao;	
	
	
	
	public int insert(AuthDTO dto) {
		return dao.insert(dto);
	}
	
	public boolean Idcheck(AuthDTO dto) {
		int count = dao.IsUserExist(dto);
		return count > 0;
	}

	
	
	
	
}
