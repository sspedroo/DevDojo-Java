package org.pedro.classesUtilitarias.string.test;

/**
 * String são imutaveis
 */
public class StringTest01 {
    public static void main(String[] args) {
        String name = "Minato";
        String num = "123456";

        System.out.println(name.charAt(0)); //retorna o valor do indice passado, nesse exemplo retorna 'M'

        System.out.println(name.length()); //retorna o tamanho da string, nesse caso retorna '6'

        System.out.println(name.replace("a", "o")); //troca todos os caracteres target pelo replacement, nesse exemplo retorna "Minoto"

        System.out.println(name.toLowerCase());//transforma tudo em minusculo, nesse exemplo retorna "minato"

        System.out.println(name.toUpperCase());//transforma tudo em maiusculo, nesse exemplo retorna "MINATO"

        System.out.println(num.substring(1,5)); //retorna uma string que começa de onde passa o indice e vai ate o indice que vc passou menos 1. Nesse caso retorna "2345"

        System.out.println(name.trim()); //retorna os valores em brancos do começo e do fim da string

        System.out.println(name + num); //concatenando Strings, resultado "Minato123456"

        System.out.println(name.startsWith("Min")); // Verificando se uma string começa com um prefixo, nesse caso retorna true;

        System.out.println(name.endsWith("456")); // Verificando se uma string termina com um sufixo, nesse caso retorna false;

        System.out.println(name.contains("ato")); // Verificando se uma string contém o parametro passado, nesse caso retorna true;

        System.out.println(name.split("a")); //Dividindo uma string em partes usando um delimitador, nesse caso retorna ["Min", "to"]

        System.out.println(name.toCharArray()); //Transformando uma string em um array de caracteres, Resultado: ['M', 'i', 'n', 'a', 't', 'o']

        System.out.println(name.equals("Minato")); // Verificando se uma string é igual a outra (comparação de conteúdo), aqui retorna true

        System.out.println(name.equalsIgnoreCase("MinATo")); // Verificando se uma string é igual a outra, ignorando diferenças de maiúsculas e minúsculas

        System.out.println(Integer.parseInt(num));  //Convertendo uma string em um número inteiro (parse)

        System.out.println(name.indexOf("at")); // Retorna o índice da primeira ocorrência de "at"

        System.out.println(name.lastIndexOf("at")); // Retorna o índice da última ocorrência de "at"

        System.out.println(num.matches("[0-9]+"));// Verificar se a string contém somente dígitos, resultado: true (todos os caracteres são dígitos)

        System.out.println(name.indent(3)); //Indentação de uma string com espaços à esquerda, resultado: "   Minato"

        System.out.println(name.strip()); //se você precisa remover todos os tipos de caracteres de espaço em branco (incluindo espaços, tabulações, quebras de linha, etc.), use strip().

    }
}
