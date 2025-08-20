package edu.cursos.devdojo.exercicios;

import java.util.Scanner;

public class Exercicio05 {

    /*
    *   5 - Faça um algoritmo que leia o valor do salário
    * mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
    * usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
    * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double salarioMinimo = 1293.20;
        System.out.println("Qual o seu salario: ");
        double salario = scan.nextDouble();

        int contador = 0;
        while (salario >= salarioMinimo) {
            salario = salario - salarioMinimo;
            contador++;
        }

        if (salario > 0){
            System.out.println("Você recebe " + contador + " salarios minimos e " + salario);
        } else {
            System.out.println("Você recebe " + contador + " salarios minimos");
        }

        scan.close();
    }
}
