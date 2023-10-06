package org.pedro.classesUtilitarias.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bf = new BufferedWriter(fw);
            bf.write("O DevDojo é um curso ótimo, estou praticando meus conhecimentos nos fundamentos de Java " +
                    "buscando mais qualificação, uma renda melhor e mais qualidade de vida.\n" +
                    "Espero que isso me ajude bastante! ");
            bf.flush();
            bf.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
