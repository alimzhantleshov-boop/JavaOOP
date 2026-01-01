package edu.java.development;

import java.time.LocalDate;

public class TicketService {

    public static int calculatePrice(Flight flight, LocalDate date) {

        int basePrice = flight.getDistance() * 50;

        long daysLeft = LocalDate.now().until(date).getDays();

        if (daysLeft <= 3) {
            basePrice *= 1.5;
        } else if (daysLeft <= 7) {
            basePrice *= 1.2;
        }

        return basePrice;
    }
}
