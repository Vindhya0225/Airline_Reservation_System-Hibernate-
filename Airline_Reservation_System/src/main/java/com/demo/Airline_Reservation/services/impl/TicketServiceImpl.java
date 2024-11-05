package com.demo.Airline_Reservation.services.impl;

import com.demo.Airline_Reservation.entities.Ticket;
import com.demo.ARS.services.TicketService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketServiceImpl implements TicketService {
    // In-memory database for tickets
    private Map<Integer, Ticket> ticketDatabase = new HashMap<>();

    @Override
    public Ticket createTicket(Ticket ticket) {
        // Add the ticket to the database using its ID
        ticketDatabase.put(ticket.getTicketId(), ticket);
        return ticket; // Return the created ticket
    }

    public Ticket getTicketById(Integer ticketId) {
        // Retrieve the ticket by its ID
        return ticketDatabase.get(ticketId);
    }

    public Ticket updateTicket(Integer ticketId, Ticket ticket) {
        // Update the ticket in the database if it exists
        if (ticketDatabase.containsKey(ticketId)) {
            ticketDatabase.put(ticketId, ticket);
            return ticket; // Return the updated ticket
        }
        return null; // Return null if the ticket was not found
    }

    public String deleteTicket(Integer ticketId) {
        // Remove the ticket from the database and return a message
        if (ticketDatabase.containsKey(ticketId)) {
            ticketDatabase.remove(ticketId);
            return "Ticket deleted successfully.";
        }
        return "Ticket not found."; // Return a message if the ticket was not found
    }

    @Override
    public List<Ticket> getAllTickets() {
        // Return a list of all tickets
        return new ArrayList<>(ticketDatabase.values());
    }

    @Override
    public boolean confirmTicket(Ticket ticket) {
        // Here you can implement logic to confirm the ticket booking
        // For now, we'll just return true as a placeholder
        return true; // Indicating that the ticket has been confirmed
    }

	@Override
	public Ticket updateTicket(String ticketId, Ticket ticket) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket getTicketById(String ticketId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteTicket(String ticketId) {
		// TODO Auto-generated method stub
		return null;
	}
}
