package org.pedro.exceptions.runtimeException.test;

/**
 * BLOCO FINALLY
 */
public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        openConetion();
    }
    private static String openConetion(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo sistema operacional");
        }
        return null;
    }
}
