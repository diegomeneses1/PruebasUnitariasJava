package co.com.bancolombia.operacionespruebasunitarias;

/**
 * La clase Sumador permite hacer operaciones de suma.
 */
public class Sumador {

    /**
     * Retorna la suma de los parámetros. Los números especificados pueden ser reales.
     * @param a Sumando
     * @param b Sumando
     * @return El resultado de la suma de a y b
     */
    public double sumar(double a, double b) {
        return a + b;
    }

    /**
     * Retorna la suma de los números del arreglo especificado. Los números especificados pueden ser reales.
     * @param a Arreglo a sumar
     * @return El resultado de la suma de todos los elementos de a.
     */
    public double sumar(double a[]) {
        double resultado = 0;
        for(double x : a) {
            resultado += x;
        }
        return resultado;
    }

}
