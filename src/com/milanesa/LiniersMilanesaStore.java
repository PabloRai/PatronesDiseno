package com.milanesa;

public class LiniersMilanesaStore extends MilanesaStore {

    @Override
    protected Milanesa crearMilanesa(String type) {
        if (type != null) {
            type = type.toUpperCase();
        } else {
            return null;
        }

        switch (type) {
            case "NAPOLITANA":
                return new MilanesaNapolitana();
            default:
                return  null;
        }

    }
}
