package edu.modulo01_devdojo.introducao_classes.test;

import edu.modulo01_devdojo.introducao_classes.dominio.Aula07_IntroducaoClasses01_Estudante;

public class Aula07_IntroducaoClasses01_EstudanteTest02 {
    public static void main(String[] args) {

        Aula07_IntroducaoClasses01_Estudante estudante = new Aula07_IntroducaoClasses01_Estudante();
        Aula07_IntroducaoClasses01_Estudante estudante2 = new Aula07_IntroducaoClasses01_Estudante();
        
        estudante.nome = "Sanji";
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("-----------------------------");
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
