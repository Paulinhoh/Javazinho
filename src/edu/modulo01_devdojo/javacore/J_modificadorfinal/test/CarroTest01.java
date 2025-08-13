package edu.modulo01_devdojo.javacore.J_modificadorfinal.test;

import edu.modulo01_devdojo.javacore.J_modificadorfinal.domain.Carro;
import edu.modulo01_devdojo.javacore.J_modificadorfinal.domain.Comprador;
import edu.modulo01_devdojo.javacore.J_modificadorfinal.domain.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("F40");
        ferrari.imprime();
    }
}
