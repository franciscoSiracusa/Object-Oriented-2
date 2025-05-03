package org.example;

public class Paused extends State {

    public Paused(ToDoItem toDoItem) {
        super(toDoItem);
    }

    @Override
    public void start() {}

    @Override
    public void togglePause() {
        getToDoItem().changeState(new InProgress(getToDoItem()));
    }

    @Override
    public void finish() {
        getToDoItem().changeState(new Finished(getToDoItem()));
    }
}
