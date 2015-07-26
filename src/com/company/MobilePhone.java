package com.company;

public class MobilePhone extends Device implements Networking, Ringing {

    int screenWidth;
    int screenHeight;

    public void hasNetwork() {
        System.out.println("3g, wifi");
    }

    public void canRing() {
        System.out.println("ring as mobile phone");
    }

    public void manipulate() {
        System.out.println("manipulate via touchscreen and keypad");
    }

}
