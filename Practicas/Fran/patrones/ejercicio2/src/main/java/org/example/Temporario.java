package org.example;

public class Temporario extends Empleado{

    private int horas;
    private int hijos;
    private boolean casado;

    @Override
    public double calcularBasico() {
        return this.fijo + this.horas*300;
    }

    @Override
    public double calcularAdicional() {
        if (casado){
            return 2000*this.hijos + 5000;
        }
        return 2000*this.hijos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getHijos() {
        return hijos;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }
}
