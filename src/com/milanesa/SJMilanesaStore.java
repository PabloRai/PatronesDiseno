package com.milanesa;

public class SJMilanesaStore extends  MilanesaStore{


    @Override
    protected Milanesa crearMilanesa(String type) {
        if (type != null) {
            type = type.toUpperCase();
        } else {
            return null;
        }

        switch (type) {
            case "SUIZA":
                return new MilanesaSuiza();
            default:
                return  null;
        }
    }
}
