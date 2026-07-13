package org.example;

//COMPOSITION CLASS
public class ShoppingCart {

    private String cartName;
    private int totalItems;


    public ShoppingCart(String cartName) {

        this.cartName = cartName;
        totalItems = 0;

    }

    public void addItem() {

        totalItems++;
        System.out.println("Item added.");

    }

    public void removeItem() {

        if (totalItems == 0) {

            System.out.println("Cart is already empty.\n");
            return;
        }

        totalItems--;
        System.out.println("Item removed.");


    }

    public void clearCart() {

        if (totalItems == 0) {

            System.out.println("Cart is already empty.\n");
            return;
        }

        System.out.println("Cart cleared");
        totalItems = 0;


    }

    public String displayCart() {

        return "Details: \n" +
                "Cart: " + cartName +
                "\nItems: " + totalItems +
                "\n";


    }


}
