package com.chatMediator;

public class Chat {

    public static void showMessage(User user, String message) {
        System.out.println("El usuario: " + user.getName() + " envio el mensaje: " + message);
    }
}
