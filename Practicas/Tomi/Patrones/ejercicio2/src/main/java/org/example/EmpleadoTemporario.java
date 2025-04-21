package org.example;

public class EmpleadoTemporario extends EmpleadoConFamilia {
    private static final int SUELDO_BASICO = 20_000;

    private int cantHorasTrabajadas;
    private final int adicionalPorHora = 300;

    public EmpleadoTemporario(boolean esCasado, int cantHijos, int cantHorasTrabajadas) {
        super(SUELDO_BASICO, esCasado, cantHijos);
        this.cantHorasTrabajadas = cantHorasTrabajadas;
    }

    @Override
    protected double getSueldoBasico() {
        return super.getSueldoBasico() + adicionalPorHora * this.cantHorasTrabajadas;
    }
}
