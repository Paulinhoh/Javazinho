package edu.devdojo.javacore.O_exception.domain;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Login inválido");
    }
    
    public LoginInvalidoException(String message) {
        super(message);
    }
}
