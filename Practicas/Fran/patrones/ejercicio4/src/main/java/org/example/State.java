package org.example;

public interface State {

    void start();

    void togglePause();

    void finish();

    void addComment(String comment);
}
