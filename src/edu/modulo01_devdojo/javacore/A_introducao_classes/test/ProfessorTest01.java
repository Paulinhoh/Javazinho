package edu.modulo01_devdojo.javacore.A_introducao_classes.test;

import edu.modulo01_devdojo.javacore.A_introducao_classes.dominio.Professor;

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
