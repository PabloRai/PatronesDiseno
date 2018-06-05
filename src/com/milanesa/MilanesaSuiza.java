package com.milanesa;

public class MilanesaSuiza extends Milanesa {
    @Override
    protected void cocinar() {
        System.out.println("Cocinando milanesa suiza");
    }

    @Override
    public void isRica() {
        System.out.println("Obvio, soy una milanesa suiza");
    }
}
