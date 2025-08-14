package edu.devdojo.poo.N_polimorfismo.test;

import edu.devdojo.poo.N_polimorfismo.domain.Computador;
import edu.devdojo.poo.N_polimorfismo.domain.Televisao;
import edu.devdojo.poo.N_polimorfismo.domain.Tomate;
import edu.devdojo.poo.N_polimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate cereja", 10);
        Televisao tv = new Televisao("Sansung 50\"", 5000);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------------------");
        CalculadoraImposto.calcularImposto(tv);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
