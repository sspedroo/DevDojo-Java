package org.pedro.exceptions.runtimeException.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        //Checked and Unchecked
        //Checked são aquelas que o código nem compila, obrigatório tratar elas
        //Unchecked são aquelas que você desenvolvedor errou

        Object object = null;
        System.out.println(object.toString());

        int[] nums = new int[]{1,2};
        System.out.println(nums[3]);

    }
}
