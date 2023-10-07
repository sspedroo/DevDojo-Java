package org.pedro.classesUtilitarias.colletions.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();

        nomes.add("Pedro");
        nomes.add("Minato");
        nomes2.add("Oliveira");
        nomes2.add("Namikaze");

        nomes.addAll(nomes2); //Adiciona a lista "nomes2" inteira na lista nomes

        for (String nome : nomes){
            System.out.println(nome);
        }
    }
}
