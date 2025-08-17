package edu.devdojo.javacore.B_introducao_metodos.test;

import edu.devdojo.javacore.B_introducao_metodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumeros(20, 2);
        System.out.println(result);
        System.out.println((int) calculadora.divideDoisNumeros(15, 4));
        System.out.println(calculadora.divideDoisNumeros(15, 0));
    }
}
