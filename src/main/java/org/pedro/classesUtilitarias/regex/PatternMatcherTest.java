package org.pedro.classesUtilitarias.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Estudar mais sobre em <a href="https://regexr.com">Regexr</a>
 */
public class PatternMatcherTest {
    public static void main(String[] args) {
        //
        String regex = "ab";
        String texto = "abaaba";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posicições encontrada");
        while  (matcher.find()){
            System.out.print(matcher.start() + " ");
        }
    }
}
