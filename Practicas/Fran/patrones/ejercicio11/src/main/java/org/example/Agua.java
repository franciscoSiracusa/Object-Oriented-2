package org.example;

public class Agua implements Topografia {

    @Override
    public double calcularProporcionAgua() {
        return 1;
    }

    @Override
    public double calcularProporcionTierra() {
        return 0;
    }

    @Override
    public boolean compararTopografias(Topografia topografia) {
        return 1 == topografia.calcularProporcionAgua();
    }

}
