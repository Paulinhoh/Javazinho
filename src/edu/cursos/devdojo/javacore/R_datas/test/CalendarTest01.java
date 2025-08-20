package edu.cursos.devdojo.javacore.R_datas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        calendar.add(Calendar.DAY_OF_MONTH, 365); // no add se colocar muitos dias ou horas pode mudar o dia para o
        // proximo ou o ano
        calendar.roll(Calendar.HOUR, 12);   // roll adiciona a quantidade sem virar o dia ou o ano
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
