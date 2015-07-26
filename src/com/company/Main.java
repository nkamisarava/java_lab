package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Choose device type:\n1. TV \n2. Computer\n3. MobilePhone\n4.Phone");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
        try {
            int input = Integer.parseInt(br.readLine());
            System.out.println(input);
            switch (input) {
                case 1: Device tv = new TV();
                        tv.setModel("Sony");
                        System.out.println(tv.getModel());
                        tv.manipulate();
                    break;
                case 2: Computer computer = new Computer();
                        computer.setModel("lenovo z570");
                        System.out.println(computer.getModel());
                        computer.hasNetwork();
                    break;
                case 3: MobilePhone mobilePhone = new MobilePhone();
                        mobilePhone.setModel("Sony xperia s1");
                        System.out.println(mobilePhone.getModel());
                        mobilePhone.hasNetwork();
                        mobilePhone.canRing();
                    break;
                case 4: Phone phone = new Phone();
                        phone.setModel("Panasonic");
                        System.out.println(phone.getModel());
                        phone.canRing();
                    break;
            }
        }
        catch(NumberFormatException nfe) {
            System.err.println("Invalid Format!");
        }

    }
}
