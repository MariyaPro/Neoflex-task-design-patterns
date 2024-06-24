package com.prokofeva.proxy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConnectionDBProxy implements Connection {

    private final ConnectionDB connectionDB;
    private String prefixUrl;

    public ConnectionDBProxy() {
        connectionDB = new ConnectionDB();
        setPrefixUrl();
    }

    @Override
    public void connect(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Подключение невозможно, name не может быть null");
        }
        String url = createUrl(name);
        connectionDB.connect(url);
    }

    private String createUrl(String name) {
        return prefixUrl + name;
    }

    private void setPrefixUrl() {
        Properties property = new Properties();

        try (FileInputStream fis = new FileInputStream("src/main/resources/proxy.properties")) {
            property.load(fis);
            prefixUrl = property.getProperty("prefixUrl");
        } catch (IOException e) {
            System.err.println("Невозможно установить своймство prefixUrl.");
        }
    }
}
