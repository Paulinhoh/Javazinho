package edu.modulo01_devdojo.introducao;

public class Aula03_Operadores {
    public static void main(String[] args) {
        // Aritiméticos + - / *
        int numero1 = 10;
        int numero2 = 20;
        int soma = numero1 + numero2;
        int sub = numero1 - numero2;
        int mult = numero1 * numero2;
        int divInteira = numero1 / numero2;
        double div = (double) numero1 / (double) numero2;

        System.out.println("soma = " + soma);
        System.out.println("sub = " + sub);
        System.out.println("mult = " + mult);
        System.out.println("divInteira = " + divInteira);
        System.out.println("div = " + div);
        System.out.println();

        // Relacionais %
        int resto = 20 % 2;
        System.out.println(resto);

        // Lógicos < > <= >= == !=
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorOuIgualQueVinte = 10 <= 20;
        boolean isDezMaiorOuIgualQueVinte = 10 >= 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;

        System.out.println("isDezMenorQueVinte = " + isDezMenorQueVinte);
        System.out.println("isDezMaiorQueVinte = " + isDezMaiorQueVinte);
        System.out.println("isDezMenorOuIgualQueVinte = " + isDezMenorOuIgualQueVinte);
        System.out.println("isDezMaiorOuIgualQueVinte = " + isDezMaiorOuIgualQueVinte);
        System.out.println("isDezIgualQueVinte = " + isDezIgualQueVinte);
        System.out.println("isDezDiferenteQueVinte = " + isDezDiferenteQueVinte);
        System.out.println();

        // && (AND) || (OR) ! (NOT)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta = " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta = " + isDentroDaLeiMenorQueTrinta);
        System.out.println();

        double valorDaContaPoupanca = 200;
        double valorDaContaCorrente = 5500;
        var valorPlaystation = 5000D;
        boolean isPlaystationCompravel = valorDaContaPoupanca > valorPlaystation || valorDaContaCorrente > valorPlaystation;

        System.out.println("isPlaystationCompravel = " + isPlaystationCompravel);
        System.out.println();

        // Atribuição = += -= *= /= %=
        var bonus = 1800; // 1800
        bonus += 1000;    // 2800
        bonus -= 1000;    // 1800
        bonus *= 2;       // 3600
        bonus /= 2;       // 1800
        bonus %= 2;       // 0
        System.out.println("Bonus = " + bonus);
        System.out.println();

        // ++ --
        int contador = 0;   // 0
        contador += 1;      // 1
        contador++;         // 2
        contador--;         // 1
        System.out.println(contador);
        System.out.println();

    }
}
