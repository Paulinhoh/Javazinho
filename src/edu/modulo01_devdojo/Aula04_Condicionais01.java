package edu.modulo01_devdojo;

public class Aula04_Condicionais01 {
    public static void main(String[] args) {

        int idade = 15;
        boolean isAutorizadoComprarBebidaAlcolica = idade >= 18;

        if (isAutorizadoComprarBebidaAlcolica){
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não autorizado");
        }

        if (!isAutorizadoComprarBebidaAlcolica){
            System.out.println("Não autorizado");
        }
    }
}
