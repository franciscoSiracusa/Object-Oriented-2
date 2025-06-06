package org.example;

import java.util.List;

public class Decodificador {

    private List<Pelicula> peliculas;
    private RecomendarStrategy strategy;

    public Decodificador(List<Pelicula> peliculas, RecomendarStrategy strategy){
        this.peliculas = peliculas;
        this.strategy = strategy;
    }

    public List<Pelicula> sugerirTres(){
        return strategy.sugerirTres(this.peliculas);
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public RecomendarStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(RecomendarStrategy strategy) {
        this.strategy = strategy;
    }
}
