package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SpotifyPlayer spotifyPlay = new SpotifyPlayer("Drake: Get along better");

        System.out.println("Spotify music: \n");
        spotifyPlay.play();
        spotifyPlay.likeSong();
        spotifyPlay.pause();
        spotifyPlay.stop();

        System.out.println("\n----------------------------------------------\n");

        MP3Player mp3Play = new MP3Player("Ipod");

        System.out.println("Apple music: \n");
        mp3Play.play();
        mp3Play.pause();
        mp3Play.stop();
        mp3Play.chargeBattery();

        System.out.println("\n----------------------------------------------\n");

        YouTubePlayer youtubePlay = new YouTubePlayer("Insidious M - Rampage");

        System.out.println("Youtube music: \n");
        youtubePlay.play();
        youtubePlay.pause();
        youtubePlay.subscribeChannel();
        youtubePlay.stop();

        System.out.println("END OF TESTS");


    }
}