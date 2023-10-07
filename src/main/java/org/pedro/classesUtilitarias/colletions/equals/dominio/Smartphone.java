package org.pedro.classesUtilitarias.colletions.equals.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Smartphone {
    private String serialNumber;
    private String marca;


    //Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
    //Simétrico: para x e y diferentes de null, se x.equals(y) == true, logo y.equals(x) == true
    //Transitividade: para x, y, z diferentes de null, se x.equals(y) == true, e x.equals(z) == true, logo y.equals(z) == true
    //Consistente: x.equals(x) sempre retorna true se x for diferente de null
    //para x diferente de null, x.equals(null) retrona false


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return Objects.equals(serialNumber, that.serialNumber) && Objects.equals(marca, that.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, marca);
    }
}
