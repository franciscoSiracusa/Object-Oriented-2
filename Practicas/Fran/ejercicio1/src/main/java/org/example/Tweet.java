package org.example;

public class Tweet implements Post {

    private String texto;
    private Tweet reTweet;

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

    public void setReTweet(Tweet tweet){
        this.reTweet = tweet;
    }

    public Tweet getReTweet() {
        return this.reTweet;
    }
}
