package edu.projetos_basico.conversor_moedas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ConversorMoeda conversorMoeda = new ConversorMoeda();

        System.out.print("Digite o valor a ser convertido: ");
        double valor = scan.nextDouble();

        System.out.println("Converso de moedas");
        System.out.println("[1] - Real para Dollar");
        System.out.println("[2] - Dollar para Real");
        System.out.print("-> ");
        int opcao = scan.nextInt();

        Double valorConvertido = null;
        switch (opcao) {
            case 1 -> valorConvertido = conversorMoeda.realForDollar(valor);
            case 2 -> valorConvertido = conversorMoeda.dollarForReal(valor);
            default -> System.out.println("Opção Invalida!");
        }

        if (valorConvertido != null) {
            System.out.println("Valor convertido: " + valorConvertido);
        }
    }
}
