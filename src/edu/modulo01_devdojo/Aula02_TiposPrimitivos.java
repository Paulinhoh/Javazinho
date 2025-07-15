package edu.modulo01_devdojo;

public class Aula02_TiposPrimitivos {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = 23;
        long bigNumber = 100000L;
        double salaryDouble = 2000.0;
        float salaryFloat = 2500.0F;
        byte ageByte = 10; // -128 até 127
        short ageShort = 10;
        boolean trueOrFalse = true;
        char letter = 'c';

        System.out.println("Minha idade é "+age);
        System.out.println(trueOrFalse);
        System.out.println("char: "+letter);

        // cast
        long number = (long) 123.50;
        System.out.println("Numero Double convertido para Long: "+number);

        // String
        String name = "Paulo Henrique"; // String não é um tipo primitivo e sim um Objeto
        System.out.println(name);

        // Tem uma maneira de criar uma variavel omitindo o seu tipo
        var lastName = "Paulo Henrique";
        System.out.println(lastName);
    }
}
