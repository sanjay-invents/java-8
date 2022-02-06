package com.learn.java.dates;

import java.time.*;

public class ZonedDateTimeExample {

    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Zoned date time : " + zonedDateTime);

        System.out.println("zoned off set : " + zonedDateTime.getOffset());

        System.out.println("Zone id : " + zonedDateTime.getZone());

//        System.out.println("Available Zones : " + ZoneId.getAvailableZoneIds());

//        ZoneId.getAvailableZoneIds()
//                .forEach(System.out::println);

        System.out.println("No of zones : " + ZoneId.getAvailableZoneIds().size());

        System.out.println("Chicago CST : " + ZonedDateTime.now(ZoneId.of("America/Chicago")));
        System.out.println("Detroit EST : " + ZonedDateTime.now(ZoneId.of("America/Detroit")));
        System.out.println("LA PST      : " + ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
        System.out.println("Denver MST  : " + ZonedDateTime.now(ZoneId.of("America/Denver")));

        System.out.println("zoned date time using clock : " + ZonedDateTime.now(Clock.system(ZoneId.of("America/Denver"))));

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/Detroit"));
        System.out.println("Detroit : " + localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.now(Clock.system(ZoneId.of("America/Detroit")));
        System.out.println("Detroit : " + localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println("of instant : " + localDateTime2);

        LocalDateTime localDateTime3 = LocalDateTime.now();
        System.out.println("local date time 3 : " + localDateTime3);

        ZonedDateTime zonedDateTime1 = localDateTime3.atZone(ZoneId.of("America/Chicago"));
        System.out.println("zone date time 1 : " + zonedDateTime1);

        ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.of("America/Detroit"));
        System.out.println("zone date time 2 : " + zonedDateTime2);

        OffsetDateTime offsetDateTime = localDateTime3.atOffset(ZoneOffset.ofHours(-6));
        System.out.println("off set date time : " + offsetDateTime);
    }

}
