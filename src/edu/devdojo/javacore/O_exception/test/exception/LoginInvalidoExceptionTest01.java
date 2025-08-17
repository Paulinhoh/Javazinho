package edu.devdojo.javacore.O_exception.test.exception;

import java.util.Scanner;

import edu.devdojo.javacore.O_exception.domain.LoginInvalidoException;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner scan = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaBD = "ssj";

        System.out.print("Usuario: ");
        String usernameDigitado = scan.nextLine();
        System.out.print("Senha: ");
        String senhaDigitada = scan.nextLine();
        scan.close();

        if(!usernameDB.equals(usernameDigitado) || !senhaBD.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuario ou senha inválidos");
        }

        System.out.println("Usuario logado com sucesso!");   
    }
}
