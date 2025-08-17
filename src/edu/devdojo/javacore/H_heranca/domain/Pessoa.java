package edu.devdojo.javacore.H_heranca.domain;

public class Pessoa {
    // no protected todas as subclasses e classes do mesmo pacote tem acesso
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static{
        System.out.println("Dentro do bloco de inicialização estatico de Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização2 de Pessoa");
    }

    public Pessoa(String nome){
        System.out.println("Dentro do construtor Pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
