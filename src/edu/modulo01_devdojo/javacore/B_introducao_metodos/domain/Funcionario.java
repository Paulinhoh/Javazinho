package edu.modulo01_devdojo.javacore.B_introducao_metodos.domain;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }


    public void imprimirDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios != null) {
            for (double salario : this.salarios) {
                System.out.print(salario + " ");
            }
        }
        this.mediaSalarios();
    }

    public void mediaSalarios() {
        if (salarios == null) {
            return;
        }

        for (double salario : this.salarios) {
            media += salario;
        }
        System.out.println("Média salarial: &d ".formatted((media / this.salarios.length)));
    }
}
