package co.com.bancolombia.operacionespruebasunitarias;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class DivisorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void excepcionAlDividirEntreCero() throws InvalidOperationException{
        //  Arrange
        Divisor divisor = new Divisor();
        double param1 = 2.5;
        double param2 = 0;
        String mensajeEsperado = "El divisor es cero";

        //  Assert
        thrown.expect(InvalidOperationException.class);
        thrown.expectMessage(mensajeEsperado);

        //  Act
        divisor.dividir(param1, param2);
    }

    @Test
    public void dividirDosNumeros() throws InvalidOperationException {
        //  Arrange
        Divisor divisor = new Divisor();
        double param1 = 10;
        double param2 = 2.5;
        double resultadoEsperado = 4;

        //  Act
        double resultado = divisor.dividir(param1, param2);

        //  Assert
        assertEquals(resultado, resultadoEsperado, 0D);
    }

}
