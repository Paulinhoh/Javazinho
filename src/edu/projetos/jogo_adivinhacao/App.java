package edu.projetos.jogo_adivinhacao;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(21);
        int tentativas = 5;
        while (true) {
            System.out.println("Tentativas: " + tentativas);
            System.out.print("numero: ");
            int numeroEscolhido = scan.nextInt();

            if (numeroEscolhido < numeroAleatorio) {
                System.out.println("O palpite foi muito baixo");
                tentativas--;
            } else if (numeroEscolhido > numeroAleatorio) {
                System.out.println("O palpite foi muito alto");
                tentativas--;
            } else {
                System.out.println("Numero correto");
                break;
            }

            if (tentativas == 0) {
                System.out.println("Game Over!");
                break;
            }
        }

        scan.close();
    }
}
