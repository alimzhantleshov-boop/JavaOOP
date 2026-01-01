package edu.java.development;

public class Flight {
    private String from;
    private String to;
    private int price;

    public Flight(String from, String to, int price) {
        this.from = from;
        this.to = to;
        this.price = price;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getPrice() {
        return price;
    }
}
