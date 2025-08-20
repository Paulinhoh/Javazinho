package edu.cursos.devdojo.javacore.F_modificadorstatic.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0- Bloco de inicialização estatico é execultado quando a JVM carrega a classe
    // 1- Alocado espaço em memória pro objeto
    // 2- Cada atributo de classe é craido e inicializado com valores default ou o que for passado
    // 3- Bloco de inicialização é execultado
    // 4- Construtor é execultado
    static {
        System.out.println("Dentro do bloco de inicialização 1");
        Anime.episodios = new int[100];
        for (int i = 0; i < Anime.episodios.length; i++) {
            Anime.episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização 3 ");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estatico ");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return Anime.episodios;
    }
}
