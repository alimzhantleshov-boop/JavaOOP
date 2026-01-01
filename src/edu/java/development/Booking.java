package edu.java.development;

public class Booking {
    private Passenger passenger;
    private Flight flight;
    private String status;

    public Booking(Passenger passenger, Flight flight, String status) {
        this.passenger = passenger;
        this.flight = flight;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
