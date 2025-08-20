package edu.cursos.devdojo.javacore.A_introducao_classes.test;

import edu.cursos.devdojo.javacore.A_introducao_classes.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        
        Estudante estudante = new Estudante();
        
        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
