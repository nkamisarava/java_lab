package com.company;

public class Computer extends Device implements Networking {

    String model;
    int screenWidth;
    int screenHeight;

    public void hasNetwork() {
        System.out.println("3g-usb, wifi, wired internet");
    }

    public void manipulate() {
        System.out.println("manipulate via mouse and keyboard");
    }
}
