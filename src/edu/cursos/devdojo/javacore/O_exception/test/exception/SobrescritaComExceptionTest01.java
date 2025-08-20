package edu.cursos.devdojo.javacore.O_exception.test.exception;

import java.io.FileNotFoundException;

import edu.cursos.devdojo.javacore.O_exception.domain.Funcionario;
import edu.cursos.devdojo.javacore.O_exception.domain.LoginInvalidoException;
import edu.cursos.devdojo.javacore.O_exception.domain.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            pessoa.salvar();
        } catch (FileNotFoundException | LoginInvalidoException e) {
            e.printStackTrace();
        }

        funcionario.salvar();
    }
}
