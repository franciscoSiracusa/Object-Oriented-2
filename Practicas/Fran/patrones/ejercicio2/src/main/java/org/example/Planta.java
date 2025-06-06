package org.example;

public class Planta extends Empleado{

    private int hijos;
    private boolean casado;
    private int anos;

    @Override
    public double calcularBasico() {
        return this.fijo;
    }

    @Override
    public double calcularAdicional() {
        if (casado){
            return 2000*this.hijos + 2000*this.anos + 5000;
        }
        return 2000*this.hijos + 2000*this.anos;
    }

    public boolean isCasado() {
        return casado;
    }

    public int getHijos() {
        return hijos;
    }

    public int getAnos() {
        return anos;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }
}
