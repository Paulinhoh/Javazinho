package edu.cursos.devdojo.exercicios;

import java.util.Scanner;

public class Exercicio20 {

    /*
    *   20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
    * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o numero para ver a tabuada: ");
        int valor = scan.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println("{" + valor + "} x {" + i + "} = {" + (i * valor) + "}");
        }

        scan.close();
    }
}
