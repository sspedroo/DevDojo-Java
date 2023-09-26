package org.pedro.orientacaoObjetos.polimorfismo.test;

import org.pedro.orientacaoObjetos.polimorfismo.dominio.Computer;
import org.pedro.orientacaoObjetos.polimorfismo.dominio.Product;
import org.pedro.orientacaoObjetos.polimorfismo.dominio.Tomato;
import org.pedro.orientacaoObjetos.polimorfismo.service.TaxesCalculator;

public class ProductTest3 {
    public static void main(String[] args) {
        Product product = new Computer("MACBOOK", 15000);

        Tomato tomato = new Tomato("Americano", 4);
        tomato.setDataDeValidade("10/12/2023");

        TaxesCalculator.calculateTaxes(tomato);
        System.out.println("-".repeat(20));
        TaxesCalculator.calculateTaxes(product);

    }
}
