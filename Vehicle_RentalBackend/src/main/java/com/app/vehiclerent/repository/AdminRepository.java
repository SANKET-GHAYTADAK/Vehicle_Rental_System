package com.app.vehiclerent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.vehiclerent.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
		
}