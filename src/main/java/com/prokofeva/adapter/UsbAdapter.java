package com.prokofeva.adapter;

public class UsbAdapter implements Usb {

    private final MemoryCard memoryCard;

    public UsbAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
        System.out.println("Карта памяти в usb-адаптере.");
    }


    @Override
    public String getNameSource() {
        return memoryCard.getName() + " через usb-адаптер";
    }
}
