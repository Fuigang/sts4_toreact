package com.kedu.study.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedu.study.dao.MusicDAO;
import com.kedu.study.dto.MusicDTO;

@Service
public class MusicService {
	
	@Autowired
	public MusicDAO dao;	
	
	public List<MusicDTO> selectAll(){
		 return dao.selectAll();
	}
	
	public  int insert(MusicDTO dto){
		return dao.insert(dto);
	}
	public int delete(int id) {
		return dao.delete(id);
	}
	
	public int update(MusicDTO dto) {
		return dao.update(dto);
	}
	
	public List<MusicDTO> searchByTitle(String title) {
		return dao.searchByTitle(title);
	}
}
