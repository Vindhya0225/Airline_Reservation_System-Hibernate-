package com.demo.dao;

import com.demo.Airline_Reservation.entities.AirLine;

public interface AirlineDao {
    
    // Method to create a new airline
    AirLine createAirline(AirLine airline);
    
    // Method to retrieve airline details based on airline ID
    AirLine getAirlineDetails(String airlineId);
    
    // Method to update airline details
    AirLine updateAirline(String airlineId, AirLine airline);
    
    // Method to delete an airline by airline ID
    String deleteAirline(String airlineId);
}
