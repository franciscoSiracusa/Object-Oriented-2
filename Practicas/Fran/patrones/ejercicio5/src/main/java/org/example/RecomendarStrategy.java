package org.example;

import java.util.List;

public interface RecomendarStrategy {

    List<Pelicula> sugerirTres(List<Pelicula> peliculas);

}
