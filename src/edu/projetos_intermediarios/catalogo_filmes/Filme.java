package edu.projetos_intermediarios.catalogo_filmes;

public class Filme {
    // Atributos privados para garantir o encapsulamento
    private String titulo;
    private String diretor;
    private int anoLancamento;

    // Construtor para inicializar um objeto Filme
    public Filme(String titulo, String diretor, int anoLancamento) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
    }

    // Métodos Getters para acessar os atributos
    public String getTitulo() {
        return this.titulo;
    }

    public String getDiretor() {
        return this.diretor;
    }

    public int getAnoLancamento() {
        return this.anoLancamento;
    }

    // Sobrescreva o método toString() para uma exibição amigável
    @Override
    public String toString() {
        return "Título: '" + this.titulo + '\'' +
                ", Autor: '" + this.diretor + '\'' +
                ", Ano: " + this.anoLancamento;
    }
}
