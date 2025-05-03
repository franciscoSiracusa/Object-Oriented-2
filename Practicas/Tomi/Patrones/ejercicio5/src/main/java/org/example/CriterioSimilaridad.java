package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CriterioSimilaridad implements CriterioDeSugerencia {

    @Override
    public List<Pelicula> sugerirPeliculas(List<Pelicula> grillaDePeliculas, List<Pelicula> peliculasReproducidas) {

        Set<String> titulosReproducidos = peliculasReproducidas.stream()
                .map(Pelicula::getTitulo)
                .collect(Collectors.toSet());
        Set<Pelicula> peliculasSimilaresNoReproducidas = peliculasReproducidas.stream()
                // flatMap hace un map de pelis reproducidas a las pelis similares a esas pelis, en una lista plana
                // si hiciera map, pasaria de las pelis reproducidas a una lista de listas de pelis similares List<List<Peliculas>>
                // pero con el flat map lo aplana y a cada sublista le saca los elementos y los pone en la nueva lista
                .flatMap(pelicula -> pelicula.getPeliculasSimilares().stream())
                // de esa lista de pelis similares, saca las que ya se reprodujeron
                .filter(pelicula -> !titulosReproducidos.contains(pelicula.getTitulo()))
                // los junta en un set, para sacar duplicados (pueden haber pelis similares iguales en diferentes pelis)
                .collect(Collectors.toSet());

        List<Pelicula> peliculasSugeridas = peliculasSimilaresNoReproducidas.stream()
                .sorted(Comparator.comparingInt(Pelicula::getAnioDeEstreno).reversed())
                .limit(3)
                .toList();

        return peliculasSugeridas;
    }
}
