package com.aca.classroom.week4;

public class AdvancedAudioPlayer extends AudioPlayer {
             //SUB CLASS                 SUPER CLASS
    public static void main(String[] args) {
        //AdvancedAudioPlayer advancedAudioPlayer = new AdvancedAudioPlayer();
        //advancedAudioPlayer.play();
//
        //advancedAudioPlayer.setPlaying(false);

        new AdvancedAudioPlayer();
    }

    public AdvancedAudioPlayer() {
        super();
        System.out.println("AdvancedAudioPlayer");
    }

    @Override
    public void play() {
        super.play();
    }

    public void pause() {
        System.out.println("Paused!");
    }
}
