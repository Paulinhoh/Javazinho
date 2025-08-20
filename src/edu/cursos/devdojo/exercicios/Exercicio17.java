package edu.cursos.devdojo.exercicios;

public class Exercicio17 {

    /*
     *   17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura
     * correspondente em grau Celsius. Imprima na tela as duas temperaturas.
     *
     * Fórmula: C = (5 * ( F-32) / 9)
     * */

    public static void main(String[] args) {
        double fahrenheit = 75;
        double celsius = (5 * (fahrenheit - 32) / 9);

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celsius: " + celsius);
    }
}
