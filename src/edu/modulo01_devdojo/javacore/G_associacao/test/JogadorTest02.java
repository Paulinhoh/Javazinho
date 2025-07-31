package edu.modulo01_devdojo.javacore.G_associacao.test;

import edu.modulo01_devdojo.javacore.G_associacao.domain.Jogador;
import edu.modulo01_devdojo.javacore.G_associacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
