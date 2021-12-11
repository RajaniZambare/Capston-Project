package com.project.homerent.model.hostmodel;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reviews {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

    
	long totalReviews;
    double average;
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public long getTotalReviews() {
		return totalReviews;
	}
	public void setTotalReviews(long totalReviews) {
		this.totalReviews = totalReviews;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
}
