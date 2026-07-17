package org.example;

public class UserAccount {

    private String username, email;
    private boolean isLoggedin;

    public UserAccount(String Username, String Email) {

        this.username = Username;
        this.email = Email;

        isLoggedin = false;
    }

    public void login() {
        if (isLoggedin) {
            System.out.println("Already Logged in");
            return;
        }
        System.out.println("Logging in..." + "\nWelcome " + username);
        isLoggedin = true;

    }


    public void logout() {
        if (!isLoggedin) {
            System.out.println("Error: Not logged in");
            return;
        }
        System.out.println("Logging out...");
        isLoggedin = false;

    }

    protected boolean isUserLoggedIn() {
        return isLoggedin;
    }

    public String getAccountInfo() {
        return "Account Details: \n" +
                "Username: " + username +
                "\nEmail: " + email +
                "Login Status: " + isLoggedin +
                "\n";

    }

}//END OF CLASS
