package com.learn.java.dates;

import java.time.LocalDate;
import java.time.temporal.*;

public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("local date : " + localDate);

        LocalDate localDate1 = LocalDate.of(1991,9,21);
        System.out.println("local date 1 : " + localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(1991, 365);
        System.out.println("local date 2 : " + localDate2);

        System.out.println("get month : " + localDate.getMonth());
        System.out.println("get month value : " + localDate.getMonthValue());
        System.out.println("get day of week : " + localDate.getDayOfWeek());
        System.out.println("get day of year : " + localDate.getDayOfYear());
        System.out.println("day of month using get : " + localDate.get(ChronoField.DAY_OF_MONTH));

        System.out.println("plus days : " + localDate.plusDays(2));
        System.out.println("plus months : " + localDate.plusMonths(2));
        System.out.println("minus days : " + localDate.minusDays(2));
        System.out.println("with year : " + localDate.withYear(2019));
        System.out.println("with temporal field : " + localDate.with(ChronoField.YEAR, 2020));
        System.out.println("with temporal adjuster : " + localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println("minus chronounit : " + localDate.minus(1, ChronoUnit.YEARS));

        System.out.println("leap year : " + localDate.isLeapYear());
        System.out.println("leap year 2020 : " + LocalDate.ofYearDay(2020, 1).isLeapYear());
        System.out.println("is equal : " + localDate.isEqual(localDate1));
        System.out.println("is before : " + localDate.isBefore(localDate1));
        System.out.println("is after : " + localDate.isAfter(localDate1));

        System.out.println("is supported : " + localDate.isSupported(ChronoUnit.MINUTES));
        System.out.println("is supported : " + localDate.isSupported(ChronoUnit.YEARS));
//        System.out.println("minus chronounit : " + localDate.minus(1, ChronoUnit.MINUTES));

    }

}
