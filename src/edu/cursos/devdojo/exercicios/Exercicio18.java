package edu.cursos.devdojo.exercicios;

public class Exercicio18 {

    /*
     *   18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
     * Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.
     * */

    public static void main(String[] args) {
        double fancisco = 1.10;
        double sara = 1.50;

        int count = 0;
        while (sara > fancisco) {
            fancisco += 0.03;
            sara += 0.02;
            count++;
        }

        System.out.println("Serão necessarios " + count + " anos para Francisco passar a altura de Sara");
    }
}
