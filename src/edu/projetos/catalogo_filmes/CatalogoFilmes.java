package edu.projetos.catalogo_filmes;

import java.util.ArrayList;
import java.util.List;

public class CatalogoFilmes {
    private List<Filme> listaDeFilmes;

    public CatalogoFilmes() {
        this.listaDeFilmes = new ArrayList<>();
    }

    // Metodo para adicionar um novo filme ao catálogo
    public void adicionarFilme(String titulo, String diretor, int anoLancamento) {
        Filme novoFilme = new Filme(titulo, diretor, anoLancamento);
        this.listaDeFilmes.add(novoFilme);
        System.out.println("Filme adicionado com sucesso!\n");
    }

    // Metodo para listar todos os filmes
    public void listarFilmes() {
        System.out.println("\n--- Catálogo de Filmes ---");
        if(listaDeFilmes.isEmpty()){
            System.out.println("Nenhum filme no catálogo.\n");
        } else {
            for (Filme filme: listaDeFilmes) {
                System.out.println(filme);  // Usa o metodo toString() da classe Livro
            }
        }
        System.out.println("--------------------------\n");
    }

    // Implementando buscas de diferentes maneiras
    // Busca por diretor
    public List<Filme> buscarPorDiretor(String diretor) {
        List<Filme> filmesDoDiretor = new ArrayList<>();
        if(!listaDeFilmes.isEmpty()){
            for(Filme filme: listaDeFilmes){
                // Use equalsIgnoreCase para não diferenciar maiúsculas de minúsculas
                if(filme.getDiretor().equalsIgnoreCase(diretor)){
                    filmesDoDiretor.add(filme);
                }
            }
        }
        return filmesDoDiretor;
    }

    // Busca por titulo
    public Filme buscarPorTitulo(String titulo){
        if(!listaDeFilmes.isEmpty()){
            for(Filme filme: listaDeFilmes){
                if(filme.getTitulo().equalsIgnoreCase(titulo)){
                    return filme;   // Retorna o primeiro livro encontrado com o titulo
                }
            }
        }
        return null;    // Retorna null se não encontrar o livro

    }
}
