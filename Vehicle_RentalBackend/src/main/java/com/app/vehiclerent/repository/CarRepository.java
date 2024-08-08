package com.app.vehiclerent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.vehiclerent.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
	
}