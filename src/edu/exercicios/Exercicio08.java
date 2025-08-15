package edu.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio08 {

    /*
    *   8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
    * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o 1° valor: ");
        int valor1 = scan.nextInt();
        System.out.print("Digite o 2° valor: ");
        int valor2 = scan.nextInt();
        System.out.print("Digite o 3° valor: ");
        int valor3 = scan.nextInt();

        int[] valores = new int[3];
        valores[0] = valor1;
        valores[1] = valor2;
        valores[2] = valor3;

        Arrays.sort(valores);
        for(int valor: valores) {
            System.out.print(valor + " ");
        }
    }
}
