package org.pedro.orientacaoObjetos.polimorfismo.dominio;

public class Tomato extends Product{
    public static final double TAX_PERCENTAGE = 0.13;
    private String dataDeValidade;
    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxes() {
        System.out.println("Calculating taxes");
        return this.price * TAX_PERCENTAGE;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}

