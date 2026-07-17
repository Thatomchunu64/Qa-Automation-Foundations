package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GamingAccount user1 = new GamingAccount
                ("Cole_89", "cole34@gmail.com", "GOLD", "Favourites");

        GamingAccount user2 = new GamingAccount
                ("Swiss_Chester", "chester654@gmail.com", "PLATINUM", "Installed Games");

        GamingAccount user3 = new GamingAccount
                ("EXS_64", "exstasy64@gmail.com", "PREMIUM PLATINUM", "My Games");

        System.out.println(user1.getGamingInfo());
        System.out.println(user2.getGamingInfo());
        System.out.println(user3.getGamingInfo());

        System.out.println("\n --------------------------------------------------------------- \n");

        //Before login security checks
        user1.logout();
        user1.buyGame();
        user1.uninstallGame();
        user1.resetLibrary();
        user1.upgradeMembership("PLATINUM");
        user1.viewLibrary();

        System.out.println("\n --------------------------------------------------------------- \n");

        //After login Procedures
        user1.login();

        //ADD GAME PROCEDURE
        user1.buyGame();
        user1.buyGame();
        user1.buyGame();
        user1.viewLibrary();

        System.out.println("\n --------------------------------------------------------------- \n");

        //REMOVE GAME PROCEDURE
        user1.uninstallGame();
        user1.uninstallGame();
        user1.viewLibrary();

        System.out.println("\n --------------------------------------------------------------- \n");

        //Clear library
        user1.resetLibrary();
        user1.resetLibrary();
        user1.viewLibrary();

        System.out.println("\n --------------------------------------------------------------- \n");

        //Upgrade membership procedures
        user1.upgradeMembership("GOLD");
        user1.upgradeMembership("PLATINUM");
        System.out.println(user1.getGamingInfo());

        user1.logout();


    }
}