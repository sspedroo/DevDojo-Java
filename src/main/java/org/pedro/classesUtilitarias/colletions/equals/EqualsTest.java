package org.pedro.classesUtilitarias.colletions.equals;

import org.pedro.classesUtilitarias.colletions.equals.dominio.Smartphone;

public class EqualsTest {
    public static void main(String[] args) {
        String nome = "Pedro";
        String nome2 = "Pedro";


        Smartphone s1  = new Smartphone("1ABC1", "Iphone");
        Smartphone s2  = new Smartphone("1ABC1", "Iphone");
        //Assim da falso
        //Com o equals da verdadeiro

        s2 = s1;
        //Assim da verdadeiro

        System.out.println(s1.equals(s2));
    }
}
