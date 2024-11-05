//package com.demo.Airline_Reservation_System;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import java.time.LocalDate;
//import com.demo.Airline_Reservation.entities.Customer;
//import com.demo.Airline_Reservation.entities.Payment;
//import com.demo.Airline_Reservation.entities.Ticket;
//import com.demo.Airline_Reservation.entities.AirLine;
//import com.demo.Airline_Reservation.entities.Booking;
//
//public class Operations {
//	public static void main(String[] args) {
//        // Obtain a Hibernate SessionFactory
//        SessionFactory factory = HibernetUtil.getSessionFactory();
//
//        // Create a new Customer
//        int customerId = 15; // Assuming customerId is an integer
//        String firstName = "Oliver";
//        String lastName = "Gener";
//        String passportNumber = "PN67543";
//        String address = "Mumbai";
//        String email = "oliver@gmail.com";
//        int phone = 674290674; // Assuming phone is also an integer
//
//        Customer customer01 = new Customer(customerId, firstName, lastName, passportNumber, address, email, phone);
//
//        // Create a new Booking
//        int bookingId = 14; // Example booking ID
//        LocalDate bookingDate = LocalDate.of(2024, 9, 23); // Directly specify year, month, day
//        String bookingStatus = "Confirmed";
//        String toLocation = "New York";
//        String fromLocation = "Mumbai";
//
//        Booking booking1 = new Booking(bookingId, bookingDate, bookingStatus, toLocation, fromLocation, null, null, null);
//        
//        // Create a new Airline
//        int airLineId = 13; // Example airline ID
//        String flightNumber = "AI202";
//        String allowance = "20kg";
//        String name = "Air India";
//        String airportType = "International";
//
//        AirLine airLine1 = new AirLine(airLineId, flightNumber, allowance, name, airportType);
//        
//        // Create a new Payment
//        int paymentId = 12; // Example payment ID
//        int amount = 15000; // Example amount
//        int paymentDate = 20230920; // Example payment date as an integer (e.g., YYYYMMDD)
//        String paymentMethod = "Credit Card";
//        String status = "Paid";
//
//        Payment payment1 = new Payment(paymentId, amount, paymentDate, paymentMethod, status);
//        
//        // Create a new Ticket
//        int ticketId = 11; // Example ticket ID
//        int dateOfJourney = 20230925; // Example journey date as an integer (e.g., YYYYMMDD)
//        String departTime = "10:00 AM";
//        int issueDate = 20230920; // Example issue date as an integer (e.g., YYYYMMDD)
//        String departureAirport = "Mumbai International Airport";
//        String seatNumber = "12A";
//        String arrivalAirport = "New York JFK Airport";
//        String flightclass = "Economy";
//        String arrivalTime = "08:00 PM";
//        int price = 15000; // Example ticket price
//
//        Ticket ticket1 = new Ticket(ticketId, dateOfJourney, departTime, issueDate, departureAirport, seatNumber, arrivalAirport, flightclass, arrivalTime, price);
//
//        // Print or log booking details
//        System.out.println("Creating customer: " + customer01);
//        System.out.println("Creating booking: " + booking1);
//        System.out.println("Creating airline: " + airLine1);
//        System.out.println("Creating payment: " + payment1);
//        System.out.println("Creating ticket: " + ticket1);
//        
//        // Open a new session
//        Session session = factory.openSession();
//        // Begin a transaction
//        Transaction transaction = session.beginTransaction();
//
//        // Save the entity classes to the database
//        session.save(customer01);
//        session.save(booking1);
//        session.save(airLine1);
//        session.save(payment1);
//        session.save(ticket1);
//
//        // Commit the transaction
//        transaction.commit();
//        // Close the session
//        session.close();
//        // Close the Session Factory
//        factory.close();
//    }
//
//}
