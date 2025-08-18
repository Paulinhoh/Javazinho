package edu.projetos_intermediarios.toDo;

import java.util.ArrayList;

public class GerenciadorDeTarefas {
    private ArrayList<Tarefa> tarefas;

    // Construtor
    public GerenciadorDeTarefas() {
        this.tarefas = new ArrayList<>(); // Inicializa a lista de tarefas
    }

    // Método para adicionar uma nova tarefa
    public void addTarefa(String description) {
        Tarefa newTarefa = new Tarefa(description);
        this.tarefas.add(newTarefa);
        System.out.println("Tarefa adicionada com sucesso.\n");
    }

    // Método para remover uma tarefa
    public void removeTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            this.tarefas.remove(indice);
            System.out.println("Tarefa removida com sucesso.\n");
        } else {
            System.out.println("Indice Invalido!\n");
        }
    }

    // Método para marcar uma tarefa como concluida
    public void markAsCompleted(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            this.tarefas.get(indice).setCompleted();
            System.out.println("Tarefa marcada como concluida.\n");
        } else {
            System.out.println("Indice Invalido!\n");
        }
    }

    // Método para listar todas as tarefas
    public void listTarefas() {
        System.out.println("\n--- Lista de Tarefas ---");
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa na lista.");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println(i + ": " + tarefas.get(i));
            }
        }
        System.out.println("------------------------\n");
    }

}
