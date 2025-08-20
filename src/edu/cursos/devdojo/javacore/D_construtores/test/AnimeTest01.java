package edu.cursos.devdojo.javacore.D_construtores.test;

import edu.cursos.devdojo.javacore.D_construtores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "Tv", 12, "Ação", "Production IG");
        anime.imprime();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-==-==-=-=-=");

        Anime anime2 = new Anime();
        anime2.imprime();
    }
}
