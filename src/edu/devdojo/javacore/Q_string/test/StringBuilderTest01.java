package edu.devdojo.javacore.Q_string.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "Luffy";
        name.concat(", Monkey D.");
        name.substring(0,2);
        System.out.println(name);

        // StringBuildes são multaveis
        StringBuilder sb = new StringBuilder("Luffy"); // tamanho padrão é 16 -> caso não coloque nada
        sb.append(", Monkey D.").append(" -> Futuro Rei dos Piratas");
        sb.substring(0,2); // no caso não funciona pq o retorno desta função é uma String
        sb.reverse();
        sb.delete(0,26);
        sb.reverse();
        System.out.println(sb);
    }
}
