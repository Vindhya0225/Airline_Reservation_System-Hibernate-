package com.demo.ARS.services;
import com.demo.Airline_Reservation.entities.Payment;

import java.util.List;


public interface PaymentService {
	// Method to create a new payment
    Payment createPayment(Payment payment);
    
    // Method to retrieve a payment by ID
    Payment getPaymentById(String paymentId);
    
    // Method to update payment details
    Payment updatePayment(String paymentId, Payment payment);
    
    // Method to delete a payment by ID
    String deletePayment(String paymentId);
    
    // Method to retrieve all payments
    List<Payment> getAllPayments();
    
    // Method to process payment
    boolean processPayment(Payment payment);

}
