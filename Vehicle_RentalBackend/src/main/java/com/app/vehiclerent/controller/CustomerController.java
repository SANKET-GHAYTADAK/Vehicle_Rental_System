package com.app.vehiclerent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
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
import org.springframework.web.bind.annotation.RestController;

import com.app.vehiclerent.entity.Customer;
<<<<<<< HEAD
import com.app.vehiclerent.repository.CustomerRepository;
import com.app.vehiclerent.service.CustomerService;

@RestController
@CrossOrigin
=======
import com.app.vehiclerent.service.CustomerService;

@RestController
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
@RequestMapping("/customers")
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;
    
<<<<<<< HEAD
    @Autowired
    private CustomerRepository customerRepo;
    
=======
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
    
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }
    
    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }
    
<<<<<<< HEAD
    @PutMapping("/{customerId}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long customerId, @RequestBody Customer updatedCustomer) {
        Customer existingCustomer = customerRepo.findById(customerId).orElseThrow();

        // Update only the non-null fields from the updatedCustomer
        if (updatedCustomer.getFirstName() != null) {
            existingCustomer.setFirstName(updatedCustomer.getFirstName());
        }
        if (updatedCustomer.getLastName() != null) {
            existingCustomer.setLastName(updatedCustomer.getLastName());
        }
        if (updatedCustomer.getEmail() != null) {
            existingCustomer.setEmail(updatedCustomer.getEmail());
        }
        if (updatedCustomer.getRole() != null) {
            existingCustomer.setRole(updatedCustomer.getRole());
        }
        if (updatedCustomer.getPhoneNumber() != null) {
            existingCustomer.setPhoneNumber(updatedCustomer.getPhoneNumber());
        }
        if (updatedCustomer.getDateOfBirth() != null) {
            existingCustomer.setDateOfBirth(updatedCustomer.getDateOfBirth());
        }
        if (updatedCustomer.getLicenseNumber() != null) {
            existingCustomer.setLicenseNumber(updatedCustomer.getLicenseNumber());
        }
        if (updatedCustomer.getUsername() != null) {
            existingCustomer.setUsername(updatedCustomer.getUsername());
        }
        if (updatedCustomer.getPassword() != null) {
            existingCustomer.setPassword(updatedCustomer.getPassword());
        }
//        if (updatedCustomer.isLoggedIn() != null) {
//            existingCustomer.setLoggedIn(updatedCustomer.isLoggedIn());
//        }

        Customer savedCustomer = customerRepo.save(existingCustomer);
        return ResponseEntity.ok(savedCustomer);

=======
    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        return customerService.updateCustomer(id, customer);
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
    }
    
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
    }
}