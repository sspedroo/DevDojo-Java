package org.pedro.exceptions.errors.test;

/**
 * Erro não recupera em tempo de execução
 */
public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursive();
    }

    public static void recursive(){
        recursive();
    }
}
