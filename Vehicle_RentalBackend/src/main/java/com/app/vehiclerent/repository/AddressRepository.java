package com.app.vehiclerent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.vehiclerent.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
	
}