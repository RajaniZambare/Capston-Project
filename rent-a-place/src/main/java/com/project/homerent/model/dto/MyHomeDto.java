package com.project.homerent.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.project.homerent.model.enums.Events;
import com.project.homerent.model.enums.Pets;
import com.project.homerent.model.enums.Smoking;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


public class MyHomeDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long ownerId;
    private String ownerUsername;

    private List<ReservationDto> reservations;

    @JsonFormat(pattern="yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date openBooking;

    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date closeBooking;

    @Enumerated(EnumType.STRING)
    private Smoking smoking;

    @Enumerated(EnumType.STRING)
    private Pets pets;

    @Enumerated(EnumType.STRING)
    private Events events;

    @Lob
    private Byte[] image;

    private double price;

    private String address;

    private String latitude;

    private String longitude;

    private HomeCategoryDto homeCategory;

    private String description;

    private Integer squareMeters;

    private double overnightPrice;

    private double extraPersonPrice;

    private Integer maxPeople;

    private Integer minOvernights;

    private Integer beds;

    private Integer bathrooms;

    private Integer bedrooms;

    private String transport;

    private String neighborhood;

    private String houseRules;

    private boolean elevator;

    private boolean heating;

    private boolean kitchen;

    private boolean parking;

    private boolean tv;

    private boolean wifi;

    private boolean ac;

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

	public List<ReservationDto> getReservations() {
		return reservations;
	}

	public void setReservations(List<ReservationDto> reservations) {
		this.reservations = reservations;
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

	public Smoking getSmoking() {
		return smoking;
	}

	public void setSmoking(Smoking smoking) {
		this.smoking = smoking;
	}

	public Pets getPets() {
		return pets;
	}

	public void setPets(Pets pets) {
		this.pets = pets;
	}

	public Events getEvents() {
		return events;
	}

	public void setEvents(Events events) {
		this.events = events;
	}

	public Byte[] getImage() {
		return image;
	}

	public void setImage(Byte[] image) {
		this.image = image;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
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

	public HomeCategoryDto getHomeCategory() {
		return homeCategory;
	}

	public void setHomeCategory(HomeCategoryDto homeCategory) {
		this.homeCategory = homeCategory;
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

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getHouseRules() {
		return houseRules;
	}

	public void setHouseRules(String houseRules) {
		this.houseRules = houseRules;
	}

	public boolean isElevator() {
		return elevator;
	}

	public void setElevator(boolean elevator) {
		this.elevator = elevator;
	}

	public boolean isHeating() {
		return heating;
	}

	public void setHeating(boolean heating) {
		this.heating = heating;
	}

	public boolean isKitchen() {
		return kitchen;
	}

	public void setKitchen(boolean kitchen) {
		this.kitchen = kitchen;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public boolean isTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

}