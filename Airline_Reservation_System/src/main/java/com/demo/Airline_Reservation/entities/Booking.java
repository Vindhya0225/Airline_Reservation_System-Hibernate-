package com.demo.Airline_Reservation.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import java.time.LocalDate;

@Entity
public class Booking {
	    @Id
	    @Column(name = "BookingId", length = 10)
	    private int bookingId;
	    
	    @Column(name = "BookingDate")
	    private LocalDate bookingDate;
	    
	    @Column(name = "BookingStatus", length = 25)
	    private String bookingStatus;
	    
	    @Column(name = "ToLocation", length = 100)
	    private String toLocation;
	    
	    @Column(name = "FromLocation", length = 100)
	    private String fromLocation;
	    
	 // One-to-One mapping
	    @OneToOne(mappedBy = "booking")
	    private Customer customer;
	    
	    @ManyToOne
	    @JoinColumn(name = "AirLineId")
	    private AirLine airline;
	    
	    @OneToOne
	    @JoinColumn(name = "PaymentId")
	    private Payment payment;
	    
	    @OneToOne
	    @JoinColumn(name = "TicketId")
	    private Ticket ticket;

	  //default constructor
		public Booking() {
			super();
			// TODO Auto-generated constructor stub
		}

		//constructor for all feilds
	public Booking(int bookingId, LocalDate bookingDate, String bookingStatus, String toLocation,
			String fromLocation, AirLine airline, Payment payment, Ticket ticket) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.bookingStatus = bookingStatus;
		this.toLocation = toLocation;
		this.fromLocation = fromLocation;
		this.airline = airline;
        this.payment = payment;
        this.ticket = ticket;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}
	
	public AirLine getAirline() {
        return airline;
    }

    public void setAirline(AirLine airline) {
        this.airline = airline;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }


	@Override
	public String toString() {
		return "Customer [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", bookingStatus=" + bookingStatus
				+ ", toLocation=" + toLocation + ", fromLocation=" + fromLocation +", airline=" + airline + 
			               ", payment=" + payment + ", ticket=" + ticket + "]";
	}
	
	}
	
	
	    
	    

