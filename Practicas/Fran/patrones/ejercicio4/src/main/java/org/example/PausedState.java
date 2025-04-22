package org.example;

import java.time.Instant;

public class PausedState implements State{

    private ToDoItem toDoItem;

    public PausedState(ToDoItem toDoItem){
        this.toDoItem = toDoItem;
    }

    @Override
    public void start() {
    }

    @Override
    public void togglePause() {
        this.toDoItem.changeState(new InProgressState(this.toDoItem));
    }

    @Override
    public void finish() {
        this.toDoItem.setFinishTime(Instant.now());
        this.toDoItem.changeState(new FinishedState(this.toDoItem));
    }

    @Override
    public void addComment(String comment) {
        this.toDoItem.setComment(comment);
    }
}
