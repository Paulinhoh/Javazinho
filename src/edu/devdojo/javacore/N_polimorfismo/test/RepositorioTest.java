package edu.devdojo.javacore.N_polimorfismo.test;

import edu.devdojo.javacore.N_polimorfismo.repository.Repositorio;
import edu.devdojo.javacore.N_polimorfismo.service.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
