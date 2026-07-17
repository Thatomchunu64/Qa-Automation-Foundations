package org.example;


public class GamingAccount extends Account {

    private String membershipLevel;
    private GameLibrary library;

    public GamingAccount(String Username, String Email, String membership, String libraryName) {

        super(Username, Email);
        this.membershipLevel = membership;
        this.library = new GameLibrary(libraryName);


    }

    public void buyGame() {

        if (!isUserLoggedIn()) {
            System.out.println("Please login first.");
            return;

        }
        library.addGame();
    }

    public void uninstallGame() {

        if (!isUserLoggedIn()) {
            System.out.println("Please login first.");
            return;

        }
        library.removeGame();

    }

    public void resetLibrary() {

        if (!isUserLoggedIn()) {
            System.out.println("Please login first.");
            return;

        }
        library.clearLibrary();
    }

    public void viewLibrary() {

        if (!isUserLoggedIn()) {
            System.out.println("Please login first.");
            return;

        }
        library.displayLibrary();
    }

    public void upgradeMembership(String newLevel) {

        if (!isUserLoggedIn()) {
            System.out.println("Please login first.");
            return;

        }

        if (membershipLevel.equals(newLevel)) {
            System.out.println("Already using " + membershipLevel + " membership.\n");
            return;
        }

        membershipLevel = newLevel;
        System.out.println("Successfully upgraded membership to " + membershipLevel);

    }


    public String getGamingInfo() {

        return super.getAccountInfo() + "Membership: " + membershipLevel + "\n";

    }


}
