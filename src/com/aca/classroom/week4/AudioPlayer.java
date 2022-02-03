package com.aca.classroom.week4;

public class AudioPlayer {

    private boolean isPlaying;

    public AudioPlayer() {
        super();
        System.out.println("AudioPlayer");
    }

    public void play() {
        isPlaying = true;
        System.out.println("Playing...");
    }

    public void stop() {
        isPlaying = false;
        System.out.println("Stopped!");
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }
}
