/*1.10) Realizar un programa para determinar la sumatoria
 de los N primeros pares
 Ej. Si N=5 => S = 0 + 2 + 4 + 6 + 8
 */
package EJER01;

public class Ej1_10_SumatoriaNumerosPares {

    public static void generaSerie(int valor) {
        int suma = 0;
        for (int i = 0; i < valor; i++) {
            suma += (i * 2);
            if (i + 1 != valor) {
                System.out.print((i * 2) + " + ");
            } else {
                System.out.print((i * 2) + " \n");
            }
        }
        System.out.println("La suma es igual a: " + suma);
    }

    public static void main(String[] args) {
        int valor = Ej1_05_GenerarPrimos.leerNumero("Leer valor de datos a mostrar: ");
        generaSerie(valor);
    }
}
