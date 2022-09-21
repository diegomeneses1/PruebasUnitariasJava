package co.com.bancolombia.operacionespruebasunitarias;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MultiplicadorTest {

    @Test
    public void multiplicarDosNumeros() {
        //  Arrange
        Multiplicador multiplicador = new Multiplicador();
        double param1 = 4;
        double param2 = 2.5;
        double resultadoEsperado = 10;

        //  Act
        double resultado = multiplicador.multiplicar(param1, param2);

        //  Assert
        assertEquals(resultado, resultadoEsperado, 0D);
    }

    @Test
    public void multiplicarDosArreglos() throws InvalidOperationException {
        //  Arrange
        Multiplicador multiplicador = new Multiplicador();
        double param1[] = {1.2, 3, 10.1};
        double param2[] = {2, 3, 4};
        double resultadoEsperado[] = {2.4, 9, 40.4};

        //  Act
        double resultado[] = multiplicador.multiplicar(param1, param2);

        //  Assert
        assertTrue(Arrays.equals(resultado, resultadoEsperado));
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void excepcionArreglosDiferenteLongitud() throws InvalidOperationException{
        //  Arrange
        Multiplicador multiplicador = new Multiplicador();
        double param1[] = {1.2, 3, 10.1};
        double param2[] = {2, 3, 4, 5};
        String mensajeEsperado = "Los arreglos no tienen la misma cantidad de elementos";

        //  Assert
        thrown.expect(InvalidOperationException.class);
        thrown.expectMessage(mensajeEsperado);

        //  Act
        multiplicador.multiplicar(param1, param2);
    }

    @Test
    public void excepcionArreglosDiferenteLongitudTryCatch() {
        Multiplicador multiplicador = new Multiplicador();
        double param1[] = {1.2, 3, 10.1};
        double param2[] = {2, 3, 4, 5};
        String mensajeEsperado = "Los arreglos no tienen la misma cantidad de elementos";

        try {
            multiplicador.multiplicar(param1, param2);
            fail("Excepción InvalidOperationException no lanzada");
        } catch (InvalidOperationException e) {
            assertEquals(mensajeEsperado, e.getMessage());
        }
    }
}
