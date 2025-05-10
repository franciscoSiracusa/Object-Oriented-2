package org.example;

import java.time.Instant;

public class PendingState implements State{

    private ToDoItem toDoItem;

    public PendingState (ToDoItem toDoItem){
        this.toDoItem = toDoItem;
    }

    @Override
    public void start() {
        toDoItem.setStartTime(Instant.now());
        toDoItem.changeState(new InProgressState(toDoItem));
    }

    @Override
    public void togglePause() {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }

    @Override
    public void finish() {
    }

    @Override
    public void addComment(String comment) {
        this.toDoItem.setComment(comment);
    }
}
