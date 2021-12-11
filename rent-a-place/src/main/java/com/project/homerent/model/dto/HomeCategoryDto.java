package com.project.homerent.model.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HomeCategoryDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "homecategorydto_id")
	private Long id;

	private String homeCategoryTitle;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHomeCategoryTitle() {
		return homeCategoryTitle;
	}

	public void setHomeCategoryTitle(String homeCategoryTitle) {
		this.homeCategoryTitle = homeCategoryTitle;
	}
}
