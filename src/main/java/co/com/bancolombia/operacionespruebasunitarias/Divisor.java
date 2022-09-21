package co.com.bancolombia.operacionespruebasunitarias;

/**
 * La clase Divisor permite hacer operaciones de división.
 */
public class Divisor {

    /**
     * Retorna la división del primer parámetro entre el segundo. Los números especificados pueden ser reales.
     * @param a Divisor
     * @param b Dividendo
     * @return El resultado de la división de a entre b
     * @throws InvalidOperationException Si se intenta dividir entre cero
     */
    public double dividir(double a, double b) throws InvalidOperationException{
        if(b == 0) {
            throw new InvalidOperationException("División", "El divisor es cero");
        }
        return a / b;
    }

}
