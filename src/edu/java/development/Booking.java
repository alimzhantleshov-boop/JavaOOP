package edu.java.development;

public class Booking {
    private String bookkingld;
    private Passanger passanger;
    private Flight flight;
    private String seatNo;
    private String status;
    public Booking(String bookingld, Passanger passanger, Flight flight, String seatNo, String status) {
        this.bookkingld = bookingld;
        this.passanger = passanger;
        this.flight = flight;
        this.seatNo = seatNo;
        this.status = status;
    }
    public String getBookkingld() {
        return bookkingld;
    }
    public Passanger getPassanger() {
        return passanger;
    }
    public Flight getFlight() {
        return flight;
    }
    public String getSeatNo() {
        return seatNo;
    }
    public String getStatus() {
        return status;
    }
    public void setSeatNumber(String seatNumber) {
        this.seatNo = seatNo;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    public void confirm(){
        this.status = "CONFIRMED";
    }

    public void cancel(){
        this.status = "CANCELLED";
    }

    public void displayInfo(){
        System.out.println("Booking ID: " + bookkingld);
        System.out.println("Passanger: " + passanger.getName());
        System.out.println("Flight: " + flight.getFlightNo());
        System.out.println("Seat No: " + seatNo);
        System.out.println("Status: " + status);
    }
}
