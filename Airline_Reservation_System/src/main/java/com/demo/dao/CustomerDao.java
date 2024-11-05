package com.demo.dao;

import com.demo.Airline_Reservation.entities.Customer;

public interface CustomerDao {
    
    // Method to create a new customer
    Customer createCustomer(Customer customer);
    
    // Method to retrieve customer details based on customer ID
    Customer getCustomerDetails(int customerId);
    
    // Method to update customer details
    Customer updateCustomer(int customerId, Customer customer);
    
    // Method to delete a customer by customer ID
    String deleteCustomer(int customerId);
}
