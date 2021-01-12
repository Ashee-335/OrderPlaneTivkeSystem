package cn.edu.hcnu.bean;

public class Flight {
    private String id;//主键， UUID
    private String flightId;
    private String planeType;//飞机类型
    private int currentseatNumb;//当前座位数
    private String departureAirPort;//出发机场
    private String destinationAirPort;//到达机场
    private String departureTime;//出发时间

    public Flight(String id, String flightId, String planeType, int currentseatNumb, String departureAirPort, String destinationAirPort, String departureTime) {
        this.id = id;
        this.flightId = flightId;
        this.planeType = planeType;
        this.currentseatNumb = currentseatNumb;
        this.departureAirPort = departureAirPort;
        this.destinationAirPort = destinationAirPort;
        this.departureTime = departureTime;
    }//构造方法（先Alt+Insert 后点击Constructor 后Ctrl+A 最后点击OK），
    // 用于UI层的MainUI中的Flight flight =new Flight(id,flightId,planeType,
    // departureAirPort,destinationAirPort,departureTime),使其面向对象，后期不用改太多代码


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public int getCurrentseatNumb() {
        return currentseatNumb;
    }

    public void setCurrentseatNumb(int currentseatNumb) {
        this.currentseatNumb = currentseatNumb;
    }

    public String getDepartureAirPort() {
        return departureAirPort;
    }

    public void setDepartureAirPort(String departureAirPort) {
        this.departureAirPort = departureAirPort;
    }

    public String getDestinationAirPort() {
        return destinationAirPort;
    }

    public void setDestinationAirPort(String destinationAirPort) {
        this.destinationAirPort = destinationAirPort;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    //重写
    @Override
    public String toString() {
        return "Flight{" +
                "flightId='" + flightId + '\'' +
                ", planeType='" + planeType + '\'' +
                ", currentseatNumb='" + currentseatNumb + '\'' +
                ", departureAirPort='" + departureAirPort + '\'' +
                ", destinationAirPort='" + destinationAirPort + '\'' +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }
}
