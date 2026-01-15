package edu.java.development;

public class TicketService {

    public Ticket calculatePrice(Flight flight, String seatClass) {
        int basePrice = flight.getDistanceKm() * 10;

        if (seatClass.equalsIgnoreCase("BUSINESS")) {
            basePrice *= 2;
        }

        return new Ticket(basePrice);
    }
}
