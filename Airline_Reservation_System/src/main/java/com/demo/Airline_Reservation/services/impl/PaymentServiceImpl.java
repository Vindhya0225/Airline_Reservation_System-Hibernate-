package com.demo.Airline_Reservation.services.impl;

import com.demo.Airline_Reservation.entities.Payment;
import com.demo.ARS.services.PaymentService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentServiceImpl implements PaymentService {
    // Use a Map to store payments, with the payment ID as the key
    private Map<Integer, Payment> paymentDatabase = new HashMap<>();

    @Override
    public Payment createPayment(Payment payment) {
        // Store the payment in the database using its ID
        paymentDatabase.put(payment.getPaymentId(), payment);
        return payment; // Return the created payment
    }

    public Payment getPaymentById(Integer paymentId) {
        // Retrieve the payment by its ID
        return paymentDatabase.get(paymentId);
    }

    public Payment updatePayment(Integer paymentId, Payment payment) {
        // Update the payment details
        return paymentDatabase.put(paymentId, payment);
    }

    public String deletePayment(Integer paymentId) {
        // Remove the payment from the database
        paymentDatabase.remove(paymentId);
        return "Payment deleted successfully";
    }

    @Override
    public List<Payment> getAllPayments() {
        // Return a list of all payments
        return new ArrayList<>(paymentDatabase.values());
    }

    @Override
    public boolean processPayment(Payment payment) {
        // Implement your payment processing logic here
        // This is just a placeholder; you can expand it as needed
        System.out.println("Processing payment: " + payment);
        return true; // Return true if payment processed successfully
    }

	@Override
	public Payment getPaymentById(String paymentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment updatePayment(String paymentId, Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletePayment(String paymentId) {
		// TODO Auto-generated method stub
		return null;
	}
}
