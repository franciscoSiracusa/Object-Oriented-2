package ar.edu.unlp.info.oo2.biblioteca;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BibliotecaTest {
    private static Biblioteca biblioteca;

    @BeforeAll
    public static void setUp() {
        biblioteca = new Biblioteca();
    }

    @Test
    public void exportarSociosTest() {
        String emptyJSON = "[]";
        String oneSocioJSON = "[\n"
                + "	{\n"
                + "		\"nombre\": \"Arya Stark\",\n"
                + "		\"email\": \"needle@stark.com\",\n"
                + "		\"legajo\": \"5234-5\"\n"
                + "	},\n"
                + "]\n"
                + "";
        String twoSociosJSON = "[\n"
                + "	{\n"
                + "		\"nombre\": \"Arya Stark\",\n"
                + "		\"email\": \"needle@stark.com\",\n"
                + "		\"legajo\": \"5234-5\"\n"
                + "	},\n"
                + "	{\n"
                + "		\"nombre\": \"Tyron Lannister\",\n"
                + "		\"email\": \"tyron@thelannisters.com\",\n"
                + "		\"legajo\": \"2345-2\"\n"
                + "	}\n"
                + "]\n"
                + "";

        assertEquals(biblioteca.exportarSocios(), emptyJSON);

        Socio socio1 = new Socio("Arya Stark", "needle@stark.com", "5234-5");
        biblioteca.agregarSocio(socio1);

        assertEquals(biblioteca.exportarSocios(), oneSocioJSON);

        Socio socio2 = new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2");
        biblioteca.agregarSocio(socio2);

        assertEquals(biblioteca.exportarSocios(), twoSociosJSON);
    }

}
