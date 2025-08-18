package edu.devdojo.javacore.Q_string.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = " Luffy    ";
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.replace("f", "l"));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());

        String numbers = "012345";
        System.out.println(numbers.length());
        System.out.println(numbers.substring(0,2));
        System.out.println(numbers.substring(2,numbers.length()));
    }
}
