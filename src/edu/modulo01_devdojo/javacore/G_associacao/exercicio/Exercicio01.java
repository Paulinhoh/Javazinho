package edu.modulo01_devdojo.javacore.G_associacao.exercicio;

public class Exercicio01 {
    /*
    * Crie um sistema que gerencie seminarios
    *
    * O sistema devera cadastrar seminarios, estudantes, professores e local onde sera realizado
    *
    * Um aluno podera estar em apenas um seminario
    * Um seminario podera ter nenhum ou varios alunos
    * Um professor podera ter varios seminarios
    * Um seminario deve ter local
    *
    * Campos basicos (excluindo relacionamentos)
    * seminario: titulo
    * aluno: nome e idade
    * professor: nome, especialidade
    * local: endereço
    * */

    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Onde achar o one piece", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
