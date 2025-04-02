package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String screenName;
    private List<Tweet> tweets;

    public User(String screenName) {
        this.screenName = screenName;
        this.tweets = new ArrayList<>();
    }

    public String getScreenName() {
        return screenName;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public boolean postTweet(String text) {
        if (text.length() > 1 && text.length() < 280) {
            Tweet tweet = new Tweet(text);
            tweets.add(tweet);
            System.out.println("Tweet posted successfully");
            return true;
        } else {
            System.out.println("Tweet text should be between 1 and 280 characters");
            return false;
        }
    }


}
