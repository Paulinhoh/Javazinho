package edu.modulo01_devdojo.B_introducao_metodos.test;

import edu.modulo01_devdojo.B_introducao_metodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1, 2, 3, 4, 5);
    }
}
