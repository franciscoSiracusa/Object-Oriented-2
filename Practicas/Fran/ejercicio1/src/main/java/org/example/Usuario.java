package org.example;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String screenName;
    private List<Post> posts;

    public Usuario(String screenName) {
        this.screenName = screenName;
        this.posts = new ArrayList<>();
    }

    public String getScreenName (){
        return this.screenName;
    }

    public void setScreenName(String screenName){
        this.screenName = screenName;
    }

    public void crearTweet(String texto){
        Tweet tweet = new Tweet(texto);
        posts.add(tweet);
    }

    public void reTweetear(Tweet tweet){
        Retweet retweet = new Retweet();
        retweet.setReTweet(tweet);
        posts.add(retweet);
    }
}