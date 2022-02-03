package com.aca.classroom.week4;

public class Market {

    public static Car carOption1() {
        Car car = new Car();
        AudioPlayer audioPlayer = new AudioPlayer();
        car.setAudioPlayer(audioPlayer);

        return car;
    }

    public static Car carOption2() {
        return new Car();
    }

    public static void main(String[] args) {
        carOption1();
    }
}
