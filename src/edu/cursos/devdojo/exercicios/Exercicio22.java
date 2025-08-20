package edu.cursos.devdojo.exercicios;

public class Exercicio22 {

    /*
    *   22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o
    * quociente e o resto da divisão inteira entre eles.
    * */

    public static void main(String[] args) {
        int valor1 = 5;
        int valor2 = 2;

        int divisao = valor1/valor2;
        int resto = valor1%valor2;

        System.out.println(divisao);
        System.out.println(resto);
    }
}
