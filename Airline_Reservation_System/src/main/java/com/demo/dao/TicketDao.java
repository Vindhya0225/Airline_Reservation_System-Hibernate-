package com.demo.dao;

import com.demo.Airline_Reservation.entities.Ticket;

public interface TicketDao {
    
    // Method to create a new ticket
    Ticket createTicket(Ticket ticket);
    
    // Method to retrieve ticket details based on ticket ID
    Ticket getTicketDetails(String ticketId);
    
    // Method to update ticket details
    Ticket updateTicket(String ticketId, Ticket ticket);
    
    // Method to delete a ticket by ticket ID
    String deleteTicket(String ticketId);
}
