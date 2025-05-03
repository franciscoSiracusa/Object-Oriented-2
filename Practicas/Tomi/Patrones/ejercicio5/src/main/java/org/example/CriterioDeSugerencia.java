package org.example;

import java.util.List;

public interface CriterioDeSugerencia {

    List<Pelicula> sugerirPeliculas(List<Pelicula> grillaDePeliculas, List<Pelicula> peliculasReproducidas);
}
