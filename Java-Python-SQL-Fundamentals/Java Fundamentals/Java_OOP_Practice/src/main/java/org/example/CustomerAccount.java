package org.example;

public class CustomerAccount extends UserAccount {

    private String membership;

    private MovieTicket movieTicket;

    // Constructor
    public CustomerAccount(String username, String email, String membership, String movieTitle, int seatNumber) {

        super(username, email);

        this.membership = membership;

        // ❌ ORIGINAL:
        // MovieTicket movieTicket = new MovieTicket(...);

        // ✅ CORRECTION:
        // Assign the MovieTicket to the class variable.
        this.movieTicket = new MovieTicket(movieTitle, seatNumber);
    }

    public void reserveMovie() {

        if (!isUserLoggedIn()) {
            System.out.println("Error: Login first.");
            return;
        }

        movieTicket.bookTicket();
    }

    public void cancelReservation() {

        if (!isUserLoggedIn()) {
            System.out.println("Error: Login first.");
            return;
        }

        movieTicket.cancelBooking();
    }

    public void viewTicket() {

        if (!isUserLoggedIn()) {
            System.out.println("Error: Login first.\n");
            return;
        }

        // ❌ ORIGINAL:
        // movieTicket.displayTicket();

        // ✅ CORRECTION:
        // displayTicket() now returns a String.
        System.out.println(movieTicket.displayTicket());
    }

    public void upgradeMembership(String newMembership) {

        // ✅ CORRECTION:
        // User should be logged in before upgrading.
        if (!isUserLoggedIn()) {
            System.out.println("Error: Login first.");
            return;
        }

        if (membership.equals(newMembership)) {

            System.out.println("Already a " + membership + " member.");
            return;
        }

        membership = newMembership;

        System.out.println("Membership upgraded to " + membership);
    }

    public String getCustomerInfo() {

        // ❌ ORIGINAL:
        // return super.getAccountInfo() + membership;

        // ✅ CORRECTION:
        return super.getAccountInfo() +
                "Membership: " + membership +
                "\n";
    }

}