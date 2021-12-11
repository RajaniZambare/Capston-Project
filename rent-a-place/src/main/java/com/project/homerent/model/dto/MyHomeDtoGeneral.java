package com.project.homerent.model.dto;


import javax.persistence.*;
import java.util.Date;

public class MyHomeDtoGeneral {
    private long id;
    private long ownerId;
    private String ownerUsername;

    @Temporal(TemporalType.DATE)
    private Date openBooking;

    @Temporal(TemporalType.DATE)
    private Date closeBooking;

    private int price;

    private String address;

    private String latitude;

    private String longitude;

    private String description;

    private Integer squareMeters;

    private double overnightPrice;

    private double extraPersonPrice;

    private Integer maxPeople;

    private Integer minOvernights;

    private Integer beds;

    private Integer bathrooms;

    private Integer bedrooms;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerUsername() {
		return ownerUsername;
	}

	public void setOwnerUsername(String ownerUsername) {
		this.ownerUsername = ownerUsername;
	}

	public Date getOpenBooking() {
		return openBooking;
	}

	public void setOpenBooking(Date openBooking) {
		this.openBooking = openBooking;
	}

	public Date getCloseBooking() {
		return closeBooking;
	}

	public void setCloseBooking(Date closeBooking) {
		this.closeBooking = closeBooking;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getSquareMeters() {
		return squareMeters;
	}

	public void setSquareMeters(Integer squareMeters) {
		this.squareMeters = squareMeters;
	}

	public double getOvernightPrice() {
		return overnightPrice;
	}

	public void setOvernightPrice(double overnightPrice) {
		this.overnightPrice = overnightPrice;
	}

	public double getExtraPersonPrice() {
		return extraPersonPrice;
	}

	public void setExtraPersonPrice(double extraPersonPrice) {
		this.extraPersonPrice = extraPersonPrice;
	}

	public Integer getMaxPeople() {
		return maxPeople;
	}

	public void setMaxPeople(Integer maxPeople) {
		this.maxPeople = maxPeople;
	}

	public Integer getMinOvernights() {
		return minOvernights;
	}

	public void setMinOvernights(Integer minOvernights) {
		this.minOvernights = minOvernights;
	}

	public Integer getBeds() {
		return beds;
	}

	public void setBeds(Integer beds) {
		this.beds = beds;
	}

	public Integer getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(Integer bathrooms) {
		this.bathrooms = bathrooms;
	}

	public Integer getBedrooms() {
		return bedrooms;
	}

	public void setBedrooms(Integer bedrooms) {
		this.bedrooms = bedrooms;
	}

}