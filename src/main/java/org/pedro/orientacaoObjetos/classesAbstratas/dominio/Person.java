package org.pedro.orientacaoObjetos.classesAbstratas.dominio;

/**
 * Classe abstrata não é obrigatorio implementar metodos de outra classe abstrata, somente as classes concretas<br>
 * Porém, se a classe abstrata implementar o método, as classes concretas(filhas) não necessita a implementação
 */
public abstract class Person {
    public abstract void imprime();
}
