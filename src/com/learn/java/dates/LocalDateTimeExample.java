package com.learn.java.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime : " + localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2018,3,21,23,33,33,12345);
        System.out.println("localDateTime1 : " + localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("localDateTime2 : " + localDateTime2);

        System.out.println("hour : " + localDateTime.getHour());
        System.out.println("minute : " + localDateTime.getMinute());
        System.out.println("day of month : " + localDateTime.getDayOfMonth());
        System.out.println("day of month chronofield : " + localDateTime.get(ChronoField.DAY_OF_MONTH));

        System.out.println("plus hours : " + localDateTime.plusHours(2));
        System.out.println("minus days : " + localDateTime.minusDays(2));
        System.out.println("with month : " + localDateTime.withMonth(12));

        LocalDate localDate = LocalDate.of(2019, 1, 1);
        System.out.println("at time : " + localDate.atTime(23, 33));

        LocalTime localTime = LocalTime.of(23, 39);
        System.out.println("at date : " + localTime.atDate(localDate));

        LocalDateTime localDateTime3 = localTime.atDate(localDate);
        System.out.println("to local date : " + localDateTime3.toLocalDate());
        System.out.println("to local time : " + localDateTime3.toLocalTime());

    }

}
