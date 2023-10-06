package org.pedro.classesUtilitarias.serialization;

import org.pedro.classesUtilitarias.serialization.dominio.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setId(1L);
        aluno.setName("Pedro");
        aluno.setPassword("123456");

        //serializar(aluno);
        deserializar();

    }


    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))){
            objectOutputStream.writeObject(aluno);
        } catch (IOException e){
            throw new RuntimeException();
        }
    }

    private static void deserializar(){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) objectInputStream.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e){
            throw new RuntimeException();
        }
    }
}
