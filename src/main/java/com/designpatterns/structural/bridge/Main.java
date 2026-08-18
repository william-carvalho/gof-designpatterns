package com.designpatterns.structural.bridge;

public class Main {

    public static void main(String[] args) {
        RemoteControl televisionRemote = new RemoteControl(new Television());
        televisionRemote.powerOn();
        televisionRemote.changeVolume(30);
        televisionRemote.powerOff();

        System.out.println();

        AdvancedRemoteControl radioRemote =
                new AdvancedRemoteControl(new Radio());
        radioRemote.powerOn();
        radioRemote.changeVolume(15);
        radioRemote.mute();
        radioRemote.powerOff();
    }
}
