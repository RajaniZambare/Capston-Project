package com.project.homerent.model.hostmodel;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.project.homerent.model.enums.Events;
import com.project.homerent.model.enums.Pets;
import com.project.homerent.model.enums.Smoking;
import com.project.homerent.model.usermodel.User;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
public class MyHome {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "myhomeid", nullable = false)
    private long id;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name ="owner_id", nullable = false)
    private User owner;

    @Lob
    private Byte[] image;

    @Column(name = "rule_smoking")
    @Enumerated(EnumType.STRING)
    private Smoking smoking;

    @Column(name = "rule_pets")
    @Enumerated(EnumType.STRING)
    private Pets pets;

    @Column(name = "rule_events")
    @Enumerated(EnumType.STRING)
    private Events events;

    @Column(name = "open_booking", nullable = false)
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date openBooking;

    @Column(name = "close_booking", nullable = false)
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date closeBooking;

    @OneToMany(mappedBy = "bookedHome", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Reservation> reservations;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "myhome_address", nullable = false)
    private String address;

    @Column(name = "myhome_address_latitude", nullable = false)
    private String latitude;

    @Column(name = "myhome_address_longitude", nullable = false)
    private String longitude;

    @ManyToOne
    @JoinColumn(name ="homecategory_id")
    private HomeCategory homeCategory;

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

    // Amenities
    private boolean ac;

    private boolean elevator;

    private boolean heating;

    private boolean kitchen;

    private boolean parking;

    private boolean tv;

    private boolean wifi;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public Byte[] getImage() {
		return image;
	}

	public void setImage(Byte[] image) {
		this.image = image;
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

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
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

	public HomeCategory getHomeCategory() {
		return homeCategory;
	}

	public void setHomeCategory(HomeCategory homeCategory) {
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

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
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
}