package com.demo.ARS.services;
import com.demo.Airline_Reservation.entities.AirLine;

import java.util.List;

public interface AirLineService {
	// Method to create a new airline
    AirLine createAirline(AirLine airline);
    
    // Method to retrieve an airline by ID
    AirLine getAirlineById(String airlineId);
    
    // Method to update airline details
    AirLine updateAirline(String airlineId, AirLine airline);
    
    // Method to delete an airline by ID
    String deleteAirline(String airlineId);
    
    // Method to retrieve all airlines
    List<AirLine> getAllAirlines();

}
