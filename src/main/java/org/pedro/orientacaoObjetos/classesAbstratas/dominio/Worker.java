package org.pedro.orientacaoObjetos.classesAbstratas.dominio;

/**
 * Métodos abstratos só existem classes abstratas, porém classes abstratas podem ter métodos concretos
 */
public abstract class Worker extends Person{
    protected String name;
    protected double salary;

    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calculateBonus();
    }

    @Override
    public void imprime() {
        System.out.println("imprimindo....");
    }

    public abstract void calculateBonus();
}
