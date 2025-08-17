package edu.devdojo.javacore.O_exception.test.exception;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException{
        File file = new File("src\\edu\\devdojo\\poo\\O_exception\\test\\exception\\arquivo\\test.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Aquivo criado: " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e; // relançando a exceção para que ela possa ser tratada em outro lugar, se necessário
        }
    }

    /*
     * geralmente é mehor usar o try - catch em metodos privados e o throws em metodos publicos por conta de qualquer pessoa poder acessar e voce não saber o modo em que esta pessoa vai trabalhar com o metodo
     */
}
