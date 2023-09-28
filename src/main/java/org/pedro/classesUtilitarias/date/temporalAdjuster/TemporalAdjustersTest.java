package org.pedro.classesUtilitarias.date.temporalAdjuster;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.withDayOfMonth(20);
        now = now.withMonth(1);
        now = now.with(ChronoField.DAY_OF_MONTH, 17);

        System.out.println(now);

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
