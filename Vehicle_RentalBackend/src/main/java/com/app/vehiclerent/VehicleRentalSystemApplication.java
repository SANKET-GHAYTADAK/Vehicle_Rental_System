package com.app.vehiclerent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
=======
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a

@SpringBootApplication
public class VehicleRentalSystemApplication {

<<<<<<< HEAD
	public static void main(String[] args) {
		SpringApplication.run(VehicleRentalSystemApplication.class, args);
		
	}
	
	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:3000")
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                        .allowCredentials(true);
            }
        };
    } 
=======
    public static void main(String[] args) {
        SpringApplication.run(VehicleRentalSystemApplication.class, args);
    }
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a

}
