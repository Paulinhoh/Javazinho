package edu.devdojo.javacore.N_polimorfismo.test;

import edu.devdojo.javacore.N_polimorfismo.domain.Computador;
import edu.devdojo.javacore.N_polimorfismo.domain.Produto;
import edu.devdojo.javacore.N_polimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());

        System.out.println("-----------------------------");

        Produto produto2 = new Tomate("Tomate Cereja", 11);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
    }
}
