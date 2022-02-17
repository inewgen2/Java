/*2.35) Dado un numero entero positivo N, ordenar sus digitos en forma ascendente:
 Ej. Si N=129756 => N=125679
 */
package EJER01;

import java.util.Scanner;

public class Ej2_35_OrdenarSusDigitosA {

    public static int ordenaDigitosAscendentemente(int n) {
        int sol = 0, aux, d1;
        for (int i = 0; i <= 9; i++) {
            aux = n;
            while (aux != 0) {
                d1 = aux % 10;
                aux = aux / 10;
                if (i == d1) {
                    sol = sol * 10 + d1;
                }
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        int n = Validaciones.generaPositivo("Ingre un numero: ");
        System.out.println("El numero N: " + n + " ordenado es: " + ordenaDigitosAscendentemente(n));
    }
}
