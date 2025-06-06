package org.example;

import java.util.List;

public class Pelicula {

    private String titulo;
    private int anio;
    private double puntaje;
    private boolean reproducida;
    private List<Pelicula> similares;

    public Pelicula(String titulo,int anio, double puntaje, boolean reproducida, List<Pelicula> similares){
        this.titulo = titulo;
        this.anio = anio;
        this.puntaje = puntaje;
        this.reproducida = reproducida;
        this.similares = similares;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public boolean isReproducida() {
        return reproducida;
    }

    public void setReproducida(boolean reproducida) {
        this.reproducida = reproducida;
    }

    public List<Pelicula> getSimilares() {
        return similares;
    }

    public void setSimilares(List<Pelicula> similares) {
        this.similares = similares;
    }
}
