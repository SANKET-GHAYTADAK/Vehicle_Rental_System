package com.app.vehiclerent.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;
    
    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;
    
    private LocalDateTime paymentDate;
    private double amount;
    private String paymentMethod;
    public Payment(Long paymentId, Booking booking, LocalDateTime paymentDate, double amount, String paymentMethod,
			String transactionId) {
		super();
		this.paymentId = paymentId;
		this.booking = booking;
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.transactionId = transactionId;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", booking=" + booking + ", paymentDate=" + paymentDate + ", amount="
				+ amount + ", paymentMethod=" + paymentMethod + ", transactionId=" + transactionId + "]";
	}
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String transactionId;
    
}

