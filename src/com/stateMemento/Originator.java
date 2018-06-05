package com.stateMemento;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento getMemento() {
        return new Memento(state);
    }

    public void recoverStateFromMemento(Memento memento) {
        state = memento.getState();
        System.out.println("Recupere el estado: " + state);
    }
}
