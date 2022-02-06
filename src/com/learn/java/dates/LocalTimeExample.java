package com.learn.java.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println("local time : " + localTime);

        LocalTime localTime1 = LocalTime.of(23, 33);
        System.out.println("local time 1: " + localTime1);

        LocalTime localTime2 = LocalTime.of(23, 33, 33);
        System.out.println("local time 2: " + localTime2);

        LocalTime localTime3 = LocalTime.of(23, 33, 33, 980123456);
        System.out.println("local time 3: " + localTime3);

        System.out.println("get hour : " + localTime.getHour());
        System.out.println("get minute : " + localTime.getMinute());
        System.out.println("chrono field CLOCK_HOUR_OF_DAY : " + localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println("to second of day : " + localTime.toSecondOfDay());

        System.out.println("minus hours : " + localTime.minusHours(2));
        System.out.println("minus hours chronounit : " + localTime.minus(2, ChronoUnit.HOURS));
        System.out.println("midnight : " + localTime.with(LocalTime.MIDNIGHT));
        System.out.println("HOUR_OF_DAY : " + localTime.with(ChronoField.HOUR_OF_DAY, 22));
        System.out.println("plusMinutes : " + localTime.plusMinutes(30));
        System.out.println("with hour : " + localTime.withHour(10));

    }

}
