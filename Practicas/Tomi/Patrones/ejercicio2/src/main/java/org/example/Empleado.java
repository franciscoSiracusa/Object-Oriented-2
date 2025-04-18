package org.example;

public abstract class Empleado {
    private int sueldoBasico;

    public Empleado(int sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public final double sueldo() {
        return getSueldoBasico() + getSueldoAdicional() - getDescuento();
    }

    protected abstract double getSueldoAdicional();

    protected double getSueldoBasico() {
        return this.sueldoBasico;
    }

    private double getDescuento() {
        return getSueldoBasico() * 0.13 + getSueldoAdicional() * 0.05;
    }
}
