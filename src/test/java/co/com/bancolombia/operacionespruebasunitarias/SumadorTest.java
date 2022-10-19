package co.com.bancolombia.operacionespruebasunitarias;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumadorTest {

    @Test
    public void sumarDosNumeros() {
        //  Arrange
        Sumador sumador = new Sumador();
        double param1 = 4;
        double param2 = 2.5;
        double resultadoEsperado = 6.5;

        //  Act
        double resultado = sumador.sumar(param1, param2);

        //  Assert
        assertEquals(resultado, resultadoEsperado, 0D);

    }

    @Test
    public void sumarArreglo() {
        //  Arrange
        Sumador sumador = new Sumador();
        double param[] = {1.2, 3, 10.1};
        double resultadoEsperado = 14.3;

        //  Act
        double resultado = sumador.sumar(param);

        //  Assert
        assertEquals(resultado, resultadoEsperado, 0D);
    }

}
