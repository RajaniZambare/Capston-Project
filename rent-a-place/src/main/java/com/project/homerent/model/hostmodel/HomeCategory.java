package com.project.homerent.model.hostmodel;

import javax.persistence.*;
import java.util.List;

@Entity
public class HomeCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "homecategory_id")
    private long id;

    @Column(name = "homecategory_title", nullable = false)
    private String homeCategoryTitle;

    @OneToMany
    private List<MyHome> myHomes;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHomeCategoryTitle() {
		return homeCategoryTitle;
	}

	public void setHomeCategoryTitle(String homeCategoryTitle) {
		this.homeCategoryTitle = homeCategoryTitle;
	}

	public List<MyHome> getMyHomes() {
		return myHomes;
	}

	public void setMyHomes(List<MyHome> myHomes) {
		this.myHomes = myHomes;
	}
}