package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TopografiaTest {

    private Topografia topografiaAgua;
    private Topografia topografiaTierra;
    private Topografia topografiaMixta;
    private Topografia topografiaMuyMixta;

    @BeforeEach
    void setUp() {
        this.topografiaAgua = new Agua();
        this.topografiaTierra = new Tierra();
        this.topografiaMixta = new Mixta(List.of(new Agua(),new Tierra(),new Agua(),new Tierra()));
        var mixtaCompuesta = new Mixta(List.of(new Agua(),new Tierra(),new Agua(),new Tierra()));
        this.topografiaMuyMixta = new Mixta(List.of(new Agua(),new Tierra(),new Tierra(),mixtaCompuesta));
        };

    @Test
    void testProporcionConAgua(){
        assertEquals(1, this.topografiaAgua.calcularProporcionAgua());
        assertEquals(0,this.topografiaAgua.calcularProporcionTierra());
    }

    @Test
    void testProporcionConTierra(){
        assertEquals(0, this.topografiaTierra.calcularProporcionAgua());
        assertEquals(1,this.topografiaTierra.calcularProporcionTierra());
    }

    @Test
    void testProporcionConMixta(){
        assertEquals(0.5, this.topografiaMixta.calcularProporcionAgua());
        assertEquals(0.5,this.topografiaMixta.calcularProporcionTierra());

        assertEquals(0.375, this.topografiaMuyMixta.calcularProporcionAgua());
        assertEquals(0.625, this.topografiaMuyMixta.calcularProporcionTierra());
    }

    @Test
    void compararTopologias(){
        var mixta = new Mixta(List.of(new Agua(),new Tierra(),new Agua(),new Tierra()));
        assertTrue(this.topografiaAgua.compararTopografias(new Agua()));
        assertTrue(this.topografiaTierra.compararTopografias(new Tierra()));
        assertTrue(this.topografiaMixta.compararTopografias(mixta));

        assertFalse(this.topografiaAgua.compararTopografias(new Tierra()));
        assertFalse(this.topografiaAgua.compararTopografias(mixta));

        assertFalse(this.topografiaTierra.compararTopografias(new Agua()));
        assertFalse(this.topografiaTierra.compararTopografias(mixta));

        assertFalse(this.topografiaMixta.compararTopografias(new Agua()));
        assertFalse(this.topografiaMixta.compararTopografias(new Tierra()));

        var muyMixta = new Mixta(List.of(new Agua(),new Tierra(),new Tierra(),mixta));
        assertTrue(this.topografiaMuyMixta.compararTopografias(muyMixta));
    }

}

