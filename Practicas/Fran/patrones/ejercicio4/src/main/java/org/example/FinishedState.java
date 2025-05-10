package org.example;

public class FinishedState implements State{

    private ToDoItem toDoItem;

    public FinishedState(ToDoItem toDoItem){
        this.toDoItem = toDoItem;
    }

    @Override
    public void start() {
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
    }
}
