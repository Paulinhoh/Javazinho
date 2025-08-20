package edu.cursos.devdojo.javacore.C_sobrecargametodos.test;

import edu.cursos.devdojo.javacore.C_sobrecargametodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

//        anime.init("Akudama Drive", "Tv", 12);
        anime.init("Akudama Drive", "Tv", 12, "Ação");
        anime.imprime();
    }
}
