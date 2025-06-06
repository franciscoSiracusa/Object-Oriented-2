package org.example;

public class Pending extends State {

    public Pending(ToDoItem toDoItem) {
        super(toDoItem);
    }

    @Override
    public void start() {
        getToDoItem().changeState(new InProgress(getToDoItem()));
    }

    @Override
    public void togglePause() {
        throw new RuntimeException("No se puede ejecutar esta accion, ToDo item esta en pending state");
    }

    @Override
    public void finish() {}
}
