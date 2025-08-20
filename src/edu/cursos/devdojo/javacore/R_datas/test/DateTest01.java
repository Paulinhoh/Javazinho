package edu.cursos.devdojo.javacore.R_datas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        // Classe ja obsoleta -> utilizado somente em sistemas legados
        Date date = new Date(1_000_000_000);        // long
        date.setTime(date.getTime() + 3_600_000);   // acrescentando 1h

        System.out.println(date);
    }
}
