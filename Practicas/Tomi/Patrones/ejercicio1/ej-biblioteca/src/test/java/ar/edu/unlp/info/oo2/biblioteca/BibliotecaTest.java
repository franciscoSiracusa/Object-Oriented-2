package ar.edu.unlp.info.oo2.biblioteca;


import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BibliotecaTest {
    private static Biblioteca biblioteca;

    @BeforeAll
    public static void setUp() {
        biblioteca = new Biblioteca();
        biblioteca.setExporter(new JSONSimpleExporter());
    }

    @Test
    public void exportarSociosTest() throws ParseException {
        String emptyJSON = "[]";
        String oneSocioJSON = "[{\"nombre\":\"Arya Stark\",\"email\":\"needle@stark.com\",\"legajo\":\"5234-5\"}]";
        String twoSociosJSON = "[{\"nombre\":\"Arya Stark\",\"email\":\"needle@stark.com\",\"legajo\":\"5234-5\"}, {\"nombre\":\"Tyron Lannister\",\"email\":\"tyron@thelannisters.com\",\"legajo\":\"2345-2\"}]";

        JSONParser jsonParser = new JSONParser();

        assertEquals(jsonParser.parse(biblioteca.exportarSocios()), jsonParser.parse(emptyJSON));

        Socio socio1 = new Socio("Arya Stark", "needle@stark.com", "5234-5");
        biblioteca.agregarSocio(socio1);

        assertEquals(jsonParser.parse(biblioteca.exportarSocios()), jsonParser.parse(oneSocioJSON));

        Socio socio2 = new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2");
        biblioteca.agregarSocio(socio2);

        assertEquals(jsonParser.parse(biblioteca.exportarSocios()), jsonParser.parse(twoSociosJSON));
    }

}
