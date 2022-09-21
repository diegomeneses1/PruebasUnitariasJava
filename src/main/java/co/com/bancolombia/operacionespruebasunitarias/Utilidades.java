package co.com.bancolombia.operacionespruebasunitarias;

/**
 * Clase con verificaciones y utilidades
 */
public class Utilidades {

    /**
     * Revisa si un entero es primo
     * @param n Entero a verificar
     * @return resultado de la verificación
     */
    public boolean esPrimo(int n) {
        if(n <= 1) {
            return false;
        }
        if(n % 2 == 0 && n > 2) {
            return false;
        }
        for(int i = 3; i*i < n; i += 2) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Retorna si un número es negativo
     * @param n número a verificar
     * @return resultado de la verificación
     */
    public boolean esNegativo(double n) {
        return n < 0;
    }

    /**
     * Retorna si un número es positivo
     * @param n número a verificar
     * @return resultado de la verificación
     */
    public boolean esPositivo(double n) {
        return n > 0;
    }

}
