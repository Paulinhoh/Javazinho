package edu.modulo01_devdojo.javacore.K_enum.test;

import edu.modulo01_devdojo.javacore.K_enum.domain.Cliente;
import edu.modulo01_devdojo.javacore.K_enum.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(Cliente.TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(Cliente.TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente);
    }
}
