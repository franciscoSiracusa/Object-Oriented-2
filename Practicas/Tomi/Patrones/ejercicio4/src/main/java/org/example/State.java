package org.example;

public abstract class State {
    private ToDoItem toDoItem;

    public State(ToDoItem toDoItem) {
        this.toDoItem = toDoItem;
    }

    public abstract void start();
    public abstract void togglePause();
    public abstract void finish();

    public void addComment(String comment) {
        this.toDoItem.setComment(comment);
    }

    public ToDoItem getToDoItem() {
        return toDoItem;
    }
}
