package edu.exercicios;

import java.util.Scanner;

public class Exercicio02 {

    /*
     *   2 - Faça um algoritmo para receber um número qualquer e imprimir na
     * tela se o número é par ou ímpar, positivo ou negativo.
     * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero Inteiro qualquer: ");
        int numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero " + numero + " é par");
        } else {
            System.out.println("O numero " + numero + " é impar");
        }

        scan.close();
    }
}
