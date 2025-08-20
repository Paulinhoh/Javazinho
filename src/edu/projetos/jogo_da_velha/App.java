package edu.projetos.jogo_da_velha;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner scan = new Scanner(System.in);

        char jogadorAtual = 'x';
        boolean jogoAcabou = false;

        while (!jogoAcabou) {
            game.exibirTabuleiro();

            int linha, coluna;
            boolean jogadaValida = false;

            do {
                System.out.printf("Jogador %c, entre com a linha (1-3): ", jogadorAtual);
                linha = scan.nextInt() - 1;
                System.out.printf("Jogador %c, entre com a coluna (1-3): ", jogadorAtual);
                coluna = scan.nextInt() - 1;

                jogadaValida = game.fazerJogada(linha, coluna, jogadorAtual);
            } while (!jogadaValida); // Repete até o usuário fazer uma jogada válida

            if (game.verificarVitoria(jogadorAtual)) {
                game.exibirTabuleiro();
                System.out.printf("Jogador %c venceu!\n", jogadorAtual);
                break;
            } else if (game.verificarEmpate()) {
                game.exibirTabuleiro();
                System.out.println("Empate!");
                break;
            }

            jogadorAtual = (jogadorAtual == 'x') ? 'o' : 'x';
        }
        scan.close();
    }
}
