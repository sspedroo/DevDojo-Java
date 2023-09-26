package org.pedro.exceptions.runtimeException.test;

/**
 * Lançando UNCHECKED
 */
public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divide(1, 0);
    }

    private static int divide(int a, int b){
        if(b == 0){
            throw new RuntimeException("Invalid argument, cannot be 0");
        }
            return a/b;
    }
}
