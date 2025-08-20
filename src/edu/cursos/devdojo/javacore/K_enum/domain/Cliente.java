package edu.cursos.devdojo.javacore.K_enum.domain;

public class Cliente {
    // enum can be created inside a class, but it's not recommended, is better create in a new enum file
    public enum TipoPagamento {
        DEBITO {
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.1;
            }
        }, CREDITO {
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.05;
            }
        };

        public abstract double calcularDesconto(double valor);
    }

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt=" + tipoCliente.getValor() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
