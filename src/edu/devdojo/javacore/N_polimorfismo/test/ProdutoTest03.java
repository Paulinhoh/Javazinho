package edu.devdojo.javacore.N_polimorfismo.test;

import edu.devdojo.javacore.N_polimorfismo.domain.Computador;
import edu.devdojo.javacore.N_polimorfismo.domain.Produto;
import edu.devdojo.javacore.N_polimorfismo.domain.Tomate;
import edu.devdojo.javacore.N_polimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate cereja", 10);
        tomate.setDataValidade("11/9/2025");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------");
        CalculadoraImposto.calcularImposto(computador);

    }
}
