package com.app.vehiclerent.entity;

import java.time.LocalDate;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
=======
import java.util.List;

import jakarta.persistence.*;
import jakarta.persistence.OneToMany;
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a

@Entity
@Table
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long carId;

<<<<<<< HEAD
	private String model;
=======
	private String make;
	private String model;
	private int year;
	private String color;
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
	private String licensePlate;
	private double mileage;
	private String fuelType;
	private String transmissionType;
	private int seatingCapacity;
	private double dailyRentalRate;
	private boolean available;
	private LocalDate lastMaintenanceDate;
<<<<<<< HEAD
	private String carImageLink;

	@OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Booking> bookings;
	
	@OneToMany(mappedBy = "car", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CarImage> carImages = new ArrayList<>();
=======

	@OneToMany(mappedBy = "car")
	private List<Booking> bookings;

	@OneToMany(mappedBy = "car")
	private List<CarFeature> features;
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(Long carId, String make, String model, int year, String color, String licensePlate, double mileage,
			String fuelType, String transmissionType, int seatingCapacity, double dailyRentalRate, boolean available,
<<<<<<< HEAD
			LocalDate lastMaintenanceDate, List<Booking> bookings, String carImageLink) {
		super();
		this.carId = carId;
		this.model = model;
=======
			LocalDate lastMaintenanceDate, List<Booking> bookings, List<CarFeature> features) {
		super();
		this.carId = carId;
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
		this.licensePlate = licensePlate;
		this.mileage = mileage;
		this.fuelType = fuelType;
		this.transmissionType = transmissionType;
		this.seatingCapacity = seatingCapacity;
		this.dailyRentalRate = dailyRentalRate;
		this.available = available;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.bookings = bookings;
<<<<<<< HEAD
		this.carImageLink = carImageLink;
=======
		this.features = features;
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
	}

	public Long getCarId() {
		return carId;
	}

	public void setCarId(Long carId) {
		this.carId = carId;
	}

<<<<<<< HEAD
=======
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

<<<<<<< HEAD
=======
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getTransmissionType() {
		return transmissionType;
	}

	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public double getDailyRentalRate() {
		return dailyRentalRate;
	}

	public void setDailyRentalRate(double dailyRentalRate) {
		this.dailyRentalRate = dailyRentalRate;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public LocalDate getLastMaintenanceDate() {
		return lastMaintenanceDate;
	}

	public void setLastMaintenanceDate(LocalDate lastMaintenanceDate) {
		this.lastMaintenanceDate = lastMaintenanceDate;
	}
<<<<<<< HEAD
	
	public String getCarImageLink() {
		return carImageLink;
	}

	public void setCarImageLink(String carImageLink) {
		this.carImageLink = carImageLink;
	}

	public List<CarImage> getCarImages() {
		return carImages;
	}

	public void setCarImages(List<CarImage> carImages) {
		this.carImages = carImages;
	}
=======
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

<<<<<<< HEAD
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", model=" + model + ", licensePlate=" + licensePlate + ", mileage=" + mileage
				+ ", fuelType=" + fuelType + ", transmissionType=" + transmissionType + ", seatingCapacity="
				+ seatingCapacity + ", dailyRentalRate=" + dailyRentalRate + ", available=" + available
				+ ", lastMaintenanceDate=" + lastMaintenanceDate + ", carImageLink=" + carImageLink + ", bookings="
				+ bookings + ", carImages=" + carImages + "]";
=======
	public List<CarFeature> getFeatures() {
		return features;
	}

	public void setFeatures(List<CarFeature> features) {
		this.features = features;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", make=" + make + ", model=" + model + ", year=" + year + ", color=" + color
				+ ", licensePlate=" + licensePlate + ", mileage=" + mileage + ", fuelType=" + fuelType
				+ ", transmissionType=" + transmissionType + ", seatingCapacity=" + seatingCapacity
				+ ", dailyRentalRate=" + dailyRentalRate + ", available=" + available + ", lastMaintenanceDate="
				+ lastMaintenanceDate + ", bookings=" + bookings + ", features=" + features + "]";
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
	}

}
