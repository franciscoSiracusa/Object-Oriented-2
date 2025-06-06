package org.example;

import java.util.List;

public interface FileTree {

    int tamanoTotalOcupado();

    Archivo archivoMasGrande();

    Archivo archivoMasNuevo();

    FileTree buscar(String nombre);

    List<FileTree> buscarTodos(String nombre);

    String listadoDeContenido();

}
