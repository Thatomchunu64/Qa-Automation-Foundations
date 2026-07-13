package org.example;

//CHILD
public class ClientAccount extends Account {
    private String membershipLevel;
    private ShoppingCart shoppingCart;


    public ClientAccount(String username, String email, String membershipLevel) {
        super(username, email);
        this.membershipLevel = membershipLevel;
        shoppingCart = new ShoppingCart("My Shopping Cart");

    }

    public void addItemToCart() {

        if (!isUserLoggedIn()) {
            System.out.println("Error: Login to Account\n");
            return;
        }

        shoppingCart.addItem();

    }

    public void removeItemFromCart() {
        if (!isUserLoggedIn()) {
            System.out.println("Error: Login to Account\n");
            return;
        }

        shoppingCart.removeItem();


    }

    public void clearShoppingCart() {
        if (!isUserLoggedIn()) {
            System.out.println("Error: Login to Account\n");
            return;
        }
        shoppingCart.clearCart();
    }

    public void upgradeMembership(String newLevel) {
        if (!isUserLoggedIn()) {
            System.out.println("Error: Login to Account\n");
            return;
        }

        if (membershipLevel.equals(newLevel)) {

            System.out.println("Already using " + membershipLevel);
        } else {
            System.out.println("Membership upgraded to " + newLevel + "\n");
            membershipLevel = newLevel;
        }


    }

    public void viewCart() {
        if (!isUserLoggedIn()) {
            System.out.println("Error: Login to Account\n");
            return;
        }

        System.out.println(shoppingCart.displayCart());

    }

    public String getAccDetails() {

        return getAccountInfo() + "Membership: " + membershipLevel + "\n";

    }

}
