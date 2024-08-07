package com.app.vehiclerent.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedbackId;
    
    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;
    
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    
    private int rating;
    private String comments;
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Feedback(Long feedbackId, Booking booking, Customer customer, int rating, String comments) {
		super();
		this.feedbackId = feedbackId;
		this.booking = booking;
		this.customer = customer;
		this.rating = rating;
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", booking=" + booking + ", customer=" + customer + ", rating="
				+ rating + ", comments=" + comments + "]";
	}
	public Long getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(Long feedbackId) {
		this.feedbackId = feedbackId;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
    
}


