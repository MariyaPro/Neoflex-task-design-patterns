package com.prokofeva.proxy;

public class ConnectionDB implements Connection {

    public ConnectionDB() {
    }

    public void connect(String url) {
        System.out.println("подключено к " + url);
    }
}
