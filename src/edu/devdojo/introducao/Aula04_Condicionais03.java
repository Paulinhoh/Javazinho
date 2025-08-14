package edu.devdojo.introducao;

public class Aula04_Condicionais03 {
    public static void main(String[] args) {

        // Doar se salario > 5000
        double salario = 6000;

        // Ternario -> (condição) ? verdadeiro : falso
        String resultado = (salario > 5000) ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter!";
        System.out.println(resultado);
    }
}
