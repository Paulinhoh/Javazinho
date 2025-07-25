package edu.modulo01_devdojo.B_introducao_metodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

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

        double media = 0;
        for (double salario : this.salarios) {
            media += salario;
        }
        System.out.println("Média salarial: &d ".formatted((media / this.salarios.length)));
    }
}
