package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Directorio implements FileTree {

    private String nombre;
    private int fechaCreacion;
    List<FileTree> contenido;

    public Directorio(String nombre, int fechaCreacion, List<FileTree> contenido){
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.contenido = contenido;
    }

    @Override
    public int tamanoTotalOcupado() {
        return this.contenido.stream()
                .mapToInt(FileTree::tamanoTotalOcupado)
                .sum();
    }

    @Override
    public Archivo archivoMasGrande() {
        return this.contenido.stream()
                .map(FileTree::archivoMasGrande)
                .max(Comparator.comparingInt(Archivo::getTamaño))
                .orElse(null);
    }

    @Override
    public Archivo archivoMasNuevo() {
        return this.contenido.stream()
                .map(FileTree::archivoMasGrande)
                .max(Comparator.comparingInt(Archivo::getFechaCreacion))
                .orElse(null);
    }

    @Override
    public FileTree buscar(String nombre) {
        if (nombre.equals(this.nombre)) {
            return this;
        }
        return this.contenido.stream()
                .map(f -> f.buscar(nombre))
                .filter(Objects::nonNull)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<FileTree> buscarTodos(String nombre) {
        List<FileTree> coincidencias = new ArrayList<>();
        if (nombre.equals(this.nombre)) {
            coincidencias.add(this);
        }
        List<FileTree> hijosCoincidentes = this.contenido.stream()
                .map(f -> f.buscarTodos(nombre))
                .flatMap(List::stream)
                .collect(Collectors.toList());
        coincidencias.addAll(hijosCoincidentes);
        return coincidencias;
    }

    public String listadoDeContenido(){
        String path = '/' + this.nombre;
        contenido.stream()
                .map(FileTree::listadoDeContenido)
                .forEach(n -> path.concat("/").concat(n));
        return path;
    }
}
