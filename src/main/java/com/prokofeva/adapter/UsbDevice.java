package com.prokofeva.adapter;

public class UsbDevice implements Usb {
    private final String name = "UsbDevice";

    @Override
    public String getNameSource() {
        return name;
    }

    @Override
    public String readData() {
        return "информация с " + getNameSource() + ".";
    }
}
