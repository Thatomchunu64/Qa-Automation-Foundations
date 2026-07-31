package org.example;

public class SpotifyPlayer implements Playable {

    private String currentSong;

    public SpotifyPlayer(String currentSong) {

        this.currentSong = currentSong;
    }

    @Override
    public void play() {

        System.out.println("Playing " + currentSong);

    }

    @Override
    public void pause() {

        System.out.println("Music paused.");
    }

    @Override
    public void stop() {

        System.out.println("Music stopped.");

    }

    public void likeSong() {
        System.out.println("Song added to Favourites");
    }

}
