package org.pedro.classesUtilitarias.colletions.list;

import org.pedro.classesUtilitarias.colletions.equals.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("22222", "Pixel");
        Smartphone s3 = new Smartphone("33333", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        //smartphones.clear(); //limpa mas não perde a variavel de referencia

        for (Smartphone cel : smartphones){
            System.out.println(cel);
        }

        Smartphone s4 = new Smartphone("22222", "Pixel");
        System.out.println(smartphones.contains(s4));
        System.out.println(smartphones.indexOf(s4));
    }
}
