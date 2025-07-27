package edu.modulo01_devdojo.javacore.C_sobrecargametodos.test;

import edu.modulo01_devdojo.javacore.C_sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

//        anime.init("Akudama Drive", "Tv", 12);
        anime.init("Akudama Drive", "Tv", 12, "Ação");
        anime.imprime();
    }
}
