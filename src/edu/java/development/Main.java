package edu.java.development;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            UserService userService = new UserService();
             System.out.print("Create username: ");
              String username = scanner.nextLine();
            System.out.print("Create password: ");
        String password = scanner.nextLine();

        User user = userService.register(username, password);
            System.out.println("User created: " + user.getUsername());

        System.out.print("Enter passenger name: ");
            String name = scanner.nextLine();
        System.out.print("Enter passport number: ");
            String passport = scanner.nextLine();

        Passenger passenger = new Passenger(name, passport);

        Flight flight = new Flight("KC123", "Astana", "Almaty", 1200);

        System.out.print("Choose class (ECONOMY/BUSINESS): ");
        String seatClass = scanner.nextLine();

        TicketService ticketService = new TicketService();
        Ticket ticket = ticketService.calculatePrice(flight, seatClass);

        Booking booking = new Booking(passenger, flight);

        System.out.println("\n--- BOOKING INFO ---");
        booking.displayInfo();
        System.out.println("Ticket price: " + ticket.getPrice() + " KZT");
    }
}
