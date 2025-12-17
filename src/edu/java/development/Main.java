package edu.java.development;

public class Main {
    public static void main(String[] args) {

        FlightTicket airAstana =
                new FlightTicket("Air Astana", 55000, 1.5, 23);

        FlightTicket scAt =
                new FlightTicket("SCAT", 42000, 2.0, 20);

        // 1) какой дешевле
        FlightTicket cheaper =
                (airAstana.getPrice() < scAt.getPrice()) ? airAstana : scAt;

        // 2) какой выгоднее по времени
        FlightTicket betterByTime =
                (airAstana.costPerHour() < scAt.costPerHour()) ? airAstana : scAt;

        System.out.println("Cheaper ticket: " + cheaper.getAirline());
        System.out.println("Better by time: " + betterByTime.getAirline());

        System.out.println("Air Astana cost/hour = " + airAstana.costPerHour());
        System.out.println("SCAT cost/hour = " + scAt.costPerHour());


        Flight flight1 = new Flight("KC123", "Astana", "Almaty", 25000);

        Passanger passenger1 = new Passanger("Alimzhan", "KZ123456", 19);


        Booking booking1 = new Booking("B001", passenger1, flight1, "12A", "CONFIRMED");

        // Вывод информации
        flight1.displayInfo();
        System.out.println("----------------------");
        passenger1.displayInfo();
        System.out.println("----------------------");
        booking1.displayInfo();
    }
}
