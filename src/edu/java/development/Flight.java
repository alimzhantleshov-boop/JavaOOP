package edu.java.development;

public class Flight {
    private String flightNo;
    private String departure;
    private String arrival;
    private double price;
    public Flight(String flightNo, String departure, String arrival, double price) {
        this.flightNo = flightNo;
        this.departure = departure;
        this.arrival = arrival;
        this.price = price;
    }
    public String getFlightNo() {
        return flightNo;
    }
    public String getDeparture() {
        return departure;
    }
    public void setDeparture (String departure) {
        this.departure = departure;
    }
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }
    public void displayInfo(){
        System.out.println("Flight " + flightNo + ": " + departure + " → " +  arrival);
        System.out.println("Price " + price );
    }

}

