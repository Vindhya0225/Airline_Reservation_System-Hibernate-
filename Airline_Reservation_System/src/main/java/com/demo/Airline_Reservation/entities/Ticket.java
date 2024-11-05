package com.demo.Airline_Reservation.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ticket {
	@Id
    @Column(name = "TicketId", length = 15)
    private int ticketId;
    
    @Column(name = "DateOfJourney", length = 8)
    private int dateOfJourney;
    
    @Column(name = "DepartTime", length = 10)
    private String departTime;
    
    @Column(name = "IssueDate", length = 8)
    private int issueDate;
    
    @Column(name = "DepartureAirport", length = 100)
    private String departureAirport;
    
    @Column(name = "SeatNumber", length = 15)
    private String seatNumber;
    
    @Column(name = "ArrivalAirport", length = 100)
    private String arrivalAirport;
    
    @Column(name = "FlightClass", length = 20)
    private String flightclass;
    
    @Column(name = "ArrivalTime", length = 10)
    private String arrivalTime;
    
    @Column(name = "Price", length = 50)
    private int price;
    
 // One-to-One relationship with Booking
    @OneToOne(mappedBy = "ticket")
    private Booking booking;

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(int ticketId, int dateOfJourney, String departTime, int issueDate, String departureAirport,
			String seatNumber, String arrivalAirport, String flightclass, String arrivalTime, int price) {
		super();
		this.ticketId = ticketId;
		this.dateOfJourney = dateOfJourney;
		this.departTime = departTime;
		this.issueDate = issueDate;
		this.departureAirport = departureAirport;
		this.seatNumber = seatNumber;
		this.arrivalAirport = arrivalAirport;
		this.flightclass = flightclass;
		this.arrivalTime = arrivalTime;
		this.price = price;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getDateOfJourney() {
		return dateOfJourney;
	}

	public void setDateOfJourney(int dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}

	public String getDepartTime() {
		return departTime;
	}

	public void setDepartTime(String departTime) {
		this.departTime = departTime;
	}

	public int getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(int issueDate) {
		this.issueDate = issueDate;
	}

	public String getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getArrivalAirport() {
		return arrivalAirport;
	}

	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	public String getFlightclass() {
		return flightclass;
	}

	public void setFlightclass(String flightclass) {
		this.flightclass = flightclass;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", dateOfJourney=" + dateOfJourney + ", departTime=" + departTime
				+ ", issueDate=" + issueDate + ", departureAirport=" + departureAirport + ", seatNumber=" + seatNumber
				+ ", arrivalAirport=" + arrivalAirport + ", flightclass=" + flightclass + ", arrivalTime=" + arrivalTime
				+ ", price=" + price + "]";
	}
    
    


}
