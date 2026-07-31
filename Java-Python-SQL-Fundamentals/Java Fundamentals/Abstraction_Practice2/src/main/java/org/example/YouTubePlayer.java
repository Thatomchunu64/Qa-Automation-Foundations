package org.example;

public class YouTubePlayer implements Playable {

    private String videoName;

    public YouTubePlayer(String videoTitle) {

        this.videoName = videoTitle;

    }

    @Override
    public void play() {

        System.out.println("Playing " + videoName);

    }

    @Override
    public void pause() {

        System.out.println("Video paused");

    }

    @Override
    public void stop() {

        System.out.println("Video playback stopped");

    }

    public void subscribeChannel() {

        System.out.println("You are now subscribed to the channel");

    }
}
