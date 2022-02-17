/*2.34) Introducir un numero entero positivo D con sus digitos distintos entre si.
 Si D=5684 => es valido
 Si D=564534 => no es valido
 */
package EJER01;

public class Ej2_34_IntroducirNumeroConDigitosDiferentes {

    public static boolean sonDigitosDiferentes(int numero) {
        int aux, aux2, sw, dig, dig2;
        aux2 = numero;
        sw = 1;
        while ((aux2 != 0) && (sw == 1)) {
            dig = aux2 % 10;
            aux2 /= 10;
            aux = aux2;
            while ((aux != 0) && (sw == 1)) {
                dig2 = aux % 10;
                aux /= 10;
                if (dig == dig2) {
                    sw = 0;
                }
            }
        }
        return sw == 1;
    }

    public static void main(String args[]) {
        int numero = Validaciones.generaEntero("Introducir un numero: ");
        if (sonDigitosDiferentes(numero)) {
            System.out.println("El numero es valido");
        } else {
            System.out.println("El numero no es valido");
        }
    }
}
