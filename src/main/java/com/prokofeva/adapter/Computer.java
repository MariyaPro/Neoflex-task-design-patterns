package com.prokofeva.adapter;

public class Computer {

    public Computer() {
        System.out.println("Компьютер включен.");
    }

    public void read(Usb usb){
        System.out.println("Компьютер читает информацию с " + usb.getNameSource()+".");
    }
}
