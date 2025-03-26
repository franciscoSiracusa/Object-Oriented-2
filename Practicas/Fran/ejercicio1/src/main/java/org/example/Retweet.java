package org.example;

public class Retweet implements Post {

    private Post retweet;


    public void setReTweet(Tweet tweet) {
        this.retweet = tweet;
    }
}
