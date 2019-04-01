package com.christopherwmurphy.BoringButBigBackEnd.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.christopherwmurphy.BoringButBigBackEnd.utilities.Constants;

@Entity
@Table(name = "exercise_videos")
public class ExerciseVideos {

	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="video_url")
	private String video_url;
	
	public ExerciseVideos() {
		this.id = 0;
		this.video_url = Constants.EMPTY;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVideo_url() {
		return video_url;
	}

	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}
	
}
