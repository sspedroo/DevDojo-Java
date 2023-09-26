package org.pedro.orientacaoObjetos.polimorfismo.service;

import org.pedro.orientacaoObjetos.polimorfismo.repositorio.Repositorio;

/**
 * PROGRMAÇÃO ORIENTADA A OBJETOS
 */
public class DatabaseRepository implements Repositorio {
    @Override
    public void save() {
        System.out.println("Salvando no banco de dados");
    }
}
