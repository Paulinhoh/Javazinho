package edu.devdojo.javacore.N_polimorfismo.service;

import edu.devdojo.javacore.N_polimorfismo.repository.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando no arquivo");
    }
}
