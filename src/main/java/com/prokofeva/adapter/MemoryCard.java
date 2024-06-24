package com.prokofeva.adapter;

public class MemoryCard {
    private final String name = "MemoryCard";

    public String getName() {
        return name;
    }

    public String getData(){
        return "информация с " + getName()+".";
    }
}
