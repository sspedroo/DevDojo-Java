package org.pedro.classesUtilitarias.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest2 {
    public static void main(String[] args) {
        //  \d = Todos os digitos
        //  \D = Tudo o que não for digito
        //  \S = Espaços em branco \t \n \f \r
        //  \S = Todos os caracters excluindo os brancos
        //  \w = A-Z a-z, digitos, _
        //  \W = Tudo que não for incluso no \W
        //  []
        //  ? Zero ou uma
        //  * Zero ou mais
        //  + uma ou mais
        //  {n.m} de n até m
        //  ()
        //  | ou
        //  $
        String regex = "ab";
        String texto = "abaaba";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posicições encontrada");
        while  (matcher.find()){
            System.out.print(matcher.start() + " " +matcher.group());
        }
    }
}
