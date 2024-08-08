package com.app.vehiclerent.service;

import java.util.List;

import com.app.vehiclerent.entity.CarFeature;

public interface CarFeatureService {
    List<CarFeature> getAllCarFeatures();

    CarFeature getCarFeatureById(Long id);

    CarFeature createCarFeature(CarFeature carFeature);

    CarFeature updateCarFeature(Long id, CarFeature carFeature);

    void deleteCarFeature(Long id);
}
