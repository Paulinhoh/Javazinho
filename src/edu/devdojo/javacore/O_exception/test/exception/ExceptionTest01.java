package edu.devdojo.javacore.O_exception.test.exception;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() {
        File file = new File("src\\edu\\devdojo\\poo\\O_exception\\test\\exception\\arquivo\\test.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Aquivo criado: " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
