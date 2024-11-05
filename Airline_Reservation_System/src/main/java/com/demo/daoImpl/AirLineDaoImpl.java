package com.demo.daoImpl;

import com.demo.dao.AirlineDao;
import com.demo.Airline_Reservation.entities.AirLine;

import java.util.HashMap;
import java.util.Map;

public class AirLineDaoImpl implements AirlineDao {
    private Map<String, AirLine> airlineDatabase = new HashMap<>();

    @Override
    public AirLine createAirline(AirLine airline) {
        airlineDatabase.put(airline.getAirlineId(), airline);
        return airline;
    }

    @Override
    public AirLine getAirlineDetails(String airlineId) {
        return airlineDatabase.get(airlineId);
    }

    @Override
    public AirLine updateAirline(String airlineId, AirLine airline) {
        airlineDatabase.put(airlineId, airline);
        return airline;
    }

    @Override
    public String deleteAirline(String airlineId) {
        airlineDatabase.remove(airlineId);
        return "Airline with ID " + airlineId + " has been deleted.";
    }
}
