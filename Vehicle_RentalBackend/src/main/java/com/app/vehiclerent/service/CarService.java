package com.app.vehiclerent.service;

import java.util.List;

<<<<<<< HEAD
import org.springframework.web.multipart.MultipartFile;

=======
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
import com.app.vehiclerent.entity.Car;

public interface CarService {
    List<Car> getAllCars();

    Car getCarById(Long id);

    Car createCar(Car car);

    Car updateCar(Long id, Car car);

    void deleteCar(Long id);
<<<<<<< HEAD

    void uploadImages(Long carId, List<MultipartFile> files);

    byte[] getCarImage(Long carId, Long imageId) throws Exception;

    String saveImage(MultipartFile file);
}
=======
}
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
