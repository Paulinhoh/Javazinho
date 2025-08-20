package edu.cursos.devdojo.javacore.G_associacao.test;

import edu.cursos.devdojo.javacore.G_associacao.domain.Escola;
import edu.cursos.devdojo.javacore.G_associacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha Academy", professores);

        escola.imprimi();
    }
}
