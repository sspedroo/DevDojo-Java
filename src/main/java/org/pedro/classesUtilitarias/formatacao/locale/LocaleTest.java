package org.pedro.classesUtilitarias.formatacao.locale;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        //segue padrão ISO
        Locale locale = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");

        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJp = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");


        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, locale);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJp);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("Formatação Italia: " + df1.format(calendar.getTime()));
        System.out.println("Formatação Suiça: " + df2.format(calendar.getTime()));
        System.out.println("Formatação India: " + df3.format(calendar.getTime()));
        System.out.println("Formatação Japão: " + df4.format(calendar.getTime()));
        System.out.println("Formatação Holanda: " + df5.format(calendar.getTime()));

        System.out.println(locale.getDisplayCountry());
        System.out.println(localeCH.getDisplayCountry());
    }
}
