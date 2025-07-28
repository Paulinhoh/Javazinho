package edu.modulo01_devdojo.javacore.E_blocosdeinicializacao.test;

import edu.modulo01_devdojo.javacore.E_blocosdeinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
