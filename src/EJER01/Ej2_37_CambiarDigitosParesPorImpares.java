/*2.37)  Dado un numero entero positivo N de mas de 4 digitos se pide intercambiar los digitos de las posiciones pares con los digitos de las posiciones impares (de derecha a izquierda), 
 Ej Si N=4565887 =>  

 */
package EJER01;

public class Ej2_37_CambiarDigitosParesPorImpares {

    public static void main(String args[]) {
        int valorN = Validaciones.generaEntero("Introudcir un numero: ", 1000, 10000000);
        int c = 1, aux = 0, dig1 = 0, dig2 = 0;
        while (valorN != 0) {
            dig1 = valorN % 10;
            valorN /= 10;
            if (valorN != 0) {
                dig2 = valorN % 10;
            }
            if (valorN == 0) {
                aux = c * dig1 + aux;
            }
            if (valorN != 0) {
                aux = c * dig2 + aux;
                c *= 10;
            }
            if (valorN != 0) {
                aux = c * dig1 + aux;
                c *= 10;
                valorN /= 10;
            }
        }
        System.out.println("El resultado es: " + aux);
    }
}
