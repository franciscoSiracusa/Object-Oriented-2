package org.example;

import java.util.List;

public class FileSystem {

    private FileTree fileTree;

    public FileSystem(FileTree fileTree){
        this.fileTree = fileTree;
    }

    public int tamanoTotalOcupado(){
       return this.fileTree.tamanoTotalOcupado();
    }

    public Archivo archivoMasGrande(){
       return this.fileTree.archivoMasGrande();
    }

    public Archivo archivoMasNuevo(){
        return this.fileTree.archivoMasNuevo();
    }

    public FileTree buscar(String nombre){
       return this.fileTree.buscar(nombre);
    }

    public List<FileTree> buscarTodos(String nombre){
       return this.fileTree.buscarTodos(nombre);
    }

    public String listadoDeContenido(){
        return this.fileTree.listadoDeContenido();
    }

}
