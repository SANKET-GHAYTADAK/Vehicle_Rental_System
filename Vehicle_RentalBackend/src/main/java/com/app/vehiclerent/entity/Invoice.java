package com.app.vehiclerent.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long invoiceId;
    
    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;
    
    private LocalDate invoiceDate;
    private LocalDate dueDate;
    private double totalAmount;
    private String status;
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Invoice(Long invoiceId, Booking booking, LocalDate invoiceDate, LocalDate dueDate, double totalAmount,
			String status) {
		super();
		this.invoiceId = invoiceId;
		this.booking = booking;
		this.invoiceDate = invoiceDate;
		this.dueDate = dueDate;
		this.totalAmount = totalAmount;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", booking=" + booking + ", invoiceDate=" + invoiceDate
				+ ", dueDate=" + dueDate + ", totalAmount=" + totalAmount + ", status=" + status + "]";
	}
	public Long getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}


