/*2.40) Dado un numero r entero positivo generar y desplegar el numero capicuo que le corresponde de la siguiente manera.
 Ej. Si R=5621 => 5621265
 */
package EJER01;

public class Ej2_40_GenerarCapicuo {

    private static void generaCapicuo(int numero) {
        int aux = numero, nuevoDig = 0, dig, dig2, c = 1;
        dig = numero % 10;
        numero /= 10;
        while (numero != 0) {
            dig2 = numero % 10;
            numero /= 10;
            nuevoDig = dig2 + nuevoDig * 10;
            c *= 10;
        }
        aux = aux * c;
        nuevoDig = nuevoDig + aux;
        System.out.println("El numero Capicuo es: " + nuevoDig);
    }

    public static void main(String args[]) {
        int valor = Validaciones.generaPositivo("Ingrese un numero: ", 10, 10000000);
        generaCapicuo(valor);
    }
}
