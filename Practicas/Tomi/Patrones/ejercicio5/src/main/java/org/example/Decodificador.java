package org.example;

import java.util.List;

public class Decodificador {
    private List<Pelicula> grillaDePeliculas;
    private List<Pelicula> peliculasReproducidas;
    private CriterioDeSugerencia criterioDeSugerencia;

    public Decodificador(List<Pelicula> grillaDePeliculas, List<Pelicula> peliculasReproducidas, CriterioDeSugerencia criterioDeSugerencia) {
        this.grillaDePeliculas = grillaDePeliculas;
        this.peliculasReproducidas = peliculasReproducidas;
        this.criterioDeSugerencia = criterioDeSugerencia;
    }

    public List<Pelicula> sugerirPeliculas() {
        return this.criterioDeSugerencia.sugerirPeliculas(this.grillaDePeliculas, this.peliculasReproducidas);
    }
}
