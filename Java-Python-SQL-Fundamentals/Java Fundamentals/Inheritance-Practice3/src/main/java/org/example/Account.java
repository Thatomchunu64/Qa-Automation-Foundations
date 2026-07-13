package org.example;

//Parent
public class Account {

    private String username;
    private String email;
    private boolean isLoggedIn;


    
    public Account(String username, String email) {

        this.username = username;
        this.email = email;
        isLoggedIn = false;
    }


    public void login() {
        if (isLoggedIn) {
            System.out.println("Already logged in");
            return;
        }
        System.out.println("Logging in....\n" + "Welcome " + username);
        isLoggedIn = true;

    }

    public void logout() {
        if (!isLoggedIn) {
            System.out.println("Already logged out");
            return;
        }

        System.out.println("Logging out...");
        isLoggedIn = false;

    }

    protected boolean isUserLoggedIn() {
        return isLoggedIn;
    }

    public String getAccountInfo() {

        return "Account details:\n" +
                "Username: " + username +
                "\nEmail: " + email +
                "\nLogin Status: " + isLoggedIn+
                "\n";
    }


}