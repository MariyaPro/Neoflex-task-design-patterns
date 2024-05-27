package com.prokofeva.proxy;

public class ConnectionDB {

    private final String nameDB;

    public ConnectionDB(String nameDB) {
        this.nameDB = nameDB;
    }

    public void connect() {
        System.out.println(nameDB);
    }
}
