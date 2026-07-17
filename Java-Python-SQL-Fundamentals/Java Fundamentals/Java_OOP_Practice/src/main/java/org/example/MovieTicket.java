package org.example;

public class MovieTicket {

    private String movieTitle;
    private int seatNumber;
    private boolean ticketBooked;

    public MovieTicket(String Title, int SeatNumber) {

        this.movieTitle = Title;
        this.seatNumber = SeatNumber;

        ticketBooked = false;
    }

    public void bookTicket() {

        if (ticketBooked) {
            System.out.println("Ticket already booked.");
            return;
        }

        System.out.println("Ticket booked successfully.");
        ticketBooked = true;
    }

    public void cancelBooking() {

        if (!ticketBooked) {
            System.out.println("No booking exists.");
            return;
        }

        System.out.println("Booking cancelled.");
        ticketBooked = false;
    }

    // ✅ CORRECTION:
    // Return a String instead of printing directly.
    // This makes it reusable.
    public String displayTicket() {

        return "Movie: " + movieTitle +
                "\nSeat Number: " + seatNumber +
                "\nBooked: " + ticketBooked;
    }

}