package org.pedro.classesUtilitarias.date.dateTimeFormatter;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String f1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String f2 = date.format(DateTimeFormatter.ISO_DATE);
        String f3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        LocalDate parse1 = LocalDate.parse("20210219", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2021-02-19+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2021-02-19", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String f4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(f4);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("19/02/2023", formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter formatterJP = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.JAPAN);
        String formatJP = LocalDate.now().format(formatterJP);
        System.out.println(formatJP);


    }
}
