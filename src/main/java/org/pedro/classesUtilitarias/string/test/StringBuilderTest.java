package org.pedro.classesUtilitarias.string.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String nome = "Minato Namikaze";

        StringBuilder sb = new StringBuilder("Minato Namikaze");
        sb.append(" de Konoha");
        System.out.println(sb);
    }
}
