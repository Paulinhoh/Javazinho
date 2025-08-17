package edu.devdojo.javacore.N_polimorfismo.service;

import edu.devdojo.javacore.N_polimorfismo.repository.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando na memoria");
    }
}
