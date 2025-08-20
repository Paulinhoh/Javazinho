package edu.projetos.jogo_da_velha;

public class TicTacToe {
    private char[][] tabuleiro;

    public TicTacToe() {
        this.tabuleiro = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.tabuleiro[i][j] = ' ';  // Inicializa com espaços vazios
            }
        }
    }

    public void exibirTabuleiro() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(this.tabuleiro[i][j] + " | ");
            }
            System.out.println();   // Pula para a proxima linha
            System.out.println("-------------");
        }
    }

    public boolean fazerJogada(int linha, int coluna, char jogador) {
        // Varifica se a posição é valida
        if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && this.tabuleiro[linha][coluna] == ' ') {
            this.tabuleiro[linha][coluna] = jogador;
            return true;    // Jogada feita com sucesso
        }
        System.out.println("Jogada inválida! Tente novamente.");
        return false;   // Jogada não foi feita
    }

    public boolean verificarVitoria(char jogador) {
        // 1.Verificar linha
        for (int i = 0; i < 3; i++) {
            if (this.tabuleiro[i][0] == jogador && this.tabuleiro[i][1] == jogador && this.tabuleiro[i][2] == jogador) {
                return true;
            }
        }

        // 2.Verificar coluna
        for (int j = 0; j < 3; j++) {
            if (this.tabuleiro[0][j] == jogador && this.tabuleiro[1][j] == jogador && this.tabuleiro[2][j] == jogador) {
                return true;
            }
        }

        // 3.Verificar diagonais
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;    // Diagonal principal
        }
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
            return true;    // Diagonal secundária
        }

        return false;   // Nenhuma condição de vitória foi atingida
    }

    public boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.tabuleiro[i][j] == ' ') {
                    return false;   // Se encontrar qualquer espaço vazio, o jogo não empatou
                }
            }
        }
        return true;    // Se percorreu tudo e não achou espaços, deu empate
    }
}
