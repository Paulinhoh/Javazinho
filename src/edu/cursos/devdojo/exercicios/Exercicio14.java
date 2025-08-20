package edu.cursos.devdojo.exercicios;

public class Exercicio14 {

    /*
    *   14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o
    * valor de B por A e imprima na tela os valores.
    * */

    public static void main(String[] args) {
        int valorA = 5;
        int valorB = 7;

        System.out.println("Valor de A: "+valorA);
        System.out.println("Valor de B: "+valorB);

        int auxiliar;

        auxiliar = valorA;
        valorA = valorB;
        valorB = auxiliar;

        System.out.println("==-=-=-=-=-=-=-=-=-=-=-=-==");

        System.out.println("Valor de A trocado: "+valorA);
        System.out.println("Valor de B trocado: "+valorB);
    }
}
