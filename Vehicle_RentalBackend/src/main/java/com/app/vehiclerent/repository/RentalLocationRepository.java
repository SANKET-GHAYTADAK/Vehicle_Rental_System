package com.app.vehiclerent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.vehiclerent.entity.RentalLocation;

@Repository
public interface RentalLocationRepository extends JpaRepository<RentalLocation, Long> {
	
}