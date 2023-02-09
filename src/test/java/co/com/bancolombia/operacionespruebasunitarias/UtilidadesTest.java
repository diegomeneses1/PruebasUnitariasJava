package co.com.bancolombia.operacionespruebasunitarias;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UtilidadesTest {

    @Test
    public void esPrimoFalseNegativo() {
        //  Arrange
        Utilidades utilidades = new Utilidades();
        int param = -5;

        //  Act
        boolean resultado = utilidades.esPrimo(param);

        //  Assert
        Assertions.assertFalse(resultado);
    }

    @Test
    public void esPrimoTrueDos() {
        //  Arrange
        Utilidades utilidades = new Utilidades();
        int param = 2;

        //  Act
        boolean resultado = utilidades.esPrimo(param);

        //  Assert
        Assertions.assertTrue(resultado);
    }

    @Test
    public void esPrimoFalsePar() {
        //  Arrange
        Utilidades utilidades = new Utilidades();
        int param = 58512;

        //  Act
        boolean resultado = utilidades.esPrimo(param);

        //  Assert
        Assertions.assertFalse(resultado);
    }

    @Test
    public void esPrimoTrueNumeroGrande() {
        //  Arrange
        Utilidades utilidades = new Utilidades();
        int param = 1500450271;

        //  Act
        boolean resultado = utilidades.esPrimo(param);

        //  Assert
        Assertions.assertTrue(resultado);
    }

    @Test
    public void esPrimoFalseImparGrande() {
        //  Arrange
        Utilidades utilidades = new Utilidades();
        int param = 1500450275;

        //  Act
        boolean resultado = utilidades.esPrimo(param);

        //  Assert
        Assertions.assertFalse(resultado);
    }

    @Test
    public void esNegativoTrueNegativo() {
        //  Arrange
        Utilidades utilidades = new Utilidades();
        double param = -0.1;

        //  Act
        boolean resultado = utilidades.esNegativo(param);

        //  Assert
        Assertions.assertTrue(resultado);
    }

    @Test
    public void esNegativoFalseCero() {
        //  Arrange
        Utilidades utilidades = new Utilidades();
        double param = 0;

        //  Act
        boolean resultado = utilidades.esNegativo(param);

        //  Assert
        Assertions.assertFalse(resultado);
    }

    @Test
    public void esNegativoFalsePositivo() {
        //  Arrange
        Utilidades utilidades = new Utilidades();
        double param = 0.1;

        //  Act
        boolean resultado = utilidades.esNegativo(param);

        //  Assert
        Assertions.assertFalse(resultado);
    }

    @Test
    public void esPositivoTruePositivo() {
        //  Arrange
        Utilidades utilidades = new Utilidades();
        double param = 0.1;

        //  Act
        boolean resultado = utilidades.esPositivo(param);

        //  Assert
        Assertions.assertTrue(resultado);
    }

    @Test
    public void esPositivoFalseCero() {
        //  Arrange
        Utilidades utilidades = new Utilidades();
        double param = 0;

        //  Act
        boolean resultado = utilidades.esPositivo(param);

        //  Assert
        Assertions.assertFalse(resultado);
    }

    @Test
    public void esPositivoFalseNegativo() {
        //  Arrange
        Utilidades utilidades = new Utilidades();
        double param = -0.1;

        //  Act
        boolean resultado = utilidades.esPositivo(param);

        //  Assert
        Assertions.assertFalse(resultado);
    }
}
