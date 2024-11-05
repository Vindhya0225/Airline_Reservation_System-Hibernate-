package com.demo.dao;

import com.demo.Airline_Reservation.entities.Payment;

public interface PaymentDao {
    
    // Method to create a new payment
    Payment createPayment(Payment payment);
    
    // Method to retrieve payment details based on payment ID
    Payment getPaymentDetails(String paymentId);
    
    // Method to update payment details
    Payment updatePayment(String paymentId, Payment payment);
    
    // Method to delete a payment by payment ID
    String deletePayment(String paymentId);
}
