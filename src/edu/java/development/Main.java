package edu.java.development;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    // КАРТА РАССТОЯНИЙ
    static Map<String, Integer> distanceMap = new HashMap<>();

    public static void main(String[] args) {

        // Заполняем карту (как база данных)
        initDistances();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter passport number: ");
        String passport = scanner.nextLine();

        System.out.print("From city: ");
        String from = scanner.nextLine();

        System.out.print("To city: ");
        String to = scanner.nextLine();

        System.out.print("Enter flight date (YYYY-MM-DD): ");
        LocalDate flightDate = LocalDate.parse(scanner.nextLine());

        int distance = getDistance(from, to);

        int basePrice = distance * 15;

        long daysBefore = ChronoUnit.DAYS.between(LocalDate.now(), flightDate);
        double multiplier = getDateMultiplier(daysBefore);

        int finalPrice = (int) (basePrice * multiplier);

        System.out.println("\n=== TICKET INFO ===");
        System.out.println("Passenger: " + name);
        System.out.println("Passport: " + passport);
        System.out.println("Route: " + from + " -> " + to);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Days before flight: " + daysBefore);
        System.out.println("Final price: " + finalPrice + " KZT");
        System.out.println("Status: CONFIRMED");
    }

    // Заполняем карту расстояний
    static void initDistances() {
        distanceMap.put("Astana-Almaty", 1200);
        distanceMap.put("Almaty-Astana", 1200);

        distanceMap.put("Astana-Shymkent", 1400);
        distanceMap.put("Shymkent-Astana", 1400);

        distanceMap.put("Almaty-Shymkent", 700);
        distanceMap.put("Shymkent-Almaty", 700);
    }

    // Получаем расстояние из карты
    static int getDistance(String from, String to) {
        String key = from + "-" + to;

        if (distanceMap.containsKey(key)) {
            return distanceMap.get(key);
        }

        return 1000; // если маршрут неизвестен
    }

    // Надбавка по дате
    static double getDateMultiplier(long days) {
        if (days < 7) return 1.5;
        if (days <= 30) return 1.2;
        return 1.0;
    }
}
