package edu.cursos.devdojo.javacore.Q_string.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String: " + (fim - inicio) + "ms.");

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder: " + (fim - inicio) + "ms.");

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer: " + (fim - inicio) + "ms.");
    }

    private static void concatString(int tamanho) {
        String text = "";
        for (int i = 0; i < tamanho; i++) {
            text += i;  // 0,01,012,013
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sbf = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sbf.append(i);
        }
    }
}
