package co.com.bancolombia.operacionespruebasunitarias;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args)
    {

        try {

            Sumador sumador = new Sumador();
            Multiplicador multiplicador = new Multiplicador();
            Divisor divisor = new Divisor();

            int digito1;
            int digito2;

            Scanner leer = new Scanner(System.in);

            System.out.println("Ingrese Numero 1: ");
            digito1 = leer.nextInt();
            System.out.println("Ingrese Numero 2: ");
            digito2 = leer.nextInt();

            System.out.println("El valor de la suma es: " + sumador.sumar(digito1, digito2));
            System.out.println("El valor de la multiplicacion es: " + multiplicador.multiplicar(digito1, digito2));
            System.out.println("El valor de la division es: " + divisor.dividir(digito1, digito2));

        } catch (InvalidOperationException e) {
            e.printStackTrace();
        }
    }
}
