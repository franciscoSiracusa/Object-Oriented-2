package org.example;

import java.util.List;

public interface FileSystemComponent {
    int tamanoTotalOcupado();
    File archivoMasGrande();
    File archivoMasNuevo();
    FileSystemComponent buscar(String name);
    List<FileSystemComponent> buscarTodos(String nombre);
    String listadoDeContenido();
    String getName();
}
