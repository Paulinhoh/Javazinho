package edu.cursos.devdojo.introducao;

public class Aula04_Condicionais_Exercicio01 {
    public static void main(String[] args) {

        double salario = 70000;
        double taxa;

        if (salario >= 0 && salario < 34712) {
            taxa = salario * 0.097;
        } else if (salario >= 34712 && salario < 68507) {
            taxa = salario * 0.3735;
        } else {
            taxa = salario * 0.495;
        }
        System.out.println("Valor da taxa: "+taxa);
    }
}
