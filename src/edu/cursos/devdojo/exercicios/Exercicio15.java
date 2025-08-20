package edu.cursos.devdojo.exercicios;

public class Exercicio15 {

    /*
    *   15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela
    * quantos anos, meses e dias essa pessoa ja viveu. Leve em consideração o ano com 365 dias e o mês com 30 dias.
    *
    * (Ex: 5 anos, 2 meses e 15 dias de vida)
    * */

    public static void main(String[] args) {
        int anoNascimento = 2001;
        int dataAtual = 2025;

        int idade = dataAtual - anoNascimento;
        System.out.println(idade);
    }
}
