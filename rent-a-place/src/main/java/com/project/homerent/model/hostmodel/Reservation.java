package com.project.homerent.model.hostmodel;

import com.project.homerent.model.usermodel.User;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="reservation")
public class Reservation {
    @Id
    @Column(name = "reservation_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="myhome_id", nullable = false)
    private MyHome bookedHome;

    @Column(name = "booked_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date bookedDate;

    @Column(name = "leave_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date leaveDate;

    @Column(name = "booked")
    private int booked;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="user_id", nullable = false)
    private User userBooked;

    @Column(name = "host_review_stars")
    private Integer hostReviewStars;

    @Column(name = "host_review_description")
    private String hostReviewDescription;

    @Column(name = "home_review_stars")
    private Integer homeReviewStars;

    @Column(name = "home_review_description")
    private String homeReviewDescription;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public MyHome getBookedHome() {
		return bookedHome;
	}

	public void setBookedHome(MyHome bookedHome) {
		this.bookedHome = bookedHome;
	}

	public Date getBookedDate() {
		return bookedDate;
	}

	public void setBookedDate(Date bookedDate) {
		this.bookedDate = bookedDate;
	}

	public Date getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}

	public int getBooked() {
		return booked;
	}

	public void setBooked(int booked) {
		this.booked = booked;
	}

	public User getUserBooked() {
		return userBooked;
	}

	public void setUserBooked(User userBooked) {
		this.userBooked = userBooked;
	}

	public Integer getHostReviewStars() {
		return hostReviewStars;
	}

	public void setHostReviewStars(Integer hostReviewStars) {
		this.hostReviewStars = hostReviewStars;
	}

	public String getHostReviewDescription() {
		return hostReviewDescription;
	}

	public void setHostReviewDescription(String hostReviewDescription) {
		this.hostReviewDescription = hostReviewDescription;
	}

	public Integer getHomeReviewStars() {
		return homeReviewStars;
	}

	public void setHomeReviewStars(Integer homeReviewStars) {
		this.homeReviewStars = homeReviewStars;
	}

	public String getHomeReviewDescription() {
		return homeReviewDescription;
	}

	public void setHomeReviewDescription(String homeReviewDescription) {
		this.homeReviewDescription = homeReviewDescription;
	}
    
}
