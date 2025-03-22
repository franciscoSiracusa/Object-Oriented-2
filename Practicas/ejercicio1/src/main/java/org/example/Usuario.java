package org.example;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String screenName;
    private List<Tweet> tweets;

    public Usuario(String screenName) {
        this.screenName = screenName;
        this.tweets = new ArrayList<>();
    }

    public String getScreenName (){
        return this.screenName;
    }

    public void setScreenName(String screenName){
        this.screenName = screenName;
    }

    public void crearTweet(String texto){
        Tweet tweet = new Tweet(texto);
        tweets.add(tweet);
    }

    public void reTweetear(Tweet tweet){
        Tweet retweet = new Tweet();
        retweet.setReTweet(tweet);
        tweets.add(retweet);
    }

    public List<Tweet> getAlltweets(){
        return this.tweets;
    }

    public void deleteReTweet(List<Tweet> tweetsEliminados){
        tweets.stream().filter(t -> t.getReTweet().equals());
    }

}
