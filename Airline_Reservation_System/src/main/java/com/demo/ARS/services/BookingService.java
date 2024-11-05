package com.demo.ARS.services;
import com.demo.Airline_Reservation.entities.AirLine;
import com.demo.Airline_Reservation.entities.Booking;
import com.demo.Airline_Reservation.entities.Payment;

import java.util.List;

public interface BookingService {
	// Method to create a new booking
    Booking createBooking(Booking booking);
    
    // Method to retrieve a booking by ID
    Booking getBookingById(String bookingId);
    
    // Method to update booking details
    Booking updateBooking(String bookingId, Booking booking);
    
    // Method to delete a booking by ID
    String deleteBooking(String bookingId);
    
    // Method to retrieve all bookings


	List<AirLine> getAllAirlines();

	List<Payment> getAllPayments();

}
