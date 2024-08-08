package com.app.vehiclerent.entity;

import java.time.LocalDate;
import java.util.List;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
=======
import jakarta.persistence.*;
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a

@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    
    private String firstName;
    private String lastName;
<<<<<<< HEAD
    @Column(unique = true)
    private String email;
    private String role;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private String licenseNumber;
    private String username;
    private String password;
    private boolean loggedIn;
    
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Booking> bookings;
    
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Address> addresses;
    
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Feedback> feedbacks;

	public Customer() {
//		super();
	}

	public Customer(Long customerId, String firstName, String lastName, String email, String phoneNumber,
			LocalDate dateOfBirth, String licenseNumber, String username, String password, boolean loggedIn,
			List<Booking> bookings, List<Address> addresses, List<Feedback> feedbacks) {
=======
    private String email;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private String licenseNumber;
    private String membershipStatus;
    
    @OneToMany(mappedBy = "customer")
    private List<Booking> bookings;
    
    @OneToMany(mappedBy = "customer")
    private List<Address> addresses;
    
    @OneToMany(mappedBy = "customer")
    private List<Feedback> feedbacks;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Long customerId, String firstName, String lastName, String email, String phoneNumber,
			LocalDate dateOfBirth, String licenseNumber, String membershipStatus, List<Booking> bookings,
			List<Address> addresses, List<Feedback> feedbacks) {
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.licenseNumber = licenseNumber;
<<<<<<< HEAD
		this.username = username;
		this.password = password;
		this.loggedIn = loggedIn;
=======
		this.membershipStatus = membershipStatus;
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
		this.bookings = bookings;
		this.addresses = addresses;
		this.feedbacks = feedbacks;
	}

<<<<<<< HEAD


=======
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
<<<<<<< HEAD
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
=======
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

<<<<<<< HEAD
=======
	public String getMembershipStatus() {
		return membershipStatus;
	}

	public void setMembershipStatus(String membershipStatus) {
		this.membershipStatus = membershipStatus;
	}

>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Feedback> getFeedbacks() {
		return feedbacks;
	}

	public void setFeedbacks(List<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}
<<<<<<< HEAD
	
	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
=======
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
    
}


