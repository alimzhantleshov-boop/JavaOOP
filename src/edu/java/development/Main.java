package edu.java.development;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static UserService userService = new UserService();

    public static void main(String[] args) {

        User currentUser = null;

        while (currentUser == null) {
            System.out.println("\n1. Register");
            System.out.println("2. Login");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Username: ");
                String u = scanner.nextLine();
                System.out.print("Password: ");
                String p = scanner.nextLine();

                if (userService.register(u, p)) {
                    System.out.println("✅ Registered");
                } else {
                    System.out.println("❌ Username exists");
                }
            }

            if (choice == 2) {
                System.out.print("Username: ");
                String u = scanner.nextLine();
                System.out.print("Password: ");
                String p = scanner.nextLine();

                currentUser = userService.login(u, p);

                if (currentUser == null) {
                    System.out.println("❌ Wrong login");
                }
            }
        }

        System.out.println("\nWelcome, " + currentUser.getUsername());
        buyTicket();
    }

    static void buyTicket() {

        System.out.print("From city: ");
        String from = scanner.nextLine();

        System.out.print("To city: ");
        String to = scanner.nextLine();

        System.out.print("Flight date (YYYY-MM-DD): ");
        LocalDate date = LocalDate.parse(scanner.nextLine());

        // простая "карта"
        int distance = from.equalsIgnoreCase("Astana")
                && to.equalsIgnoreCase("Almaty") ? 1200 : 800;

        Flight flight = new Flight(from, to, distance);

        int price = TicketService.calculatePrice(flight, date);

        System.out.println("\n🎫 TICKET CONFIRMED");
        System.out.println("Route: " + flight.getRoute());
        System.out.println("Date: " + date);
        System.out.println("Price: " + price + " KZT");
    }
}
