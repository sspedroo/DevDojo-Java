package org.pedro.orientacaoObjetos.interfaces.dominio;

public class DatabaseLoader implements  DataLoader, DataRemover{
    //private -> default (modificador de acesso de pacote) -> protected -> public
    //a regra é modificador de acesso nunca pode ser mais restritivo do que está na superclasse/interface
    @Override
    public void load() {
        System.out.println("Loading Database");
    }

    @Override
    public void remove() {
        System.out.println("Removing from Database");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permission in DatabaseLoader");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize no DatabaseLoader");
    }
}
