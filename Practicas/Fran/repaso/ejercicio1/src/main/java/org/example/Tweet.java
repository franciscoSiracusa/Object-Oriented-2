package org.example;

public class Tweet implements Post {

    private String texto;

    public Tweet(String texto) {
        if (texto.length() <= 280) {
            this.texto = texto;
        }
    }

    public Tweet(){
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        if (texto.length() <= 280) {
            this.texto = texto;
        }
    }
}
