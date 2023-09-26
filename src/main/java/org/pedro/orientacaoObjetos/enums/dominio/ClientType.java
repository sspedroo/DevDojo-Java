package org.pedro.orientacaoObjetos.enums.dominio;

/**
 * Enums é como se fosse constantes, estático e final
 */
public enum ClientType {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final int value; //Sempre vir depois das enumerações
    private final String description;
    ClientType(int value, String description){
        this.value = value;
        this.description = description;
    }

    public static ClientType clientTypeByDescription(String description){
        for (ClientType clientType : values()) {
            if(clientType.getDescription().equals(description)){
                return clientType;
            }
        }
        return null;
    }

    public String getDescription() {
        return description;
    }

    public int getValue() {
        return value;
    }
}
