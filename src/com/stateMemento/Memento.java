package com.stateMemento;

public class Memento {
    private String state;

    public Memento(String stateToBeSaved) {
        state = stateToBeSaved;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
