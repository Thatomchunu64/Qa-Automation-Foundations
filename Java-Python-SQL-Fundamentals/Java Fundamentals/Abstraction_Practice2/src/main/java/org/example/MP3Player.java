package org.example;

public class MP3Player implements Playable {

    private String deviceName;

    public MP3Player(String deviceName) {

        this.deviceName = deviceName;

    }

    @Override
    public void play() {

        System.out.println("Playing music on "+deviceName);

    }

    @Override
    public void pause() {

        System.out.println("Playback paused.");

    }

    @Override
    public void stop() {

        System.out.println("Playback stopped.");

    }

    public void chargeBattery() {

        System.out.println("Battery fully charged.");

    }
}
