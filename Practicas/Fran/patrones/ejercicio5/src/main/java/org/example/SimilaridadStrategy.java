package org.example;

import java.util.List;

public class SimilaridadStrategy implements RecomendarStrategy{

    @Override
    public List<Pelicula> sugerirTres(List<Pelicula> peliculas) {
        return peliculas.stream()
                .filter(Pelicula::isReproducida)
    }
}
