package org.example;

public class Finished extends State {

    public Finished(ToDoItem toDoItem) {
        super(toDoItem);
    }

    @Override
    public void start() {}

    @Override
    public void togglePause() {
        throw new RuntimeException("No se puede ejecutar esta accion, ToDo item esta en finished state");
    }

    @Override
    public void finish() {}

    @Override
    public void addComment(String comment) {}
}
