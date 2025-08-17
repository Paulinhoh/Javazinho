package edu.devdojo.javacore.O_exception.test.runtime;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1, 0));
    }

    /**
     * 
     * @param a
     * @param b (can't be zero)
     * @return
     * @throws IllegalArgumentException
     */
    private static int divisao(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento inválido, o divisor não pode ser zero");
        }
        return a / b;
    }
}
