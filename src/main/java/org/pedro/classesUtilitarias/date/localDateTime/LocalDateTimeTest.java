package org.pedro.classesUtilitarias.date.localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDate dateParse = LocalDate.parse("2022-08-06");
        LocalTime timeParse = LocalTime.parse("09:45:21");

        LocalDate date = LocalDate.of(2024, Month.AUGUST, 6);
        LocalTime time = LocalTime.of(9, 45, 21);

        System.out.println(dateParse);
        System.out.println(timeParse);

        LocalDateTime lt = dateParse.atTime(timeParse);
        LocalDateTime lt2 = time.atDate(dateParse);
        System.out.println(lt);
        System.out.println(lt2);


    }
}
