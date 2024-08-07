package com.app.vehiclerent.service;

import java.util.List;

import com.app.vehiclerent.entity.RentalLocation;

public interface RentalLocationService {
    List<RentalLocation> getAllRentalLocations();

    RentalLocation getRentalLocationById(Long id);

    RentalLocation createRentalLocation(RentalLocation rentalLocation);

    RentalLocation updateRentalLocation(Long id, RentalLocation rentalLocation);

    void deleteRentalLocation(Long id);
}
