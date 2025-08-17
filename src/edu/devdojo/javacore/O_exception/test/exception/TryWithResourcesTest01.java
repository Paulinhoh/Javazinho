package edu.devdojo.javacore.O_exception.test.exception;

import java.io.Reader;

import edu.devdojo.javacore.O_exception.domain.Leitor1;
import edu.devdojo.javacore.O_exception.domain.Leitor2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivos3();
    }

    public static void lerArquivos() {
        try (Reader reader = new BufferedReader(new FileReader("test.txt"))) {
            // Aqui você pode ler o arquivo
            System.out.println("Lendo o arquivo");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lerArquivos2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));  
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void lerArquivos3() {
        try (Leitor1 leitor1 = new Leitor1();
        Leitor2 leitor = new Leitor2();) {
            System.out.println("Editando arquivo");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
