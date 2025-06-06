package org.example;

import java.util.List;

public class Archivo implements FileTree {

    private String nombre;
    private int fechaCreacion;
    private int tamaño;

    public Archivo(String nombre, int fechaCreacion, int tamaño){
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.tamaño = tamaño;
    }

    @Override
    public int tamanoTotalOcupado() {
        return this.tamaño;
    }

    @Override
    public Archivo archivoMasGrande() {
        return this;
    }

    @Override
    public Archivo archivoMasNuevo() {
        return this;
    }

    @Override
    public FileTree buscar(String nombre) {
        if (nombre.equals(this.nombre)) {
            return this;
        }
        return null;
    }

    @Override
    public List<FileTree> buscarTodos(String nombre) {
        if (nombre.equals(this.nombre)) {
            return List.of(this);
        }
        return List.of();
    }

    @Override
    public String listadoDeContenido(){
        return this.nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(int fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
}
