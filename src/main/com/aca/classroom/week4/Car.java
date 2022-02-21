package com.aca.classroom.week4;

public class Car {

    private AudioPlayer audioPlayer;

    public Car() {
    }

    public Car(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setAudioPlayer(new AudioPlayer());

        Car car2 = new Car(new AudioPlayer());
        Car car3 = new Car(null);
    }

    public void setAudioPlayer(AudioPlayer play) {
        this.audioPlayer = play;
    }
}
