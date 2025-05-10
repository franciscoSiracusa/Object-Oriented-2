package org.example;

import java.util.ArrayList;
import java.util.List;

public class Twitter {

    private List<Usuario> usuarios;

    public Twitter(){
        this.usuarios = new ArrayList<>();
    }

    public void agregarUsuario(String screenName){
        boolean isScreenNameRepetido = usuarios.stream()
                .anyMatch(x -> x.getScreenName().equals(screenName));
        if (!isScreenNameRepetido) {
            Usuario usuario = new Usuario(screenName);
            usuarios.add(usuario);
        }
    }

    public void eliminarUsuario(Usuario usuarioEliminado){
        boolean isUsuarioEliminadoPresente =usuarios.stream().anyMatch(x -> x.equals(usuarioEliminado));
        if (isUsuarioEliminadoPresente) {
            usuarios.remove(usuarioEliminado);
        }
    }
}
