package com.app.vehiclerent.repository;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.vehiclerent.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
<<<<<<< HEAD
	List<Booking> findByCustomerCustomerId(Long customerId);
=======
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
}
