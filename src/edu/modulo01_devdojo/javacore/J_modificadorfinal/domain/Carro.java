package edu.modulo01_devdojo.javacore.J_modificadorfinal.domain;

// public final class <nome> -> quando a classe é final ela não pode ser extendida por outra classe
public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime() {
        System.out.println("Metodos final não podem ser sobrescritos");
        System.out.println(this.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
