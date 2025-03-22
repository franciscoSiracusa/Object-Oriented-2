package org.example;

public class Tweet {

    private String text;
    private Tweet originTweet;
    private Tweet retweet;

    public Tweet(String text) {
        this.text = text;
        this.originTweet = null;
        this.retweet = null;
    }
}
