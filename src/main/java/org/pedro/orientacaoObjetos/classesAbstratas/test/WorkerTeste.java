package org.pedro.orientacaoObjetos.classesAbstratas.test;

import org.pedro.orientacaoObjetos.classesAbstratas.dominio.Developer;
import org.pedro.orientacaoObjetos.classesAbstratas.dominio.Manager;

public class WorkerTeste {
    public static void main(String[] args) {

        Manager manager = new Manager("Luffy", 4000D);
        Developer developer = new Developer("Myself", 150000D);

        System.out.println(manager);
        System.out.println(developer);
    }




}
