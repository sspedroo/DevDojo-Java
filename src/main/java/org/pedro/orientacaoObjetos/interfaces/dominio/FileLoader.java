package org.pedro.orientacaoObjetos.interfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Loading archive data");
    }

    @Override
    public void remove() {
        System.out.println("Removing Data from file");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permission in FileLoader");
    }
}
