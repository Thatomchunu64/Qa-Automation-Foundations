package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ClientAccount customer1 = new ClientAccount("JED 32", "jedediah@gmail.com", "GOLD");
        ClientAccount customer2 = new ClientAccount("Thato", "tmsofficial63@gmail.com", "PLATINUM");


        System.out.println(customer1.getAccDetails());
        System.out.println(customer2.getAccDetails());

        //Before login procedures
        customer1.logout();
        customer1.viewCart();
        customer1.addItemToCart();
        customer1.removeItemFromCart();
        customer1.upgradeMembership("GOLD");

        // After Login procedures
        customer1.login();

        //add items procedure
        customer1.addItemToCart();
        customer1.addItemToCart();
        customer1.addItemToCart();
        System.out.println("\n");// just for visual presentation of details on console

        //view cart after adding items
        customer1.viewCart();

        //remove items procedure
        customer1.removeItemFromCart();
        customer1.removeItemFromCart();
        System.out.println("\n");// just for visual presentation of details on console

        //view cart after removing items
        customer1.viewCart();

        // see if it displays error for trying to remove items when cart empty
        customer1.removeItemFromCart();
        customer1.removeItemFromCart();

        //clear car procedure
        customer1.addItemToCart();
        customer1.addItemToCart();
        customer1.clearShoppingCart();
        customer1.clearShoppingCart();
        System.out.println("\n");// just for visual presentation of details on console

        //view cart after clearing cart
        customer1.viewCart();

        //MEMBERSHIP PROCEDURE
        customer1.upgradeMembership("GOLD");
        customer1.upgradeMembership("PLATINUM");

        //view account details after changes
        System.out.println(customer1.getAccDetails());

        customer1.logout();


    }
}