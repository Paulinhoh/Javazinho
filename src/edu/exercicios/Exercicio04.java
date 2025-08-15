package edu.exercicios;

import java.util.Scanner;

public class Exercicio04 {

    /*
     *   4 - Faça um algoritmo que receba um número inteiro e
     * imprima na tela o seu antecessor e o seu sucessor.
     * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de A (int): ");
        int a = scan.nextInt();

        System.out.println("Antecessor: " + (a - 1));
        System.out.println("Sucessor: " + (a + 1));
    }
}
