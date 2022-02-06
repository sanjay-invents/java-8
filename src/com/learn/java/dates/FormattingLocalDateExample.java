package com.learn.java.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {

    public static void parseLocalDate() {
        String date = "2018-04-28";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println("local date : " + localDate);
        LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("local date 1 : " + localDate1);

        String date1 = "20180428";
        LocalDate localDate2 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("local date 2 : " + localDate2);

        String date2 = "2018|04|28";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate3 = LocalDate.parse(date2, dateTimeFormatter);
        System.out.println("local date 3 : " + localDate3);

        String date3 = "2018*04*28";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy*MM*dd");
        LocalDate localDate4 = LocalDate.parse(date3, dateTimeFormatter1);
        System.out.println("local date 4 : " + localDate4);
    }

    public static void formatLocalDate() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate = LocalDate.now();
        String formattedDate = localDate.format(dateTimeFormatter);
        System.out.println("formatted date : " + formattedDate);
    }

    public static void main(String[] args) {

        parseLocalDate();
        formatLocalDate();

    }

}
