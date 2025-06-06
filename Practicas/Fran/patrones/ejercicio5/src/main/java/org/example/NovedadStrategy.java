package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NovedadStrategy implements RecomendarStrategy{

    @Override
    public List<Pelicula> sugerirTres(List<Pelicula> peliculas) {
        return peliculas.stream()
                .filter(Pelicula::isReproducida)
                .sorted(Comparator.comparingInt(Pelicula::getAnio).reversed())
                .collect(Collectors.toList());
    }
}
