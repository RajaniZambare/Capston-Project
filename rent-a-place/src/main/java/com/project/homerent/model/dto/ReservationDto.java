package com.project.homerent.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;


import javax.persistence.*;
import java.util.Date;

public class ReservationDto {

    private long reservationId;

    private long bookedHomeId;

    @JsonFormat(pattern="yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date bookedDate;

    @JsonFormat(pattern="yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date leaveDate;

    int isBooked;

    private long userIdBooked;
    private String userNameBooked;

    int hostReviewStars;

    String hostReviewDescription;

    int homeReviewStars;

    String homeReviewDescription;

	public long getReservationId() {
		return reservationId;
	}

	public void setReservationId(long reservationId) {
		this.reservationId = reservationId;
	}

	public long getBookedHomeId() {
		return bookedHomeId;
	}

	public void setBookedHomeId(long bookedHomeId) {
		this.bookedHomeId = bookedHomeId;
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

	public int getIsBooked() {
		return isBooked;
	}

	public void setIsBooked(int isBooked) {
		this.isBooked = isBooked;
	}

	public long getUserIdBooked() {
		return userIdBooked;
	}

	public void setUserIdBooked(long userIdBooked) {
		this.userIdBooked = userIdBooked;
	}

	public String getUserNameBooked() {
		return userNameBooked;
	}

	public void setUserNameBooked(String userNameBooked) {
		this.userNameBooked = userNameBooked;
	}

	public int getHostReviewStars() {
		return hostReviewStars;
	}

	public void setHostReviewStars(int hostReviewStars) {
		this.hostReviewStars = hostReviewStars;
	}

	public String getHostReviewDescription() {
		return hostReviewDescription;
	}

	public void setHostReviewDescription(String hostReviewDescription) {
		this.hostReviewDescription = hostReviewDescription;
	}

	public int getHomeReviewStars() {
		return homeReviewStars;
	}

	public void setHomeReviewStars(int homeReviewStars) {
		this.homeReviewStars = homeReviewStars;
	}

	public String getHomeReviewDescription() {
		return homeReviewDescription;
	}

	public void setHomeReviewDescription(String homeReviewDescription) {
		this.homeReviewDescription = homeReviewDescription;
	}
}
