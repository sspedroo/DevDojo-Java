package org.pedro.orientacaoObjetos.polimorfismo.test;

import org.pedro.orientacaoObjetos.polimorfismo.dominio.Computer;
import org.pedro.orientacaoObjetos.polimorfismo.dominio.Tomato;
import org.pedro.orientacaoObjetos.polimorfismo.service.TaxesCalculator;

public class ProductTest {
    public static void main(String[] args) {
        Computer computer = new Computer("MACBOOK", 11000);
        Tomato tomato = new Tomato("Tomate", 2.00);


        TaxesCalculator.calculateTaxes(computer);
        System.out.println("-".repeat(20));
        TaxesCalculator.calculateTaxes(tomato);

    }
}
