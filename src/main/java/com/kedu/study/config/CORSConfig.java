package com.kedu.study.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration // 아래 이 친구가 서비스도 아닌 컨트롤러도 아닌 설정이니 config로 설정
public class CORSConfig implements WebMvcConfigurer {
	
	
	@Override
	public void addCorsMappings ( CorsRegistry registry) {
		registry.addMapping("/**") // 이 서버안에 어떠한 리퀘스트 맵핑에 대하여
		.allowedOrigins("*")	// 모든 출처를 수락하겠다.
		.allowedMethods("*")	// 모든 요청을 수락하겠다. 
		.allowedHeaders("*"); 	// 모든 요청 헤더에 대해 전부 허가 하겠다.
	}
}
