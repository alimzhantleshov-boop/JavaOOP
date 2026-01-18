package edu.java.development;

public class Booking {
    private Passenger passenger;
    private Flight flight;
    private String status;

    public Booking(Passenger passenger, Flight flight) {
        this.passenger = passenger;
        this.flight = flight;
        this.status = "CONFIRMED";
    }

    public void displayInfo() {
        System.out.println("Passenger: " + passenger.getName());
        System.out.println("Flight: " + flight.getFlightNumber());
        System.out.println("Status: " + status);
    }
}
