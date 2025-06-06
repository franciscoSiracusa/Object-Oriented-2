package org.example;

public class Pasante extends Empleado{

    private int examenes;

    @Override
    public double calcularBasico() {
        return this.fijo;
    }

    @Override
    public double calcularAdicional() {
        return 2000*this.examenes;
    }

    public int getExamenes() {
        return examenes;
    }

    public void setExamenes(int examenes) {
        this.examenes = examenes;
    }
}
