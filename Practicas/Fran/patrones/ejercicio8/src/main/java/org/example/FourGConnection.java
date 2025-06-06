package org.example;

public class FourGConnection {

    private String symb;

    public FourGConnection(String symb){
        this.symb = symb;
    }

    public String transmit(String data, long crc){
        return "4G connection active, data: " + data + " crc: " + crc;
    }

    public String getSymb() {
        return symb;
    }

    public void setSymb(String symb) {
        this.symb = symb;
    }
}
