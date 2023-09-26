package org.pedro.exceptions.runtimeException.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

/**
 * CAPTURANDO MULTIPLAS EXCEPTIONS
 * Exceçoes genericas sempre tem que vir no final
 */
public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        try{
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e){      //Não pode estar na mesma linha de herança (Estudar mais sobre isso posteriormente)
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
