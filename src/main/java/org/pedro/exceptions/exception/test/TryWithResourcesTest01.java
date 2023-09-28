package org.pedro.exceptions.exception.test;

import org.pedro.exceptions.exception.dominio.Leitor1;
import org.pedro.exceptions.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        read();
    }

    public static void read(){
        try(Leitor1 leitor1 = new Leitor1(); // FECHA NA HORA INVERSA, PRIMEIRO OS DEBAIXO ATE CHEGAR NO PRIMEIRO
            Leitor2 leitor2 = new Leitor2()){ //SOMENTE QUEM IMPLEMENTA O CLOSEABLE E O AUTO CLOSEABLE

        } catch (IOException e){

        }
    }

    public static void read2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
