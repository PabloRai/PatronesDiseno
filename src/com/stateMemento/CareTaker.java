package com.stateMemento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void addMemento(Memento memento) {
        mementoList.add(memento);
    }

    public Memento getMemento(int mementoIndex) {
        return mementoList.get(mementoIndex);
    }
}
