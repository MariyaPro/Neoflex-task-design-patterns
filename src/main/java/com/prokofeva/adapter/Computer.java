package com.prokofeva.adapter;

public class Computer {

    public Computer() {
        System.out.println("Компьютер включен.");
    }

    public void read(Usb usb) {
        if (usb == null || usb.readData() == null) {
            throw new IllegalArgumentException("Ошибка чтения данных с USB устройства.");
        }

        System.out.println("Компьютер читает информацию с " + usb.getNameSource() + ": " + usb.readData());
    }
}