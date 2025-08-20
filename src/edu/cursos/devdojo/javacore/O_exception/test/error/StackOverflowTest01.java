package edu.cursos.devdojo.javacore.O_exception.test.error;

public class StackOverflowTest01 {
    // Causando um error de recursividade
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
