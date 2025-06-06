package org.example;

public class FourGConnectionAdapter implements Connection {

    private FourGConnection fourGConnection;

    public FourGConnectionAdapter(FourGConnection fourGConnection){
        this.fourGConnection = fourGConnection;
    }

    @Override
    public String sendData(String data, long crc){
        return this.fourGConnection.transmit(data, crc);
    }

    @Override
    public String pict(){
        return this.fourGConnection.getSymb();
    }

}
