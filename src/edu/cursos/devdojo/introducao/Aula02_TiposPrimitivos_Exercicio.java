package edu.cursos.devdojo.introducao;
/*
    Pratica

    Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereco>,
    confirmo que recebi o sálario de <salario>, na data <data>
*/

public class Aula02_TiposPrimitivos_Exercicio {
    public static void main(String[] args) {

        String nome = "Paulo Henrique";
        String endereco = "Rua Panificador Jose Silva";
        double salario = 3500.00;
        String dataRecebimentoSalario = "18/05/2025";

        System.out.println("Eu "+nome+", morando no endereço "+endereco+",\n" +
                "confirmo que recebi o sálario de "+salario+", na data "+dataRecebimentoSalario);
    }
}
