package com.demo.Airline_Reservation.entities;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class AirLine {
	@Id
    @Column(name = "AirLineId", length = 20)
    private int airLineId;
    
    @Column(name = "FlightNumber", length = 15)
    private String flightNumber;
    
    @Column(name = "Allowance", length = 70)
    private String allowance;
    
    @Column(name = "Name")
    private String name;
    
    @Column(name = "AirportType", length = 30)
    private String airportType;
    
 // One-to-Many relationship with Booking
    @OneToMany(mappedBy = "airline")
    private List<Booking> bookings;

	public AirLine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AirLine(int airLineId, String flightNumber, String allowance, String name, String airportType) {
		super();
		this.airLineId = airLineId;
		this.flightNumber = flightNumber;
		this.allowance = allowance;
		this.name = name;
		this.airportType = airportType;
	}

	public AirLine(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public int getAirLineId() {
		return airLineId;
	}

	public void setAirLineId(int airLineId) {
		this.airLineId = airLineId;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAllowance() {
		return allowance;
	}

	public void setAllowance(String allowance) {
		this.allowance = allowance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAirportType() {
		return airportType;
	}

	public void setAirportType(String airportType) {
		this.airportType = airportType;
	}

	@Override
	public String toString() {
		return "AirLine [airLineId=" + airLineId + ", flightNumber=" + flightNumber + ", allowance=" + allowance
				+ ", name=" + name + ", airportType=" + airportType + "]";
	}

	public String getAirlineId() {
		// TODO Auto-generated method stub
		return null;
	}
    
    

}
