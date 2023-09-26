package org.pedro.orientacaoObjetos.enums.dominio;

public enum PaymentType{
        DEBITO {
            @Override
            public double calculateDiscount(double value) {
                return value  * 0.10;
            }
        },
        CREDITO {
            @Override
            public double calculateDiscount(double value) {
                return value * 0.05;
            }
        };

    public abstract double calculateDiscount(double value); //Metodo abstrato, serve somente de modelo para variadas implementações(ser sobrescrito)
}
