package org.example;

public class Dispositivo {

    private Ringer ringer;
    private Display display;
    private CRCStrategy crcStrategy;
    private Connection connection;

    public Dispositivo(Ringer ringer, Display display, CRCStrategy crcStrategy, Connection connection){
        this.ringer = ringer;
        this.display = display;
        this.crcStrategy = crcStrategy;
        this.connection = connection;
    }

    public String send(String data){
        long crc = this.crcStrategy.crcFor(data);
        return this.connection.sendData(data,crc);
    }

    public Ringer getRinger() {
        return ringer;
    }

    public void setRinger(Ringer ringer) {
        this.ringer = ringer;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public CRCStrategy getCrcStrategy() {
        return crcStrategy;
    }

    public void setCrcStrategy(CRCStrategy crcStrategy) {
        this.crcStrategy = crcStrategy;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
        this.display.showBanner(this.connection.pict());
        this.ringer.ring();
    }
}
