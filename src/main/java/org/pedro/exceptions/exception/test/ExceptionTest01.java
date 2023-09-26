package org.pedro.exceptions.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        createNewFile();
    }

    private static void createNewFile(){
        File file = new File("arquivo\\teste.txt");
        try{
            boolean isCreated = file.createNewFile();
            System.out.println("File created " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
