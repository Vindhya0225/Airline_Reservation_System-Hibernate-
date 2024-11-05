package com.demo.daoImpl;

import com.demo.dao.TicketDao;
import com.demo.Airline_Reservation.entities.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketDaoImpl implements TicketDao {
    private Map<Integer, Ticket> ticketDatabase = new HashMap<>();

    @Override
    public Ticket createTicket(Ticket ticket) {
        ticketDatabase.put(ticket.getTicketId(), ticket);
        return ticket;
    }

    public Ticket getTicketDetails(Integer ticketId) {
        return ticketDatabase.get(ticketId);
    }

    public Ticket updateTicket(Integer ticketId, Ticket ticket) {
        ticketDatabase.put(ticketId, ticket);
        return ticket;
    }

    public String deleteTicket(Integer ticketId) {
        ticketDatabase.remove(ticketId);
        return "Ticket with ID " + ticketId + " has been deleted.";
    }

	@Override
	public Ticket getTicketDetails(String ticketId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket updateTicket(String ticketId, Ticket ticket) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteTicket(String ticketId) {
		// TODO Auto-generated method stub
		return null;
	}
}
