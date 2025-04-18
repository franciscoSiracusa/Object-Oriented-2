package org.example;

public class EmpleadoPlanta extends EmpleadoConFamilia {
    private static final int SUELDO_BASICO = 50_000;
    private int antiguedad;

    public EmpleadoPlanta(boolean esCasado, int cantHijos, int antiguedad) {
        super(SUELDO_BASICO, esCasado, cantHijos);
        this.antiguedad = antiguedad;
    }

    @Override
    protected double getSueldoAdicional() {
        return super.getSueldoAdicional() + this.antiguedad * 2000;
    }
}
