package edu.cursos.devdojo.exercicios;

public class Exercicio19 {

    /*
     *   19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
     * */

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.println("{" + i + "} x {" + j + "} = {" + (i * j) + "}");
            }
            System.out.println(" ");
        }
    }
}
