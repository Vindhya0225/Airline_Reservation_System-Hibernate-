package com.demo.Airline_Reservation.services.impl;

import com.demo.Airline_Reservation.entities.AirLine;
import com.demo.ARS.services.AirLineService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AirLineServiceImpl implements AirLineService {
    // Use a Map to store airlines, with the airline ID as the key
    private Map<String, AirLine> airlineDatabase = new HashMap<>();

    @Override
    public AirLine createAirline(AirLine airline) {
        // Store the airline in the database using its ID
        airlineDatabase.put(airline.getAirlineId(), airline);
        return airline; // Return the created airline
    }

    @Override
    public AirLine getAirlineById(String airlineId) {
        // Retrieve the airline by its ID
        return airlineDatabase.get(airlineId);
    }

    @Override
    public AirLine updateAirline(String airlineId, AirLine airline) {
        // Update the airline details
        return airlineDatabase.put(airlineId, airline);
    }

    @Override
    public String deleteAirline(String airlineId) {
        // Remove the airline from the database
        airlineDatabase.remove(airlineId);
        return "Airline deleted successfully";
    }

    @Override
    public List<AirLine> getAllAirlines() {
        // Return a list of all airlines
        return new ArrayList<>(airlineDatabase.values());
    }
}
