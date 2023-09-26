package org.pedro.orientacaoObjetos.polimorfismo.dominio;

public class Computer extends Product{
    public static final double TAX_PERCENTAGE = 0.21;
    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxes() {
        System.out.println("Calculating taxes");
        return this.price * TAX_PERCENTAGE;
    }
}
