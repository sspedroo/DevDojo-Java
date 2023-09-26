package org.pedro.orientacaoObjetos.interfaces.dominio;

/**
 * <li>Todos os métodos por padrão são publicos e abstratos.</li>
 * <li>Age como um contrato</li>
 * <li>Interfaces podem ter atributos, por padrão todos são constantes</li>
 */
public interface DataLoader {
    int MAX_DATA_SIZE = 10;
    void load();
    default void checkPermission(){
        System.out.println("Checking permission");
    }

    static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
