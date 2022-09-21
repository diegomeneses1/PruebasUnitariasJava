package co.com.bancolombia.operacionespruebasunitarias;

/**
 * La clase Multiplicador permite hacer operaciones de multiplicación
 */
public class Multiplicador {

    /**
     * Retorna el resultado de multiplicar dos números reales.
     * @param a Primer factor
     * @param b Segundo factor
     * @return El resultado de multiplicar el primer factor por el segundo.
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Retorna un arreglo con el resultado de multiplicar dos arreglos posición por posición
     * @param a Arreglo con factores
     * @param b Arreglo con factores
     * @return Un arreglo con el resultado de multiplicar dos arreglos posición por posición
     * @throws InvalidOperationException Si los arreglos no son de la misma longitud
     */
    public double[] multiplicar(double a[], double b[]) throws InvalidOperationException{
        if (a.length != b.length) {
            throw new InvalidOperationException("Multiplicación de dos arreglos", "Los arreglos no tienen la misma cantidad de elementos");
        }
        double resultado[] = new double[a.length];
        for(int i = 0; i < a.length; i++) {
            resultado[i] = a[i] * b[i];
        }
        return resultado;
    }

}
