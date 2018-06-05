package com.company;

import com.chatMediator.User;
import com.milanesa.LiniersMilanesaStore;
import com.milanesa.Milanesa;
import com.milanesa.MilanesaStore;
import com.milanesa.SJMilanesaStore;
import com.stateMemento.CareTaker;
import com.stateMemento.Memento;
import com.stateMemento.Originator;

public class Main {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        Memento memento;
        originator.setState("Primer estado");
        originator.setState("Segundo estado");
        careTaker.addMemento(originator.getMemento());
        originator.setState("Tercer estado");
        careTaker.addMemento(originator.getMemento());
        System.out.println("Estado actual: " + originator.getState());
        // Rompi todo y quiero ir para atras =)
        memento = careTaker.getMemento(0);
        originator.recoverStateFromMemento(memento);
    }
}
