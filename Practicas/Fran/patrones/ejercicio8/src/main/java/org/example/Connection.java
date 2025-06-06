package org.example;

public interface Connection {

    String sendData(String data, long crc);
    String pict();
}
