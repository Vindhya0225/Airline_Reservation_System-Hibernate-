package com.demo.ARS.services;
import com.demo.Airline_Reservation.entities.Ticket;

import java.util.List;


public interface TicketService {
	// Method to create a new ticket
    Ticket createTicket(Ticket ticket);
    
    // Method to retrieve a ticket by ID
    Ticket getTicketById(String ticketId);
    
    // Method to update ticket details
    Ticket updateTicket(String ticketId, Ticket ticket);
    
    // Method to delete a ticket by ID
    String deleteTicket(String ticketId);
    
    // Method to retrieve all tickets
    List<Ticket> getAllTickets();
    
    // Method to confirm a ticket booking
    boolean confirmTicket(Ticket ticket);

}
