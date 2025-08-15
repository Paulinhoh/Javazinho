package edu.exercicios;

import java.util.Scanner;

public class Exercicio06 {

    /*
     *   6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
     * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        double valor = scan.nextInt();

        double reajuste = valor * 0.05;

        System.out.println("Aumento de 5% " + (valor + reajuste));
        System.out.println("Desconto de 5% " + (valor - reajuste));
    }
}
