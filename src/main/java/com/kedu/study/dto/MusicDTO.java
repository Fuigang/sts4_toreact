package com.kedu.study.dto;

public class MusicDTO {
	
	 private int id;
	   private String title;
	   private String singer;
	   
	   public MusicDTO() {   }
	   
	   public MusicDTO(int id, String title, String singer) {
	      super();
	      this.id = id;
	      this.title = title;
	      this.singer = singer;
	   }

	   public int getId() {
	      return id;
	   }

	   public void setId(int id) {
	      this.id = id;
	   }

	   public String getTitle() {
	      return title;
	   }

	   public void setTitle(String title) {
	      this.title = title;
	   }

	   public String getSinger() {
	      return singer;
	   }

	   public void setSinger(String singer) {
	      this.singer = singer;
	   }
	
}
