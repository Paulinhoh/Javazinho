package edu.exercicios;

import java.util.Scanner;

public class Exercicio01 {

    /*
     *   1 - Faça um algoritmo que leia os valores de A, B, C e em seguida
     * imprima na tela a soma entre A e B é mostre se a soma é menor que C.
     * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scan.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scan.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scan.nextDouble();

        double somaAB = a + b;
        String resultadoC;

        if (somaAB < c) {
            resultadoC = "Menor";
        } else if (somaAB > c) {
            resultadoC = "Maior";
        } else {
            resultadoC = "igual";
        }

        System.out.println("Resultado da soma de A + B: " + somaAB);
        System.out.println("A soma de A + B é " + resultadoC + " que C");

    }
}
