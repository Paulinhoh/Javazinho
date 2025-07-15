package edu.modulo01_devdojo;

public class Aula05_EstruturasDeRepeticao02 {

    // Imprima os primeiros 25 numeros de um novo dado valor. Por exemplo, 50
    public static void main(String[] args) {

        int valorMax = 50;
        for (int i = 0; i <= valorMax ; i++) {
            if (i <= 25) {
                System.out.println(i);
            } else {
                break;
            }
        }
    }
}
