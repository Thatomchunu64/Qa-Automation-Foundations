package org.example;


public class Account {

    private String username, email;
    private boolean isLoggedIn;


    public Account(String UserName, String mail) {

        this.username = UserName;
        this.email = mail;
        isLoggedIn = false;
    }

    public void login() {

        if (isLoggedIn) {
            System.out.println("Already logged in.");
            return;

        }

        System.out.println("Logging in... \nWelcome " + username);
        isLoggedIn = true;

    }

    public void logout() {
        if (!isLoggedIn) {
            System.out.println("Already logged out!");
            return;

        }

        System.out.println("Logged out successfully");
        isLoggedIn = false;

    }

    protected boolean isUserLoggedIn() {
        return isLoggedIn;

    }

    public String getAccountInfo() {

        return "Account details: " +
                "\nUsername: " + username +
                "\nEmail: " + email +
                "\nLogin Status: " + isLoggedIn +
                "\n";

    }


}
