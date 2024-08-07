package com.app.vehiclerent.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.vehiclerent.entity.RentalLocation;
import com.app.vehiclerent.repository.RentalLocationRepository;
import com.app.vehiclerent.service.RentalLocationService;

@Service
public class RentalLocationServiceImpl implements RentalLocationService {

    @Autowired
    private RentalLocationRepository rentalLocationRepository;

    @Override
    public List<RentalLocation> getAllRentalLocations() {
        return rentalLocationRepository.findAll();
    }

    @Override
    public RentalLocation getRentalLocationById(Long id) {
        return rentalLocationRepository.findById(id).orElse(null);
    }

    @Override
    public RentalLocation createRentalLocation(RentalLocation rentalLocation) {
        return rentalLocationRepository.save(rentalLocation);
    }

    @Override
    public RentalLocation updateRentalLocation(Long id, RentalLocation rentalLocation) {
        if (!rentalLocationRepository.existsById(id)) {
            return null;
        }
        rentalLocation.setLocationId(id);
        return rentalLocationRepository.save(rentalLocation);
    }

    @Override
    public void deleteRentalLocation(Long id) {
        rentalLocationRepository.deleteById(id);
    }
}