package edu.cursos.devdojo.javacore.O_exception.domain;

import java.io.FileNotFoundException;

public class Pessoa {

    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando pessoa...");
    }
}
