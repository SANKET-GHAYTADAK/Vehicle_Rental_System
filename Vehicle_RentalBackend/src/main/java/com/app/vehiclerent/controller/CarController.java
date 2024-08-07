package com.app.vehiclerent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
=======
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
=======
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a

import com.app.vehiclerent.entity.Car;
import com.app.vehiclerent.service.CarService;

@RestController
<<<<<<< HEAD
@CrossOrigin
=======
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
@RequestMapping("/cars")
public class CarController {
    
    @Autowired
<<<<<<< HEAD
    private CarService carService;
    
    @GetMapping
    public List<Car> getAllVehicles() {
        return carService.getAllCars();
=======
    private CarService vehicleService;
    
    @GetMapping
    public List<Car> getAllVehicles() {
        return vehicleService.getAllCars();
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
    }
    
    @GetMapping("/{id}")
    public Car getVehicleById(@PathVariable Long id) {
<<<<<<< HEAD
        return carService.getCarById(id);
    }
    
    @PostMapping
    public Car createVehicle(@RequestBody Car car) {
        return carService.createCar(car);
    }
    
    @PutMapping("/{id}")
    public Car updateVehicle(@PathVariable Long id, @RequestBody Car car) {
        return carService.updateCar(id, car);
=======
        return vehicleService.getCarById(id);
    }
    
    @PostMapping
    public Car createVehicle(@RequestBody Car Car) {
        return vehicleService.createCar(Car);
    }
    
    @PutMapping("/{id}")
    public Car updateVehicle(@PathVariable Long id, @RequestBody Car Car) {
        return vehicleService.updateCar(id, Car);
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
    }
    
    @DeleteMapping("/{id}")
    public void deleteVehicle(@PathVariable Long id) {
<<<<<<< HEAD
        carService.deleteCar(id);
    }
    
    @PostMapping("/{carId}/images")
    public void uploadImages(@PathVariable Long carId, @RequestParam("files") List<MultipartFile> files) {
        carService.uploadImages(carId, files);
    }
    
    @GetMapping("/{carId}/images/{imageId}")
    public ResponseEntity<byte[]> getCarImage(@PathVariable Long carId, @PathVariable Long imageId) throws Exception {
        // Retrieve the image bytes from the CarImage entity
        byte[] imageBytes = carService.getCarImage(carId, imageId);

        // Set the appropriate HTTP headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG); // Set the content type based on your image format (e.g., IMAGE_PNG for PNG)

        // Return the image bytes and headers as a ResponseEntity
        return new ResponseEntity<>(imageBytes, headers, HttpStatus.OK);
=======
        vehicleService.deleteCar(id);
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
    }
}
