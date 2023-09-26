package org.pedro.orientacaoObjetos.polimorfismo.test;

import org.pedro.orientacaoObjetos.polimorfismo.dominio.Computer;
import org.pedro.orientacaoObjetos.polimorfismo.dominio.Product;
import org.pedro.orientacaoObjetos.polimorfismo.dominio.Tomato;

public class ProductTest2 {
    public static void main(String[] args) {
        Product product = new Computer("MACBOOK", 15000);
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.calculateTaxes());

        System.out.println("-".repeat(20));

        Product product2 = new Tomato("Americano", 4);
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
        System.out.println(product2.calculateTaxes());
    }
}
