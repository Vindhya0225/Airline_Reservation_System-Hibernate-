package com.demo.Airline_Reservation_System;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.demo.Airline_Reservation.entities.Booking;
import com.demo.Airline_Reservation.entities.Ticket;

import static com.demo.Airline_Reservation_System.AllOperation.*;

public class MainOperation {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        AllOperation.initializeAirlinesAndPayments(); // Initialize before operations
        mainOps();
    }

    public static void mainOps() {
        while (true) {
            System.out.println("Press 1: Customer Details\n"
                    + "Press 2: Booking Details\n"
                    + "Press 3: Airline List\n"
                    + "Press 4: Payment Details\n"
                    + "Press 5: Ticket Details\n"
                    + "Press 6: Quit");
            int input = 0;

            try {
                input = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // Clear the invalid input
                continue; // Restart the loop
            }

            switch (input) {
                case 1:
                    AllOperation.CustomerOperations();
                    break;
                case 2:
                    Booking booking = BookingOperations(); // Directly call your BookingOperations
                    System.out.println("Booking details: " + booking.toString()); // Example usage
                    break;
                case 3:
                    AllOperation.AirLineOperations();
                    break;
                case 4:
                    AllOperation.PaymentOperations();
                    break;
                case 5:
                    AllOperation.TicketOperations();
                	// Retrieve and display ticket details
                    TicketOperations(); 
                    break;
                case 6:
                    System.out.println("Exiting the system. Goodbye!");
                    sc.close(); // Close the Scanner
                    return; // Exit the method gracefully
                default:
                    System.out.println("Wrong input, please try again");
            }
        }
    }

    public static Booking BookingOperations() {
        Booking booking = AllOperation.bookingInputs(); // Gather booking details
        AllOperation.getBookingService().createBooking(booking); // Save booking
        System.out.println("Booking done successfully");
        return booking; // Return completed booking
    }
    
 // Add TicketOperations method here
    public static void TicketOperations() {
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to enter the booking ID
        System.out.println("Enter Booking ID to retrieve ticket details: ");
        String bookingId = sc.next(); // Get the booking ID from the user

        // Retrieve the booking from the booking service based on bookingId
        Booking booking = AllOperation.getBookingService().getBookingById(bookingId);

        // Check if the booking exists
        if (booking != null) {
            System.out.println("Booking details found. Retrieving ticket details...");

            // Retrieve and display ticket details
            Ticket ticket = booking.getTicket();
            if (ticket != null) {
                System.out.println("Ticket Details:");
                System.out.println("Ticket ID: " + ticket.getTicketId());
                System.out.println("Date of Journey: " + ticket.getDateOfJourney());
                System.out.println("Seat Number: " + ticket.getSeatNumber());
                System.out.println("Price: " + ticket.getPrice());
                System.out.println("Arrival Airport: " + ticket.getArrivalAirport());
                System.out.println("Departure Airport: " + ticket.getDepartureAirport());
                System.out.println("Flight Class: " + ticket.getFlightclass());
                System.out.println("Arrival Time: " + ticket.getArrivalTime());
                System.out.println("Departure Time: " + ticket.getDepartTime());
            } else {
                System.out.println("No ticket details available for this booking.");
            }
        } else {
            System.out.println("Booking not found for the given Booking ID.");
        }
    }
}
