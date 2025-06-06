package org.example;

import java.util.List;

public class FileSystem {
    private FileSystemComponent root;

    public FileSystem(FileSystemComponent root) {
        this.root = root;
    }

    public int tamanoTotalOcupado() {
        return root.tamanoTotalOcupado();
    }

    public File archivoMasGrande() {
        return root.archivoMasGrande();
    }

    public File archivoMasNuevo() {
        return root.archivoMasNuevo();
    }

    public FileSystemComponent buscar(String name) {
        return root.buscar(name);
    }

    public List<FileSystemComponent> buscarTodos(String name) {
        return root.buscarTodos(name);
    }

    public String listadoDeContenido() {
        return root.listadoDeContenido();
    }
}
