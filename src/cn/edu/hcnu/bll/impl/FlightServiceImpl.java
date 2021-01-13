package cn.edu.hcnu.bll.impl;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.bll.IFlightService;
import cn.edu.hcnu.dao.IFlightDao;
import cn.edu.hcnu.dao.impl.FlightDaoIm1;

import java.sql.SQLException;
import java.util.Set;

public class FlightServiceImpl implements IFlightService {

    IFlightDao iFlightDao;//定义一个类

    //构造这个方法，调用这个FlightDaoIml()方法
    public FlightServiceImpl(){
        iFlightDao=new FlightDaoIm1();
    }

    //throws SQLException抛出异常
    @Override
    public void insertFlight(Flight flight) throws SQLException {
        iFlightDao.insertFlight(flight);
        System.out.println("界面传来的航班信息");
    }

    @Override
    public Set<Flight> getAllFlights() {
        return null;
    }

    @Override
    public Flight getFlightByDepartureTime(String departureTime) {
        return null;
    }

    @Override
    public Flight getFlightByDepartureAirPort(String departureAirPort) {
        return null;
    }

    @Override
    public Flight getFlightByDestinationAirPort(String DestinationAirPort) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
