package org.pedro.orientacaoObjetos.interfaces.test;

import org.pedro.orientacaoObjetos.interfaces.dominio.DataLoader;
import org.pedro.orientacaoObjetos.interfaces.dominio.DatabaseLoader;
import org.pedro.orientacaoObjetos.interfaces.dominio.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        databaseLoader.retrieveMaxDataSize();
    }
}
