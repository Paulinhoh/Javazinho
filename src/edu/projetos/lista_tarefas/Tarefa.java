package edu.projetos.lista_tarefas;

public class Tarefa {
    private String description;
    private boolean completed;
    
    // Construtor: usado para criar um novo objeto Tarefa
    public Tarefa(String description) {
        this.description = description;
        this.completed = false;
    }

    // Métodos para acessar e modificar os atributos (Getters e Setters)
    public String getDescription() {
        return this.description;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public void setCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (this.completed ? "[X] " : "[ ] ") + this.description;
    }
}