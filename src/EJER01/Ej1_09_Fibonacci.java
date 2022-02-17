/*1.9) Realizar un programa que genere K primeros terminos
de la serie de fibonacci.
 Ej 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,....
 */
package EJER01;

import java.io.IOException;
import java.util.Scanner;

public class Ej1_09_Fibonacci {

    public static void main(String[] args) {
        int valor;
        valor = Ej1_05_GenerarPrimos.leerNumero("Leer cantidad de valores a mostrar: ");
        generarFibonacci(valor);
    }

    private static void generarFibonacci(int valor) {
        int valor1 = -1;
        int valor2 = 1;
        int resultado;
        for (int i = 1; i <= valor; i++) {
            resultado = valor1 + valor2;
            valor1 = valor2;
            valor2 = resultado;
            if (i != valor) {
                System.out.print(resultado + ", ");
            } else {
                System.out.println(resultado);
            }
        }
    }
}
