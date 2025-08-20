package edu.exercicios;

import java.util.Scanner;

public class Exercicio07 {

    /*
    *   7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
    * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite true ou false: ");
        boolean valor1 = scan.nextBoolean();
        System.out.println("Digite true ou false: ");
        boolean valor2 = scan.nextBoolean();

        if (valor1==valor2){
            if (valor1){
                System.out.println("VERDADEIROS");
            } else {
                System.out.println("FALSOS");
            }
        } else {
            System.out.println("VALORES DIFERENTES");
        }

        scan.close();
    }
}
