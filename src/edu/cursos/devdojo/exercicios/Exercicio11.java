package edu.cursos.devdojo.exercicios;

public class Exercicio11 {

    /*
     *   11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas,
     * imprima na tela o nome do aluno e se o aluno foi aprovado ou reprovado. Para o aluno ser considerado
     * aprovado sua média final deve ser maior ou igual a 7.
     * */

    public static void main(String[] args) {
        double nota1 = 7;
        double nota2 = 8;
        double nota3 = 2;
        double nota4 = 5;

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        if(media>=5){
            System.out.println("Aprovado");
        } else if (media >=4 && media <5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
