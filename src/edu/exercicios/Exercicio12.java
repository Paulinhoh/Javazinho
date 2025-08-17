package edu.exercicios;

import java.util.Scanner;

public class Exercicio12 {

    /*
    *   12 - Faça um algoritmo que leia o valor de um produto e determine o valor que
    * deve ser pago, conforme a escolha da forma de pagamento pelo comprador e imprima na
    * tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições
    * de pagamento para efetuar o cálculo adequado.
    *
    *   Tabela de Código de Condições de Pagamento
    * 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
    * 2 - À Vista no cartão de crédito, recebe 10% de desconto
    * 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
    * 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
    * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valor = scan.nextDouble();
        System.out.println("Tabela de Código de Condições de Pagamento");
        System.out.println("[1] - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("[2] - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("[3] - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("[4] - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        System.out.print("-> ");
        int escolha = scan.nextInt();

        if (escolha == 1){
            System.out.println("Valor final: " + (valor - (valor*0.15)));
        } else if (escolha ==2) {
            System.out.println("Valor final: " + (valor - (valor*0.10)));
        } else if (escolha==3) {
            System.out.println("Valor final: " + valor);
        } else {
            System.out.println("Valor final: " + (valor + (valor*0.10)));
        }

        scan.close();
    }
}
