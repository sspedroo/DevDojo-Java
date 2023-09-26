package org.pedro.orientacaoObjetos.polimorfismo.service;

import org.pedro.orientacaoObjetos.polimorfismo.dominio.Computer;
import org.pedro.orientacaoObjetos.polimorfismo.dominio.Product;
import org.pedro.orientacaoObjetos.polimorfismo.dominio.Tomato;

public class TaxesCalculator {

    public static void calculateTaxes(Product product){
        System.out.println("Tax Report");
        double tax = product.calculateTaxes();
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Tax: " + tax);
        if (product instanceof Tomato){
            Tomato tomato = (Tomato) product;
            System.out.println(tomato.getDataDeValidade());
        }
    }
}
