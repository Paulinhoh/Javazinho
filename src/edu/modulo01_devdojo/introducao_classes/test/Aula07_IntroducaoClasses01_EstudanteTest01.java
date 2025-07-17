package edu.modulo01_devdojo.introducao_classes.test;

import edu.modulo01_devdojo.introducao_classes.dominio.Aula07_IntroducaoClasses01_Estudante;

public class Aula07_IntroducaoClasses01_EstudanteTest01 {
    public static void main(String[] args) {
        
        Aula07_IntroducaoClasses01_Estudante estudante = new Aula07_IntroducaoClasses01_Estudante();
        
        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
