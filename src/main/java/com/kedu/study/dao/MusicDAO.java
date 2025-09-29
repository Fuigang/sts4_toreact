package com.kedu.study.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kedu.study.dto.MusicDTO;

@Repository
public class MusicDAO {
	
	@Autowired
	private SqlSession mybatis;
	
	public List<MusicDTO> selectAll(){
		return mybatis.selectList("Music.selectAll");
	}
	
	public int insert(MusicDTO dto) {
		return mybatis.insert("Music.insert",dto);
	}
	
	public int delete(int id) {
		return mybatis.delete("Music.delete",id);
	}
	
	public int update(MusicDTO dto) {
		return mybatis.update("Music.update",dto);
	}
	
	public List<MusicDTO> searchByTitle(String title){
		return mybatis.selectList("Music.searchByTitle",title);
	}
}
