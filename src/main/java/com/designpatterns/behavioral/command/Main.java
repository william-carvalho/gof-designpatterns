package com.designpatterns.behavioral.command;

public class Main {

    public static void main(String[] args) {
        Light light = new Light();
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(new TurnOnLightCommand(light));
        remoteControl.pressButton();

        remoteControl.setCommand(new TurnOffLightCommand(light));
        remoteControl.pressButton();

        System.out.println("Undoing the last command...");
        remoteControl.pressUndo();
    }
}
