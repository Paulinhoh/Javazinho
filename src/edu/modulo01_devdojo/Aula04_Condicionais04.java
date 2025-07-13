package edu.modulo01_devdojo;

public class Aula04_Condicionais04 {

    public static void main(String[] args) {

//      Imprima o dia da semana, considerando 1 como domingo
        byte dia = 5;
//      char, int, byte, short, enum, String
        switch (dia) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sabado");
            default -> System.out.println("Opção Invalida");
        }

//        Forma mais antiga do switch case
        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }
    }
}
