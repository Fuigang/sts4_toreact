package com.kedu.study.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kedu.study.dto.MusicDTO;
import com.kedu.study.services.MusicService;



@RestController // 모든 전송방식이 ResponseBody임을 전제하에 
@RequestMapping("/music")
public class MusicController {
	
	//Restful 통신
	//Rest (REpresentational State Transfer)
	//1.URL 상에 행동을 언급하지 않음 - > 오로지 자원만을 특정
	//2. 해당 주소에 대해 하고싶은 행동을 method로 지정한다. - GetMapping을 사용한다
	
	
	// c => s 데이터 전송 방식 3가지
	//1.Query Paramater : key=value& key=value 형태
	//2.JSON  : @RequestBody
	//3. PathVariable : @PathVariable 로 수신
	
	@Autowired
	private MusicService musicService;
	
	
	
	@GetMapping // http://10.5.5.5/music 실행 R [read]
	public ResponseEntity<List<MusicDTO>> getAll(String title){
		System.out.println("전달된 데이터 : " + title);
	
		if(title != null) {
			List<MusicDTO> list = musicService.searchByTitle(title);
			return ResponseEntity.ok(list);
			
		}
		else {
			List<MusicDTO> list = musicService.selectAll();
			return ResponseEntity.ok(list);
			
		}
		
		
		
		
	}
	
	
	
//	
	@PostMapping //C [create]
	ResponseEntity<Void> insert(@RequestBody MusicDTO dto){
		musicService.insert(dto);
		return ResponseEntity.ok().build();
	}

	@DeleteMapping("/{id}") //D [delete]
	public ResponseEntity<Void> delete(@PathVariable int id){
		musicService.delete(id);
		return ResponseEntity.ok().build();
	}
	
	
	@PutMapping("/{id}") // U [update]
	ResponseEntity<Void> update(@PathVariable int id,@RequestBody MusicDTO dto){
		musicService.update(dto);
		return ResponseEntity.ok().build();
	}
	
	
	
}
