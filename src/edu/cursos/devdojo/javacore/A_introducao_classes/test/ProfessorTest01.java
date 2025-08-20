package edu.cursos.devdojo.javacore.A_introducao_classes.test;

import edu.cursos.devdojo.javacore.A_introducao_classes.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {

        // Instanciando um objeto
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println("nome: " + professor.nome + ", idade: " + professor.idade + ", sexo: " + professor.sexo);
    }
}
