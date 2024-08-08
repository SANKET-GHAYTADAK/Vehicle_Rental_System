package com.app.vehiclerent.service;

import java.util.List;
<<<<<<< HEAD
=======

>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
import com.app.vehiclerent.entity.Customer;

public interface CustomerService {
    List<Customer> getAllCustomers();

    Customer getCustomerById(Long id);

    Customer createCustomer(Customer customer);

    Customer updateCustomer(Long id, Customer customer);

    void deleteCustomer(Long id);
<<<<<<< HEAD

    Customer authenticate(String email, String password);
    
	Customer findByEmail(String email);

	List<Customer> findByRole(String role);
=======
>>>>>>> 1197bcd9c895547d26728c1001566b5b1e6eaa5a
}
