package edu.devdojo.javacore.O_exception.test.runtime;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exceção de índice de array capturada");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exceção de índice de array capturada");
        } catch (IllegalAccessError e) {
            System.out.println("Exceção de tempo de execução capturada");
        } catch (ArithmeticException e) {
            System.out.println("Exceção aritmética capturada");
        } catch (RuntimeException e) {
            System.out.println("Exceção de tempo de execução capturada");
        }

        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {
        System.out.println("Dentro de talvezLanceException");
    }
}
