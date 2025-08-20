package edu.projetos.lista_tarefas;

import java.util.ArrayList;

public class GerenciadorDeTarefas {
    private ArrayList<Tarefa> tarefas;

    // Construtor
    public GerenciadorDeTarefas() {
        this.tarefas = new ArrayList<>(); // Inicializa a lista de tarefas
    }

    // Metodo para adicionar uma nova tarefa
    public void addTarefa(String description) {
        Tarefa newTarefa = new Tarefa(description);
        this.tarefas.add(newTarefa);
        System.out.println("Tarefa adicionada com sucesso.\n");
    }

    // Metodo para remover uma tarefa
    public void removeTarefa(int index) {
        if (index >= 0 && index < tarefas.size()) {
            this.tarefas.remove(index);
            System.out.println("Tarefa removida com sucesso.\n");
        } else {
            System.out.println("Indice Invalido!\n");
        }
    }

    // Metodo para marcar uma tarefa como concluida
    public void markAsCompleted(int index) {
        if (index >= 0 && index < tarefas.size()) {
            this.tarefas.get(index).setCompleted();
            System.out.println("Tarefa marcada como concluida.\n");
        } else {
            System.out.println("Indice Invalido!\n");
        }
    }

    // Metodo para listar todas as tarefas
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
