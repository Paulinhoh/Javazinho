package edu.cursos.devdojo.javacore.H_heranca.domain;

public class Funcionario extends Pessoa {
    private double salario;

    static{
        System.out.println("Dentro do bloco de inicialização estatico de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização2 de Funcionario");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor Funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
