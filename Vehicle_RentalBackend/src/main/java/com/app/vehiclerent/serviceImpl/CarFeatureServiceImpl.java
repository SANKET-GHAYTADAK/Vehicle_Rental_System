package com.app.vehiclerent.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.vehiclerent.entity.CarFeature;
import com.app.vehiclerent.repository.CarFeatureRepository;
import com.app.vehiclerent.service.CarFeatureService;

@Service
public class CarFeatureServiceImpl implements CarFeatureService {

    @Autowired
    private CarFeatureRepository carFeatureRepository;

    @Override
    public List<CarFeature> getAllCarFeatures() {
        return carFeatureRepository.findAll();
    }

    @Override
    public CarFeature getCarFeatureById(Long id) {
        return carFeatureRepository.findById(id).orElse(null);
    }

    @Override
    public CarFeature createCarFeature(CarFeature carFeature) {
        return carFeatureRepository.save(carFeature);
    }

    @Override
    public CarFeature updateCarFeature(Long id, CarFeature carFeature) {
        if (!carFeatureRepository.existsById(id)) {
            return null;
        }
        carFeature.setFeatureId(id);
        return carFeatureRepository.save(carFeature);
    }

    @Override
    public void deleteCarFeature(Long id) {
        carFeatureRepository.deleteById(id);
    }
}