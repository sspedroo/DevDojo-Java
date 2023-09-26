package org.pedro.orientacaoObjetos.enums.dominio;

/**
 * É possivel criar enum dentro de uma outra classe também
 */
public class Cliente {

    private String name;
    private ClientType clientType;
    private PaymentType paymentType;

    public Cliente(String name, ClientType clientType, PaymentType paymentType) {
        this.name = name;
        this.clientType = clientType;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", clientType=" + clientType +
                ", paymentType=" + paymentType +
                '}';
    }
}
