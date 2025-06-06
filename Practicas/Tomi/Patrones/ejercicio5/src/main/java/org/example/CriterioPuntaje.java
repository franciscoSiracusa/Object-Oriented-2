package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CriterioPuntaje implements CriterioDeSugerencia {

    @Override
    public List<Pelicula> sugerirPeliculas(List<Pelicula> grillaDePeliculas, List<Pelicula> peliculasReproducidas) {

        Set<String> titulosReproducidos = peliculasReproducidas.stream()
                .map(Pelicula::getTitulo)
                .collect(Collectors.toSet());
        List<Pelicula> peliculasNoReproducidas = grillaDePeliculas.stream()
                .filter(pelicula -> !titulosReproducidos.contains(pelicula.getTitulo()))
                .toList();

        peliculasNoReproducidas.sort(Comparator
                .comparingDouble(Pelicula::getPuntaje).reversed()
                .thenComparing(Comparator.comparingInt(Pelicula::getAnioDeEstreno).reversed()));

        return peliculasNoReproducidas.subList(0, Math.min(3, peliculasNoReproducidas.size()));
    }
}
