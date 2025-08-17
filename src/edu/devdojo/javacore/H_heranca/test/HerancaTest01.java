package edu.devdojo.javacore.H_heranca.test;

import edu.devdojo.javacore.H_heranca.domain.Endereco;
import edu.devdojo.javacore.H_heranca.domain.Funcionario;
import edu.devdojo.javacore.H_heranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");

        Pessoa pessoa = new Pessoa("Toyohisa Shimazu","11111111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("222222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        System.out.println("=--=--=-=-=-=-=-==-=-=-");
        funcionario.imprime();
    }
}
