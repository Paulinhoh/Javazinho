package edu.devdojo.poo.N_polimorfismo.service;

import edu.devdojo.poo.N_polimorfismo.repository.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando na memoria");
    }
}
