package org.example;

import java.time.Duration;
import java.time.Instant;

public class ToDoItem {
    private String name;
    private State state;
    private Instant initialTime;
    private Instant finalTime;
    private String comment;

    public ToDoItem(String name) {
        this.name = name;
        this.state = new Pending(this);
    }

    public void start() {
        this.initialTime = Instant.now();
        this.state.start();
    }

    public void togglePause() {
        this.state.togglePause();
    }

    public void finish() {
        this.finalTime = Instant.now();
        this.state.finish();
    }

    public Duration workedTime() {

        if (this.initialTime == null) {
            throw new RuntimeException("ToDo item no se inicializo");
        }

        if (this.finalTime == null) {
            return Duration.between(this.initialTime, Instant.now());
        }

        return Duration.between(this.initialTime, this.finalTime);
    }

    public void addComment(String comment) {
        this.state.addComment(comment);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
