package com.demo.Airline_Reservation.services.impl;

import com.demo.Airline_Reservation.entities.Customer;
import com.demo.ARS.services.CustomerService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private Map<Integer, Customer> customerDatabase = new HashMap<>();

    @Override
    public Customer createCustomer(Customer customer) {
        // Directly use the int customer ID
        customerDatabase.put(customer.getCustomerId(), customer);
        return customer; // Return the created customer
    }

    public Customer getCustomerById(Integer customerId) {
        return customerDatabase.get(customerId);
    }

    public Customer updateCustomer(Integer customerId, Customer customer) {
        return customerDatabase.put(customerId, customer);
    }

    public String deleteCustomer(Integer customerId) {
        customerDatabase.remove(customerId);
        return "Customer deleted successfully";
    }

    @Override
    public List<Customer> getAllCustomers() {
        return new ArrayList<>(customerDatabase.values());
    }

	@Override
	public Customer getCustomerById(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer(String customerId, Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCustomer(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCustomer(Customer updatedCustomer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		
	}
}
