package com.app.vehiclerent.serviceImpl;

<<<<<<< HEAD
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.concurrent.TimeUnit;
=======
import java.util.List;
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.vehiclerent.entity.Booking;
import com.app.vehiclerent.repository.BookingRepository;
import com.app.vehiclerent.service.BookingService;

<<<<<<< HEAD
import jakarta.transaction.Transactional;

=======
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking getBookingById(Long id) {
        return bookingRepository.findById(id).orElse(null);
    }

    @Override
    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Booking updateBooking(Long id, Booking booking) {
        if (!bookingRepository.existsById(id)) {
            return null;
        }
        booking.setBookingId(id);
        return bookingRepository.save(booking);
    }

    @Override
    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }
<<<<<<< HEAD
    
    @Override
    public List<Booking> getBookingsByCustomerId(Long customerId) {
        return bookingRepository.findByCustomerCustomerId(customerId);
    }
    
    // Calculate the rental days for a booking
    @Override
    public int calculateRentalDays(Booking booking) {
        LocalDateTime pickupDate = booking.getPickupDate();
        LocalDateTime returnDate = booking.getReturnDate();

        long diffInSeconds = returnDate.atZone(ZoneId.systemDefault()).toEpochSecond() - pickupDate.atZone(ZoneId.systemDefault()).toEpochSecond();
        return (int) TimeUnit.SECONDS.toDays(diffInSeconds);
    }
    
    @Override
    public double calculateTotalAmount(Booking booking) {
        int rentalDays = calculateRentalDays(booking); 
        double dailyRate = booking.getCar().getDailyRentalRate(); 
        double totalAmount = rentalDays * dailyRate;
        
        booking.setTotalAmount(totalAmount);

        return totalAmount;
    }
    
=======
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
}