package edu.modulo01_devdojo.A_introducao_classes.test;

import edu.modulo01_devdojo.A_introducao_classes.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Audi";
        carro1.modelo = "A8";
        carro1.ano = 2018;

        carro2.nome = "BMW";
        carro2.modelo = "X6";
        carro2.ano = 2019;


        carro1 = carro2;

        System.out.println("Carro 1: " + carro1.nome + " " + carro1.modelo + " " + carro1.ano);
        System.out.println("Carro 2: " + carro2.nome + " " + carro2.modelo + " " + carro2.ano);
    }
}
