/*2.32) Dado un numero entero positivo N se desea saber.
 - Cuantos de sus digitos son pares
 - Cuantos de sus digitos son multiplos de 3
 - La suma de todos sus digitos.

 */
package EJER01;

public class Ej2_32_SaberParesMultiplos3 {

    public static void main(String args[]) {
        int suma = 0, mult3 = 0, par = 0, dig = 0;
        int numero = Validaciones.generaEntero("Ingresar un numero: ");
        while (numero != 0) {
            dig = numero % 10;
            numero /= 10;
            if (dig % 2 == 0) {
                par++;

            }
            if (dig % 3 == 0) {
                mult3++;
            }
            suma += dig;
        }
        System.out.println("La suma total es: " + suma + "\nDigitos Pares son: " + par + "\nLos digitos Multiplos de 3 son: " + mult3);
    }
}
