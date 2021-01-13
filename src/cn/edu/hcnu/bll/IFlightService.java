package cn.edu.hcnu.bll;


import cn.edu.hcnu.bean.Flight;

import java.sql.SQLException;
import java.util.Set;

public interface IFlightService {
   void insertFlight(Flight flight) throws SQLException;
    Set<Flight> getAllFlights();
    Flight getFlightByDepartureTime(String departureTime);
    Flight getFlightByDepartureAirPort(String departureAirPort);
    Flight getFlightByDestinationAirPort(String DestinationAirPort);
    void updateFlight(Flight flight);
}
