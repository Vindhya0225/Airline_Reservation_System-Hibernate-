package com.demo.daoImpl;

import com.demo.dao.CustomerDao;
import com.demo.Airline_Reservation.entities.Customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerDaoImpl implements CustomerDao {
    private Map<Integer, Customer> customerDatabase = new HashMap<>();

    @Override
    public Customer createCustomer(Customer customer) {
        customerDatabase.put(customer.getCustomerId(), customer);
        return customer;
    }

    @Override
    public Customer getCustomerDetails(int customerId) {
        return customerDatabase.get(customerId);
    }

    @Override
    public Customer updateCustomer(int customerId, Customer customer) {
        customerDatabase.put(customerId, customer);
        return customer;
    }

    @Override
    public String deleteCustomer(int customerId) {
        customerDatabase.remove(customerId);
        return "Customer with ID " + customerId + " has been deleted.";
    }
}
