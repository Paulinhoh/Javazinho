package edu.exercicios;

import java.util.Scanner;

public class Exercicio16 {

    /*
     *   16 - Faça um algoritmo que leia três valores que representam os três lados de um
     * triângulo e verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.
     * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o 1° lado do triangulo: ");
        int lado1 = scan.nextInt();
        System.out.print("Digite o 2° lado do triangulo: ");
        int lado2 = scan.nextInt();
        System.out.print("Digite o 3° lado do triangulo: ");
        int lado3 = scan.nextInt();

        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("Triangulo equilátero");
        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
            System.out.println("Triangulo escaleno");
        } else {
            System.out.println("Triangulo isósceles");
        }
    }
}
