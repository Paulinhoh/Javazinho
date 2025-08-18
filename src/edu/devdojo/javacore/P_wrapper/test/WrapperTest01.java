package edu.devdojo.javacore.P_wrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        // wrapper: são objetos que vão encapsular os tipos primitivos.
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10d;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10d;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("1");

        System.out.println(Character.isDigit('2'));
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('S'));
        System.out.println(Character.isLowerCase('S'));
        System.out.println(Character.toLowerCase('S'));
        System.out.println(Character.toUpperCase('S'));
    }
}
