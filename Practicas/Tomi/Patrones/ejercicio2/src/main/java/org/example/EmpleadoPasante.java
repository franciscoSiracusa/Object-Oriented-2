package org.example;

public class EmpleadoPasante extends Empleado {
    private static final int SUELDO_BASICO = 20_000;

    private int cantExamenes;

    public EmpleadoPasante(int cantExamenes) {
        super(SUELDO_BASICO);
        this.cantExamenes = cantExamenes;
    }

    @Override
    protected double getSueldoAdicional() {
        return 2000 * this.cantExamenes;
    }
}
