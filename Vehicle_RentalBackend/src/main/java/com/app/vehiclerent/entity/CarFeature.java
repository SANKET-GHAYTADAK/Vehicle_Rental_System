package com.app.vehiclerent.entity;

import jakarta.persistence.*;

@Entity
@Table
public class CarFeature {
    public CarFeature() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long featureId;
    
    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;
    
    private String featureName;

	public CarFeature(Long featureId, Car car, String featureName) {
		super();
		this.featureId = featureId;
		this.car = car;
		this.featureName = featureName;
	}

	public Long getFeatureId() {
		return featureId;
	}

	public void setFeatureId(Long featureId) {
		this.featureId = featureId;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	@Override
	public String toString() {
		return "CarFeature [featureId=" + featureId + ", car=" + car + ", featureName=" + featureName + "]";
	}
    
}


