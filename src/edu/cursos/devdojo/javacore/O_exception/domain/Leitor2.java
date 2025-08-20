package edu.cursos.devdojo.javacore.O_exception.domain;

import java.io.Closeable;
import java.io.IOException;

public class Leitor2 implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Fechando leitor 2"); 
    }
}
