package org.example;

public abstract class Empleado {

    protected double fijo;

    public double sueldo(){
        double basico = calcularBasico();
        double adicional = calcularAdicional();
        double descuento = calcularDescuento();
        return basico + adicional - descuento;
    };

    public abstract double calcularBasico();

    public abstract double calcularAdicional();

    public double calcularDescuento(){
        double porcentajeBasico = 0.13*this.calcularBasico();
        double porcentajeAdicional = 0.05*this.calcularDescuento();
        return porcentajeBasico + porcentajeAdicional;
    };

    public void setFijo(double fijo) {
        this.fijo = fijo;
    }

    public double getFijo() {
        return fijo;
    }
}