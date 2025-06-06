package org.example;

public class Tierra implements Topografia {

    @Override
    public double calcularProporcionAgua() {
        return 0;
    }

    @Override
    public double calcularProporcionTierra() {
        return 1;
    }

    @Override
    public boolean compararTopografias(Topografia topografia) {
        return 1 == topografia.calcularProporcionTierra();
    }

}
