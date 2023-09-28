package org.pedro.exceptions.exception.test;

import org.pedro.exceptions.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void login() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "goku";
        String passwordDB = "ssj";
        System.out.println("User");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Password");
        String passwordDigitado = teclado.nextLine();
        if(!usernameDB.equals(usernameDigitado) || !passwordDB.equals(passwordDigitado)){
            throw new LoginInvalidoException("Usuario ou senha inválidos");
        }

        System.out.println("User logged");
    }
}
