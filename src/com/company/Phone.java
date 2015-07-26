package com.company;

public class Phone extends Device implements Ringing {

    String model;

    public void canRing() {
        System.out.println("ring as simple phone");
    }

    public void manipulate() {
        System.out.println("manipulate via buttons");
    }

}
