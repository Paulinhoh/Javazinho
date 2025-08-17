package edu.exercicios;

import java.util.Scanner;

public class Exercicio03 {

    /*
     *   3 - Faça um algoritmo que leia dois valores inteiros A e B, se os
     * valores de A e B forem iguais, deverá somar os dois valores,
     *
     *   caso contrário devera multiplicar A por B. Ao final de qualquer
     * um dos cálculos deve-se atribuir o resultado a uma variável C e
     *
     *   imprimir seu valor na tela.
     * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de a (int): ");
        int a = scan.nextInt();

        System.out.print("Digite o valor de b (int): ");
        int b = scan.nextInt();

        int c;
        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }

        System.out.println("Resultado: " + c);

        scan.close();
    }
}
