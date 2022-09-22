package co.com.bancolombia.operacionespruebasunitarias;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumadorTest {

    @Test
    public void sumarDosNumeros()
    {
        //Arrange
        Sumador sumador = new Sumador();
        double param1 = 9;
        double param2 = 3;
        double resultadoesperado = 12;


        //Act
        double resulado = sumador.sumar(param1, param2);

        // Assert
        assertEquals(resulado, resultadoesperado, 0D);
    }

    @Test
    public void sumarArreglo()
    {
        //Arrange
        Sumador sumador = new Sumador();
        double params[] = {2,5,6,9};
        double resultadoesperado = 22;

        //Act
        double resultado = sumador.sumar(params);
        //Assert
        assertEquals(resultado, resultadoesperado, 0D);
    }

}
