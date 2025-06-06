package org.example;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Directory implements FileSystemComponent {

    private static final int initialSize = 32;

    private String name;
    private LocalDate creationDate;
    private List<FileSystemComponent> content;

    public Directory(String name, LocalDate creationDate, List<FileSystemComponent> content) {
        this.name = name;
        this.creationDate = creationDate;
        this.content = content;
    }

    @Override
    public int tamanoTotalOcupado() {
        int contentSize = Optional.ofNullable(this.content)
                .orElse(Collections.emptyList())
                .stream()
                .mapToInt(FileSystemComponent::tamanoTotalOcupado)
                .sum();

        return initialSize + contentSize;
    }

    @Override
    public File archivoMasGrande() {
        return this.content.stream()
                .map(FileSystemComponent::archivoMasGrande)
                .reduce((file, file2) -> file.getSize() >= file2.getSize() ? file : file2)
                .orElse(null);
    }

    @Override
    public File archivoMasNuevo() {
        return this.content.stream()
                .map(FileSystemComponent::archivoMasNuevo)
                .max(Comparator.comparing(File::getCreationDate))
                .orElse(null);
    }

    @Override
    public FileSystemComponent buscar(String name) {
        if (this.name == name) return this;

        return this.content.stream()
                .map(fileSystemComponent -> fileSystemComponent.buscar(name))
                .filter(fileSystemComponent -> name.equals(fileSystemComponent.getName()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<FileSystemComponent> buscarTodos(String nombre) {
        List<FileSystemComponent> matchedNames;

        return List.of();
    }

    @Override
    public String listadoDeContenido() {
        return "";
    }

    public String getName() {
        return name;
    }
}
