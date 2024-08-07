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

import com.app.vehiclerent.entity.CarFeature;
import com.app.vehiclerent.service.CarFeatureService;

@RestController
@RequestMapping("/car-features")
public class CarFeatureController {

    @Autowired
    private CarFeatureService carFeatureService;

    @GetMapping
    public List<CarFeature> getAllCarFeatures() {
        return carFeatureService.getAllCarFeatures();
    }

    @GetMapping("/{id}")
    public CarFeature getCarFeatureById(@PathVariable Long id) {
        return carFeatureService.getCarFeatureById(id);
    }

    @PostMapping
    public CarFeature createCarFeature(@RequestBody CarFeature carFeature) {
        return carFeatureService.createCarFeature(carFeature);
    }

    @PutMapping("/{id}")
    public CarFeature updateCarFeature(@PathVariable Long id, @RequestBody CarFeature carFeature) {
        return carFeatureService.updateCarFeature(id, carFeature);
    }

    @DeleteMapping("/{id}")
    public void deleteCarFeature(@PathVariable Long id) {
        carFeatureService.deleteCarFeature(id);
    }
}
