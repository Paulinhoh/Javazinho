package edu.devdojo.javacore.B_introducao_metodos.domain;

public class ImpressoraEstudante {

    public void imprime(Estudante estudante) {
        System.out.println("-------------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        estudante.nome = "Gohan";
    }
}
