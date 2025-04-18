package org.example;

public abstract class EmpleadoConFamilia extends Empleado {
    protected boolean esCasado;
    protected int cantHijos;

    public EmpleadoConFamilia(int sueldoBasico, boolean esCasado, int cantHijos) {
        super(sueldoBasico);
        this.esCasado = esCasado;
        this.cantHijos = cantHijos;
    }

    @Override
    protected double getSueldoAdicional() {
        int bonoPorMatrimonio = esCasado ? 5000 : 0;
        int bonoPorHijos = 2000 * cantHijos;

        return bonoPorMatrimonio + bonoPorHijos;
    }
}
