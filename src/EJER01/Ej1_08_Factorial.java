/*1.8) hallar el factorial de un numero
 */
package EJER01;

public class Ej1_08_Factorial {

    public static int factorial(int num) {
        int aux=1;
        for (int i = 1; i <= num; i++) {
            aux = aux * i;
        }
        return aux;
    }

    public static void main(String[] args) {
        int valor;
        valor = Ej1_05_GenerarPrimos.leerNumero("Introdusca un valor: ");
        System.out.println("El fatorial de "+valor+" es igual a: "+factorial(valor));
    }

}
