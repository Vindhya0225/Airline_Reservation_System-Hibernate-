package com.demo.dao;

import com.demo.Airline_Reservation.entities.Booking;

public interface BookingDao {
    
    // Method to create a new booking
    Booking createBooking(Booking booking);
    
    // Method to retrieve booking details based on booking ID
    Booking getBookingDetails(String bookingId);
    
    // Method to update booking details
    Booking updateBooking(String bookingId, Booking booking);
    
    // Method to delete a booking by booking ID
    String deleteBooking(String bookingId);
}
