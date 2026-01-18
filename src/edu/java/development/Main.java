package edu.java.development;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        Connection conn = DBConnection.getConnection();
        if (conn == null) return;

        try {
            Statement stmt = conn.createStatement();

            // CREATE
            stmt.executeUpdate("""
                INSERT INTO flight (flight_number, origin, destination)
                VALUES ('KZ101', 'Almaty', 'Astana')
            """);

            // READ
            ResultSet rs = stmt.executeQuery("SELECT * FROM flight");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("flight_number") + " " +
                                rs.getString("origin") + " " +
                                rs.getString("destination")
                );
            }

            // UPDATE
            stmt.executeUpdate("""
                UPDATE flight
                SET destination = 'Shymkent'
                WHERE flight_number = 'KZ101'
            """);

            // DELETE
            stmt.executeUpdate("""
                DELETE FROM flight
                WHERE flight_number = 'KZ101'
            """);

            stmt.close();
            conn.close();

            System.out.println("CRUD done");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
