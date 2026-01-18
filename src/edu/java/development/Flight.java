package edu.java.development;

public class Flight {
    private String flightNumber;
    private String from;
    private String to;
    private int distanceKm;

    public Flight(String flightNumber, String from, String to, int distanceKm) {
        this.flightNumber = flightNumber;
        this.from = from;
        this.to = to;
        this.distanceKm = distanceKm;
    }

    public int getDistanceKm() {
        return distanceKm;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
}
