package com.app.vehiclerent.entity;

import jakarta.persistence.*;

@Entity
@Table
public class RentalLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long locationId;
    
    private String name;
    private String address;
	public RentalLocation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RentalLocation(Long locationId, String name, String address) {
		super();
		this.locationId = locationId;
		this.name = name;
		this.address = address;
	}
	public Long getLocationId() {
		return locationId;
	}
	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    
}


