package org.example;

public class WifiConn implements Connection {

    private String pict;

    public WifiConn(String pict){
        this.pict = pict;
    };

    @Override
    public String sendData(String data, long crc) {
        return "Wifi connection active, data: " + data + " crc: " + crc;
    }

    @Override
    public String pict(){
        return this.pict;
    }
}
