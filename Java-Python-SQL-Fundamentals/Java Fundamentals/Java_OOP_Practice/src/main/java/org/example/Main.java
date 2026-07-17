package org.example;

public class Main {
    public static void main(String[] args) {

        CustomerAccount customer1 = new CustomerAccount(
                "Jared45",
                "jared@gmail.com",
                "GOLD",
                "Interstellar",
                12
        );

        CustomerAccount customer2 = new CustomerAccount(
                "Kane335",
                "kane@gmail.com",
                "DIAMOND",
                "Avatar",
                8
        );

        CustomerAccount customer3 = new CustomerAccount(
                "BruceYena",
                "bruce@gmail.com",
                "PLATINUM",
                "John Wick 4",
                20
        );

        System.out.println(customer1.getCustomerInfo());
        System.out.println(customer2.getCustomerInfo());
        System.out.println(customer3.getCustomerInfo());

        System.out.println("---------------------------");

        // Before login
        customer1.reserveMovie();
        customer1.viewTicket();
        customer1.logout();

        System.out.println("---------------------------");

        customer1.login();

        customer1.reserveMovie();
        customer1.viewTicket();

        customer1.cancelReservation();
        customer1.viewTicket();

        customer1.upgradeMembership("PLATINUM");

        System.out.println(customer1.getCustomerInfo());

        customer1.logout();
    }
}