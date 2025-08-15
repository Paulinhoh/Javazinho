package edu.exercicios;

import java.util.Scanner;

public class Exercicio13 {

    /*
    *   13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima
    * na tela o nome da pessoa e se ela é maior ou menor de idade.
     * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();

        if (idade >= 18) {
            System.out.println(nome+ ", você é maior de idade");
        } else {
            System.out.println(nome+ ", você é menor de idade");
        }
    }
}
