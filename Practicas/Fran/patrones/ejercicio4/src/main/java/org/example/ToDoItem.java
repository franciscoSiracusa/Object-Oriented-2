package org.example;

import java.time.Duration;
import java.time.Instant;

public class ToDoItem {

    private String name;
    private String comment;
    private State state;
    private Instant startTime;
    private Instant finishTime;

    public ToDoItem(String name){
        this.name = name;
        this.state = new PendingState(this);
    }

    public void start(){
        state.start();
    }

    public void togglePause(){
        state.togglePause();
    }

    public void finish(){
        state.finish();
    }

    public Duration workedTime(){
        if (this.startTime == null) {
            throw new RuntimeException("El To do Item no esta inicializado");
        }
        Instant end = (this.finishTime != null) ? this.finishTime : Instant.now();
        return Duration.between(this.startTime, end);
    }

    public void addComment(String comment){
        this.state.addComment(comment);
    }

    public void changeState(State state){
        this.state = state;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Instant getStartTime() {
        return startTime;
    }

    public void setStartTime(Instant startTime) {
        this.startTime = startTime;
    }

    public Instant getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Instant finishTime) {
        this.finishTime = finishTime;
    }
}
