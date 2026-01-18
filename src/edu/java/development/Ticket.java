package edu.java.development;

public class Ticket {
    private int price;

    public Ticket(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public boolean isMoreExpensiveThan(Ticket other) {
        return this.price > other.price;
    }
}
