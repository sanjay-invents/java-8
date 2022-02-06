package com.learn.java.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("local date : " + localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("local time : " + localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("local date time : " + localDateTime);

    }

}
