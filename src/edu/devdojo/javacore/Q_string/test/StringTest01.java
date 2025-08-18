package edu.devdojo.javacore.Q_string.test;

public class StringTest01 {
    public static void main(String[] args) {
        // Strings são imultaveis
        String name = "William"; // String constant pool
        String nameTwo = "William";
        name = name.concat(" Suane");

        System.out.println(name);
        System.out.println(name == nameTwo); // referenciando se é o mesmo objeto e não se o resultado é igual
        // (equals())

        // não há motivos para se criar uma string dessa maneira abaixo.
        String nameThree = new String("William"); // 1 variavel de referencia, 2 objeto do tipo string, 3 uma string
        // na pool de strings
        System.out.println(nameTwo == nameThree);
        System.out.println(nameTwo == nameThree.intern());
    }
}
