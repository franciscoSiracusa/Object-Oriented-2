package org.example;

import java.util.List;

public class Pelicula {
    private String titulo;
    private int anioDeEstreno;
    private int puntaje;
    private List<Pelicula> peliculasSimilares;

    public Pelicula(String titulo, int anioDeEstreno, int puntaje, List<Pelicula> peliculasSimilares) {
        this.titulo = titulo;
        this.anioDeEstreno = anioDeEstreno;
        this.puntaje = puntaje;
        this.peliculasSimilares = peliculasSimilares;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioDeEstreno() {
        return anioDeEstreno;
    }

    public List<Pelicula> getPeliculasSimilares() {
        return peliculasSimilares;
    }

    public int getPuntaje() {
        return puntaje;
    }
}
