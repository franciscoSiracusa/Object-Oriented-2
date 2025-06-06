package org.example;

public class Papel extends Jugada{

    @Override
    public boolean gana(Jugada opcion2) {
        if (opcion2 instanceof Piedra) {
            return true;
        };
        return false;
    }

    @Override
    public boolean pierde(Jugada opcion2) {
        if (opcion2 instanceof Tijera) {
            return true;
        };
        return false;
    }

    @Override
    public boolean empata(Jugada opcion2) {
        if (opcion2 instanceof Papel) {
            return true;
        };
        return false;
    }
}