package com.learn.java.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class ComparingDatesPeriodExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2018, 1, 1);
        LocalDate localDate1 = LocalDate.of(2018, 12, 31);

        Period period = localDate.until(localDate1);
        System.out.println("Get days : " + period.getDays());
        System.out.println("Get months : " + period.getMonths());
        System.out.println("Get years : " + period.getYears());

        Period period1 = Period.ofDays(10);
        System.out.println("of days : " + period1.getDays());

        Period period2 = Period.ofYears(10);
        System.out.println("of years : " + period2.getYears());
        System.out.println("to total months : " + period2.toTotalMonths());

        Period period3 = Period.between(localDate, localDate1);
        System.out.println("Period : " + period3.getDays() + " : " + period3.getMonths() + " : " + period3.getYears());

//        Period.between(LocalTime.now(), LocalTime.now().plusHours(10));

    }

}
