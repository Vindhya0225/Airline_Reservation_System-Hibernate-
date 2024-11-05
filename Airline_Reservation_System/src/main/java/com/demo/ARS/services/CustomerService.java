package com.demo.ARS.services;
import com.demo.Airline_Reservation.entities.Customer;

import java.util.List;

public interface CustomerService {
	// Method to create a new customer
    Customer createCustomer(Customer customer);
    
    // Method to retrieve a customer by ID
    Customer getCustomerById(String customerId);
    
    // Method to update customer details
    Customer updateCustomer(String customerId, Customer customer);
    
    // Method to delete a customer by ID
    String deleteCustomer(String customerId);
    
    // Method to retrieve all customer details
    List<Customer> getAllCustomers();

	void updateCustomer(Customer updatedCustomer);

	void deleteCustomer(int customerId);

}
