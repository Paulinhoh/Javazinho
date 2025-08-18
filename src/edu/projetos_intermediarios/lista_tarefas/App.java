package edu.projetos_intermediarios.lista_tarefas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        GerenciadorDeTarefas gerenciadorDeTarefas = new GerenciadorDeTarefas();
        Scanner scan = new Scanner(System.in);
        int option = -1;

        while (option!=0) {
            System.out.println("### To-Do List ###");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Marcar Tarefa como Concluída");
            System.out.println("4. Listar Tarefas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                option = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor digite um numero valido.\n");
                continue;
            }

            switch (option) {
                case 1 -> {
                    System.out.print("Digite a descrição da terefa: ");
                    String description = scan.nextLine();
                    gerenciadorDeTarefas.addTarefa(description);
                }
                case 2 -> {
                    System.out.print("Digite o índice da tarefa para remover: ");
                    int indexRemove = Integer.parseInt(scan.nextLine());
                    gerenciadorDeTarefas.removeTarefa(indexRemove);
                }
                case 3 -> {
                    System.out.print("Digite o índice da tarefa para marcar como concluída: ");
                    int indexCompleted = Integer.parseInt(scan.nextLine());
                    gerenciadorDeTarefas.markAsCompleted(indexCompleted);
                }
                case 4 -> gerenciadorDeTarefas.listTarefas();
                case 0 -> System.out.println("Saindo do programa\n");
                default -> System.out.println("Opção Invalida!\n");             
            }
        }

        scan.close();
    }
}
