package edu.java.development;

class FlightTicket {
    private String airline;     // авиакомпания
    private int price;          // цена в тенге
    private double flightHours; // длительность полёта (часы)
    private int baggageKg;      // багаж

    public FlightTicket(String airline, int price, double flightHours, int baggageKg) {
        this.airline = airline;
        this.price = price;
        this.flightHours = flightHours;
        this.baggageKg = baggageKg;
    }

    // геттеры
    public int getPrice() { return price; }
    public double getFlightHours() { return flightHours; }
    public int getBaggageKg() { return baggageKg; }
    public String getAirline() { return airline; }

    // МАТЕМАТИКА №1: цена за 1 час
    public double costPerHour() {
        return price / flightHours;
    }

    // МАТЕМАТИКА №2: цена за 1 кг багажа
    public double costPerKg() {
        return price / (double) baggageKg;
    }
}
