package edu.modulo01_devdojo.introducao;

public class Aula06_Arrays02 {

    public static void main(String[] args) {
        
        // byte, short, int, long, float, double = 0
        // char = '\u0000'
        // boolean = false
        // String = null

        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";
        nomes[3] = "Hinata";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
