import org.example.Empleado;
import org.example.EmpleadoPasante;
import org.example.EmpleadoPlanta;
import org.example.EmpleadoTemporario;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoTest {

    @Test
    public void sueldoTest() {

        Empleado empleadoTemporario1 = new EmpleadoTemporario(true, 5, 130);
        Empleado empleadoTemporario2 = new EmpleadoTemporario(false, 0, 160);
        Empleado empleadoPlanta = new EmpleadoPlanta(true, 2, 15);
        Empleado empleadoPasante = new EmpleadoPasante(3);

        assertEquals(empleadoTemporario1.sueldo(), 65580.00);
        assertEquals(empleadoTemporario2.sueldo(), 59160.00);
        assertEquals(empleadoPlanta.sueldo(), 80550.00);
        assertEquals(empleadoPasante.sueldo(), 23100.00);
    }
}
