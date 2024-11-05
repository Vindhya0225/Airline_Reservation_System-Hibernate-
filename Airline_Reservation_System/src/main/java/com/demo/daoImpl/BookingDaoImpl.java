package com.demo.daoImpl;

import com.demo.dao.BookingDao;
import com.demo.Airline_Reservation.entities.Booking;

import java.util.HashMap;
import java.util.Map;

public class BookingDaoImpl implements BookingDao {
    private Map<Integer, Booking> bookingDatabase = new HashMap<>();

    @Override
    public Booking createBooking(Booking booking) {
        bookingDatabase.put(booking.getBookingId(), booking);
        return booking;
    }

    public Booking getBookingDetails(Integer bookingId) {
        return bookingDatabase.get(bookingId);
    }

    public Booking updateBooking(Integer bookingId, Booking booking) {
        bookingDatabase.put(bookingId, booking);
        return booking;
    }

    public String deleteBooking(Integer bookingId) {
        bookingDatabase.remove(bookingId);
        return "Booking with ID " + bookingId + " has been deleted.";
    }

	@Override
	public Booking updateBooking(String bookingId, Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking getBookingDetails(String bookingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteBooking(String bookingId) {
		// TODO Auto-generated method stub
		return null;
	}
}
