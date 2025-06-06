package org.example;

import java.time.LocalDate;
import java.util.List;

public class File implements FileSystemComponent {

    private String name;
    private LocalDate creationDate;
    private int size;

    public File(String name, LocalDate creationDate, int size) {
        this.name = name;
        this.creationDate = creationDate;
        this.size = size;
    }

    @Override
    public int tamanoTotalOcupado() {
        return this.size;
    }

    @Override
    public File archivoMasGrande() {
        return this;
    }

    @Override
    public File archivoMasNuevo() {
        return this;
    }

    @Override
    public FileSystemComponent buscar(String name) {
        return this.name == name ? this : null;
    }

    @Override
    public List<FileSystemComponent> buscarTodos(String nombre) {
        return List.of();
    }

    @Override
    public String listadoDeContenido() {
        return "";
    }

    public int getSize() {
        return size;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public String getName() {
        return name;
    }
}
