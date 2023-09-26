package org.pedro.orientacaoObjetos.polimorfismo.test;

import org.pedro.orientacaoObjetos.polimorfismo.repositorio.Repositorio;
import org.pedro.orientacaoObjetos.polimorfismo.service.DatabaseRepository;

/**
 * PROGRMAÇÃO ORIENTADA A OBJETOS
 */
public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new DatabaseRepository();
        repositorio.save();
    }
}
