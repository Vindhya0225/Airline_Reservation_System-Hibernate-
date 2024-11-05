package com.demo.daoImpl;

import com.demo.dao.PaymentDao;
import com.demo.Airline_Reservation.entities.Payment;

import java.util.HashMap;
import java.util.Map;

public class PaymentDaoImpl implements PaymentDao {
    private Map<Integer, Payment> paymentDatabase = new HashMap<>();

    @Override
    public Payment createPayment(Payment payment) {
        paymentDatabase.put(payment.getPaymentId(), payment);
        return payment;
    }

    public Payment getPaymentDetails(Integer paymentId) {
        return paymentDatabase.get(paymentId);
    }

    public Payment updatePayment(Integer paymentId, Payment payment) {
        paymentDatabase.put(paymentId, payment);
        return payment;
    }

    public String deletePayment(Integer paymentId) {
        paymentDatabase.remove(paymentId);
        return "Payment with ID " + paymentId + " has been deleted.";
    }

	@Override
	public Payment getPaymentDetails(String paymentId) {
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
