package com.milanesa;

public class MilanesaNapolitana extends Milanesa{
    @Override
    protected void cocinar() {
        System.out.println("Cocinando milanesa napolitana");
    }

    @Override
    public void isRica() {
        System.out.println("Obvio, soy una milanesa napolitana");
    }
}
