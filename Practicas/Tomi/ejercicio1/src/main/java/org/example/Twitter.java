package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Twitter {

    private List<User> users;

    public Twitter() {
        this.users = new ArrayList<>();
    }

    public List<User> getUsers() {
        return this.users;
    }

    public boolean registerUser(String screenName) {
        List<String> screenNameList = users.stream()
                .map(u -> u.getScreenName())
                .collect(Collectors.toList());

        if (screenNameList.contains(screenName)) {
            System.out.println("Unable to register user. User already exists");
            return false;
        } else {
            User user = new User(screenName);
            users.add(user);
            System.out.println("User registered successfully");
        }

        return true;
    }
}
