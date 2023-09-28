package org.pedro.classesUtilitarias.formatacao.locale;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        String pattern2 = "'Amsterdam' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);
        System.out.println(sdf.format(new Date()));
        System.out.println(sdf2.format(new Date()));

        try {
            System.out.println(sdf2.parse("Amsterdam 28 de setembro de 2023"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
