package com.prokofeva.proxy;

public class ConnectionDBProxy {

    private final ConnectionDB connectionDB;
    private final String proxyName = "localhost:port/";

    public ConnectionDBProxy(String name) {
        this.connectionDB = new ConnectionDB(name);
    }

    public void connect() {
        System.out.print(proxyName);
        connectionDB.connect();
    }
}
