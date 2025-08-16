package edu.projetos_basico.calculadora;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.print("Digite o 1° valor: ");
        double valorA = scan.nextDouble();
        System.out.print("Digite o 2° valor: ");
        double valorB = scan.nextDouble();

        System.out.println("Escolha a Operação:");
        System.out.println("[1] - Soma");
        System.out.println("[2] - Subtração");
        System.out.println("[3] - Multiplicação");
        System.out.println("[4] - Divisão");
        System.out.print("-> ");
        int operacao = scan.nextInt();

        Double resultado = null;
        switch (operacao) {
            case 1 -> resultado = calculadora.soma(valorA, valorB);
            case 2 -> resultado = calculadora.sub(valorA, valorB);
            case 3 -> resultado = calculadora.mult(valorA, valorB);
            case 4 -> {
                if (valorB == 0) {
                    System.out.println("ERROR: divisão por zero!");
                } else {
                    resultado = calculadora.div(valorA, valorB);
                }
            }
            default -> System.out.println("Opção Invalida!");
        }

        if (resultado != null) {
            System.out.println("Resultado: " + resultado);
        }

    }
}
