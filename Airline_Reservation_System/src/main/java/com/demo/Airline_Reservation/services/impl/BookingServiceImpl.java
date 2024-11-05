package com.demo.Airline_Reservation.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.ARS.services.BookingService;
import com.demo.Airline_Reservation.entities.AirLine;
import com.demo.Airline_Reservation.entities.Booking;
import com.demo.Airline_Reservation.entities.Payment;
import com.demo.Airline_Reservation_System.HibernetUtil; // Ensure this is the correct import

public class BookingServiceImpl implements BookingService {
    // Hardcoded lists for demonstration
    private List<Booking> bookingList = new ArrayList<>();
    private List<AirLine> airlineList = new ArrayList<>();
    private List<Payment> paymentList = new ArrayList<>();

    public BookingServiceImpl() {
        // Initializing with some dummy airline data
        airlineList.add(new AirLine(1, "FL123", "20kg", "Airline A", "International"));
        airlineList.add(new AirLine(2, "FL456", "30kg", "Airline B", "Domestic"));
        airlineList.add(new AirLine(3, "FL789", "25kg", "Airline C", "International"));

        // Initializing with some dummy payment data
        paymentList.add(new Payment());
        paymentList.add(new Payment());
        paymentList.add(new Payment());
    }

    @Override
    public Booking createBooking(Booking booking) {
        Session session = HibernetUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            // Ensure payment is not null
            if (booking.getPayment() != null) {
                Integer paymentId = booking.getPayment().getPaymentId(); // Use Integer
                if (paymentId != null) {
                    // Retrieve existing payment from the database
                    Payment payment = session.get(Payment.class, paymentId);
                    if (payment != null) {
                        booking.setPayment(payment); // Assign the existing payment to booking
                    } else {
                        throw new IllegalArgumentException("Payment with ID " + paymentId + " does not exist.");
                    }
                } else {
                    throw new IllegalArgumentException("Payment ID cannot be null.");
                }
            } else {
                throw new IllegalArgumentException("Payment must be provided for the booking.");
            }

            session.save(booking);
            transaction.commit();
            System.out.println("Booking saved to the database.");
        } catch (IllegalArgumentException e) {
            if (transaction != null) transaction.rollback();
            System.err.println("Error creating booking: " + e.getMessage());
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return booking;
    }

    @Override
    public Booking getBookingById(String bookingId) {
        int bookingIdInt = Integer.parseInt(bookingId);
        
        // Check in the hardcoded list first
        for (Booking booking : bookingList) {
            if (booking.getBookingId() == bookingIdInt) {
                return booking;
            }
        }

        // If not found, check in the database
        Session session = HibernetUtil.getSessionFactory().openSession();
        Booking booking = session.get(Booking.class, bookingIdInt); // Retrieve booking from DB
        session.close();

        return booking; // Return either found booking or null if not found
    }

    @Override
    public Booking updateBooking(String bookingId, Booking booking) {
        // Update booking implementation (optional)
        return null;
    }

    @Override
    public String deleteBooking(String bookingId) {
        // Delete booking implementation (optional)
        return null;
    }

    @Override
    public List<AirLine> getAllAirlines() {
        return airlineList; // Return the populated airline list
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentList; // Return the populated payment list
    }
}
