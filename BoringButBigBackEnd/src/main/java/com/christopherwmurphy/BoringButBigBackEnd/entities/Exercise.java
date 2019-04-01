package com.christopherwmurphy.BoringButBigBackEnd.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.christopherwmurphy.BoringButBigBackEnd.utilities.Constants;


@Entity
@Table(name = "exercise")
public class Exercise {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "video_id", referencedColumnName = "id")
	private ExerciseVideos video;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "language")
	private String language;
	
	public Exercise() {
		this.id = 0;
		this.video = null;
		//this.exerciseSteps = null;
		this.name = Constants.EMPTY;
		this.language = Constants.EMPTY;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ExerciseVideos getVideo() {
		return video;
	}

	public void setVideo(ExerciseVideos vid) {
		this.video = vid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}
