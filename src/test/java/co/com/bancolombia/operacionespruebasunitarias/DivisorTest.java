package co.com.bancolombia.operacionespruebasunitarias;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.Extensions;

public class DivisorTest {

    @Test
    public void excepcionAlDividirEntreCero(){
        //  Arrange
        Divisor divisor = new Divisor();
        double param1 = 2.5;
        double param2 = 0;
        String mensajeEsperado = "El divisor es cero";

        //  Act
        InvalidOperationException ex = Assertions.assertThrows(InvalidOperationException.class, () ->{
            divisor.dividir(param1, param2);
        });

        //Assert
        Assertions.assertEquals(mensajeEsperado, ex.getMessage());

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
        Assertions.assertEquals(resultado, resultadoEsperado, 0D);
    }

}
