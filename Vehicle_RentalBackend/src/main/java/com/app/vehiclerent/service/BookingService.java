package com.app.vehiclerent.service;

import java.util.List;

import com.app.vehiclerent.entity.Booking;

public interface BookingService {
    List<Booking> getAllBookings();

    Booking getBookingById(Long id);

    Booking createBooking(Booking booking);

    Booking updateBooking(Long id, Booking booking);

    void deleteBooking(Long id);
<<<<<<< HEAD
    
    List<Booking> getBookingsByCustomerId(Long customerId);
    
    int calculateRentalDays(Booking booking);
    
    double calculateTotalAmount(Booking booking);
=======
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
}
