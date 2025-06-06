package org.example;

public class InProgress extends State {

    public InProgress(ToDoItem toDoItem) {
        super(toDoItem);
    }

    @Override
    public void start() {}

    @Override
    public void togglePause() {
        getToDoItem().changeState(new Paused(getToDoItem()));
    }

    @Override
    public void finish() {
        getToDoItem().changeState(new Finished(getToDoItem()));
    }

}
