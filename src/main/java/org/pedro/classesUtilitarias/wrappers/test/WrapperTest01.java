package org.pedro.classesUtilitarias.wrappers.test;

/**
 * Wrappers oferece alguns metodos pois é um objeto.
 * Utilizar wrappers somente em situações que for necessario
 * Boas praticas dizem que tipos primitivos possuem preferência
 */
public class WrapperTest01 {
    public static void main(String[] args) {

        byte byteP = 1;
        short shortp = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        Integer intWr = 2; //autoboxing (boxing)

        int i = intW; //unboxing
    }
}
