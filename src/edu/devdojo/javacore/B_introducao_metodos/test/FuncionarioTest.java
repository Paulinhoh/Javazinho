package edu.devdojo.javacore.B_introducao_metodos.test;

import edu.devdojo.javacore.B_introducao_metodos.domain.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Sanji");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario.imprimirDados();
        System.out.println("Média: "+funcionario.getMedia());
    }
}
