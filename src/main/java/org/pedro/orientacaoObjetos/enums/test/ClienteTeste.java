package org.pedro.orientacaoObjetos.enums.test;

import org.pedro.orientacaoObjetos.enums.dominio.ClientType;
import org.pedro.orientacaoObjetos.enums.dominio.Cliente;
import org.pedro.orientacaoObjetos.enums.dominio.PaymentType;

/**
 * > Exemplos com Enum criado dentro da classe: <br>
 * <ul>
 *     <li>Cliente cliente1 = new Cliente("Minato", ClientType.PESSOA_FISICA, Cliente.PaymentType.CREDITO)</li>
 * </ul>
 *
 *
 */
public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Minato", ClientType.PESSOA_FISICA, PaymentType.CREDITO);
        Cliente cliente2 = new Cliente("Akatsuki", ClientType.PESSOA_JURIDICA, PaymentType.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(PaymentType.DEBITO.calculateDiscount(100));
        System.out.println(PaymentType.CREDITO.calculateDiscount(100));

        ClientType clientType2 = ClientType.clientTypeByDescription("Pessoa Física");
        System.out.println(clientType2);

    }
}
