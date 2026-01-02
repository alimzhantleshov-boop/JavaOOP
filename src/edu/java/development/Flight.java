package edu.java.development;

public class Flight {
    private String from;
    private String to;
    private int distance;

    public Flight(String from, String to, int distance) {
        this.from = from;
        this.to = to;
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public String getRoute() {
        return from + " → " + to;
    }
}
