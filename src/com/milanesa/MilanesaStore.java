package com.milanesa;

public abstract class MilanesaStore {
    protected abstract Milanesa crearMilanesa(String type);

    public Milanesa orderMilanesa(String type) {
        Milanesa milanesa;
        milanesa = crearMilanesa(type);
        milanesa.cocinar();
        return milanesa;
    }

}
