package org.example;


public class GameLibrary {

    private String libraryName;
    private int gamesOwned;


    public GameLibrary(String libraryName) {

        this.libraryName = libraryName;
        gamesOwned = 0;

    }

    public void addGame() {

        System.out.println("Game added to library.");
        gamesOwned++;


    }

    public void removeGame() {

        if (gamesOwned <= 0) {
            System.out.println("Library is empty.");
            return;
        }

        System.out.println("Game removed.");
        gamesOwned--;

    }

    public void clearLibrary() {

        if (gamesOwned <= 0) {
            System.out.println("Library is empty.");
            return;
        }

        System.out.println("Library cleared.");
        gamesOwned = 0;


    }

    public String displayLibrary() {

        return "Library Name: " + libraryName +
                "\nGames Owned: " + gamesOwned;


    }


}
