package edu.modulo01_devdojo;

public class Aula04_Condicionais_Exercicio02 {
    public static void main(String[] args) {

        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia util ou final de semana
        // Considerando 1 como domingo

        byte dia = 7;
        switch (dia) {
            case 1 -> System.out.println("Domingo - final de semana");
            case 2 -> System.out.println("Segunda - dia util");
            case 3 -> System.out.println("Terça - dia util");
            case 4 -> System.out.println("Quarta - dia util");
            case 5 -> System.out.println("Quinta - dia util");
            case 6 -> System.out.println("Sexta - dia util");
            case 7 -> System.out.println("Sabado - final de semana");
            default -> System.out.println("Opção Invalida");
        }
    }
}
