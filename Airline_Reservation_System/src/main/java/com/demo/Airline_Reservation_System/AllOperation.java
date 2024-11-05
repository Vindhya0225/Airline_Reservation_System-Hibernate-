package com.demo.Airline_Reservation_System;

import com.demo.Airline_Reservation.entities.AirLine;
import com.demo.Airline_Reservation.entities.Booking;
import com.demo.Airline_Reservation.entities.Customer;
import com.demo.Airline_Reservation.entities.Payment;
import com.demo.Airline_Reservation.entities.Ticket;
import com.demo.Airline_Reservation.services.impl.BookingServiceImpl;
import com.demo.Airline_Reservation.services.impl.CustomerServiceImpl;
import com.demo.ARS.services.BookingService;
import com.demo.ARS.services.CustomerService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllOperation {
    private static Scanner sc = new Scanner(System.in);
    private static BookingService bookingService = new BookingServiceImpl();
    private static CustomerService customerService = new CustomerServiceImpl();
    private static List<AirLine> airlines;
    private static List<Payment> payments;

    // Method to initialize airline and payment lists
    public static void initializeAirlinesAndPayments() {
        airlines = bookingService.getAllAirlines(); // Ensure this method returns a non-null list
        payments = bookingService.getAllPayments(); // Ensure this method returns a non-null list
    }

    // Display available airlines
    static void displayAirlines() {
        if (airlines == null || airlines.isEmpty()) {
            System.out.println("No airlines available.");
            return;
        }
        System.out.println("Available Airlines:");
        for (AirLine airline : airlines) {
            System.out.println(airline);
        }
    }

    // Display available payment methods
    private static void displayPayments() {
        if (payments == null || payments.isEmpty()) {
            System.out.println("No payment methods available.");
            return;
        }
        System.out.println("Available Payment Methods:");
        for (Payment payment : payments) {
            System.out.println(payment);
        }
    }

    // Method to get user-selected airline
    private static AirLine chooseAirline() {
        System.out.println("Enter the Airline ID from the above list:");
        int airlineId = sc.nextInt();
        for (AirLine airline : airlines) {
            if (airline.getAirLineId() == airlineId) {
                return airline;
            }
        }
        System.out.println("Invalid Airline ID. Please try again.");
        return chooseAirline(); // Recursive call for valid input
    }

    // Method to get user-selected payment method
    private static Payment choosePayment() {
        System.out.println("Enter the Payment ID from the above list:");
        int paymentId = sc.nextInt();
        for (Payment payment : payments) {
            if (payment.getPaymentId() == paymentId) {
                return payment;
            }
        }
        System.out.println("Invalid Payment ID. Please try again.");
        return choosePayment(); // Recursive call for valid input
    }

    // Input method for Booking
    public static Booking bookingInputs() {
        sc.nextLine(); // Clear buffer
        System.out.println("Enter Booking ID:");
        int bookingId = sc.nextInt(); // Assuming bookingId is of type int

        LocalDate bookingDate = null;
        while (bookingDate == null) {
            System.out.println("Enter Booking Date (YYYY-MM-DD):");
            String bookingDateString = sc.next();
            try {
                bookingDate = LocalDate.parse(bookingDateString);
            } catch (Exception e) {
                System.out.println("Invalid date format. Please try again.");
            }
        }

        System.out.println("Enter Booking Status:");
        String bookingStatus = sc.next();

        System.out.println("Enter From Location:");
        String fromLocation = sc.next();

        System.out.println("Enter To Location:");
        String toLocation = sc.next();

        // Display airlines and select one
        displayAirlines();
        AirLine airline = chooseAirline();

        // Display payment methods and select one
        displayPayments();
        Payment payment = choosePayment();

        Ticket ticket = generateTicket(); // Implement this method as necessary

        return new Booking(bookingId, bookingDate, bookingStatus, toLocation, fromLocation, airline, payment, ticket);
    }

    // Operations for Booking
    public static Booking BookingOperations() {
        System.out.println("Enter booking details:");
        Booking booking = bookingInputs();
        getBookingService().createBooking(booking);
        System.out.println("Booking added successfully");
        return booking;
    }

    // Placeholder for ticket generation
    private static Ticket generateTicket() {
        // Implement logic for creating a Ticket object
        return new Ticket(); // Modify according to your Ticket class implementation
    }

    // Operations for Customer
    public static void CustomerOperations() {
        while (true) {
            System.out.println("Press 1: Add Customer\nPress 2: Retrieve All Customers\nPress 3: Update Customer\nPress 4: Delete Customer\nPress 5: Return to Main Menu");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    Customer customer = customerInputs();
                    customerService.createCustomer(customer);
                    System.out.println("Customer added successfully");
                    break;
                case 2:
                    List<Customer> customers = customerService.getAllCustomers();
                    if (customers.isEmpty()) {
                        System.out.println("No customers found.");
                    } else {
                        for (Customer cust : customers) {
                            System.out.println(cust);
                        }
                    }
                    break;
                case 3:
                    sc.nextLine(); // Clear buffer
                    System.out.println("Enter Customer ID to update:");
                    int customerId = sc.nextInt();
                    sc.nextLine(); // Clear buffer again
                    Customer updatedCustomer = customerInputs();
                    updatedCustomer.setCustomerId(customerId); // Assuming you have a setter for customer ID
                    customerService.updateCustomer(updatedCustomer);
                    System.out.println("Customer updated successfully");
                    break;
                case 4:
                    sc.nextLine(); // Clear buffer
                    System.out.println("Enter Customer ID to delete:");
                    customerId = sc.nextInt();
                    customerService.deleteCustomer(customerId);
                    System.out.println("Customer deleted successfully");
                    break;
                case 5:
                    return; // Return to the main menu
                default:
                    System.out.println("Invalid input, please try again.");
            }
        }
    }

    // Method to gather customer input
    private static Customer customerInputs() {
        sc.nextLine(); // Clear buffer
        System.out.println("Enter Customer First Name:");
        String firstName = sc.nextLine();

        System.out.println("Enter Customer Last Name:");
        String lastName = sc.nextLine();

        System.out.println("Enter Passport Number:");
        String passportNumber = sc.nextLine();

        System.out.println("Enter Address:");
        String address = sc.nextLine();

        System.out.println("Enter Email:");
        String email = sc.nextLine();

        System.out.println("Enter Phone Number:");
        String phoneString = sc.nextLine(); // Read as string
        
        // Assuming Customer has a constructor that includes these fields
        return new Customer(0, firstName, lastName, passportNumber, address, email, phoneString); // Assuming ID will be set by the DB
    }

    // Method to initialize operations
    public static void main(String[] args) {
    	initializeAirlinesAndPayments(); // Populate the airline list
        displayAirlines(); // 
        //initializeAirlinesAndPayments(); // Call this method at the start
    	airlines = new ArrayList<>(); // Initialize the list
        airlines.add(new AirLine(1, "FL123", "20kg", "Airline A", "International"));
        airlines.add(new AirLine(2, "FL456", "30kg", "Airline B", "Domestic"));
        airlines.add(new AirLine(3, "FL789", "25kg", "Airline C", "International"));
        BookingOperations();
        CustomerOperations();
    }

	public static BookingService getBookingService() {
        return bookingService;
    }

    public static void setBookingService(BookingService bookingService) {
        AllOperation.bookingService = bookingService;
    }

	public static void AirLineOperations() {
		// TODO Auto-generated method stub
		
	}

	public static void PaymentOperations() {
		// TODO Auto-generated method stub
		
	}

	public static void TicketOperations() {
		// TODO Auto-generated method stub
		
	}
}
