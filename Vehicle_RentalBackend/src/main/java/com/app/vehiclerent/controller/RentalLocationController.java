package com.app.vehiclerent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.vehiclerent.entity.RentalLocation;
import com.app.vehiclerent.service.RentalLocationService;

@RestController
@RequestMapping("/rental-locations")
public class RentalLocationController {

    @Autowired
    private RentalLocationService rentalLocationService;

    @GetMapping
    public List<RentalLocation> getAllRentalLocations() {
        return rentalLocationService.getAllRentalLocations();
    }

    @GetMapping("/{id}")
    public RentalLocation getRentalLocationById(@PathVariable Long id) {
        return rentalLocationService.getRentalLocationById(id);
    }

    @PostMapping
    public RentalLocation createRentalLocation(@RequestBody RentalLocation rentalLocation) {
        return rentalLocationService.createRentalLocation(rentalLocation);
    }

    @PutMapping("/{id}")
    public RentalLocation updateRentalLocation(@PathVariable Long id, @RequestBody RentalLocation rentalLocation) {
        return rentalLocationService.updateRentalLocation(id, rentalLocation);
    }

    @DeleteMapping("/{id}")
    public void deleteRentalLocation(@PathVariable Long id) {
        rentalLocationService.deleteRentalLocation(id);
    }
}
