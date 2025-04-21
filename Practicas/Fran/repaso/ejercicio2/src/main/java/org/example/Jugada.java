package org.example;

public abstract class Jugada {

    public abstract boolean gana(Jugada opcion2);

    public abstract boolean pierde(Jugada opcion2);

    public abstract boolean empata(Jugada opcion2);

    public void jugar(Jugada opcion2){
        if (this.gana(opcion2)) {
            System.out.println("ganador opcion 1");
        } else if (this.pierde(opcion2)) {
            System.out.println("perdedor opcion 1");
        } else if (this.empata(opcion2)){
            System.out.println("empate entre opcion 1 y 2");
        }
    };

}