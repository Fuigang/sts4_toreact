package com.kedu.study.dao;



import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kedu.study.dto.AuthDTO;

@Repository
public class AuthDAO {
	
	
	@Autowired
	private SqlSession mybatis;
	
	
	public int insert(AuthDTO dto) {
		return mybatis.insert("Auto.insert");
	}
	
	public int IsUserExist(AuthDTO dto) {
		
		return mybatis.selectOne("Auth.IsUserExist",dto);
		
	}
	
}
