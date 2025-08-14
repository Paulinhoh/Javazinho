package edu.devdojo.poo.G_associacao.test;

import edu.devdojo.poo.G_associacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogado1 = new Jogador("Pelé");
        Jogador jogado2 = new Jogador("Romário");
        Jogador jogado3 = new Jogador("Cafu");

        Jogador[] jogadores = new Jogador[]{jogado1, jogado2, jogado3};

        for(Jogador jogador: jogadores){
            jogador.imprime();
        }

        /*
        *   Jogador     1 -- 1   Personagem
        *   Time        1 -- N   Jogador
        *   Jogador     N -- 1   Time
        *   Estudante   N -- N   Curso
        * */
    }
}
