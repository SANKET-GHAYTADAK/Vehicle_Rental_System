package com.app.vehiclerent.repository;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.vehiclerent.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
<<<<<<< HEAD
	Customer findByEmail(String email);
	List<Customer> findByRole(String role);
=======
	
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
}