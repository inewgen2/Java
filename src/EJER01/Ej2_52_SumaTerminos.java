/*2.52) Hallar la suma de los N primeros terminos de la siguiente serie:
 Si 1 + 3 + 2 + 4 + 6 + 5 + 7 + 9 + 8 +10, ...
 */
package EJER01;

public class Ej2_52_SumaTerminos {

    private static void generaSucesion(int val) {
        int ini = 0, cont = 1, sol, i, s = 0;
        for (i = 1; i <= val; i++) {
            sol = ini + cont;
            s = s + sol;
            if (i == 1) {
                System.out.print(sol);
            } else if (i < val) {
                System.out.print(" + " + sol);
            } else {
                System.out.print(" + " + sol + " = "+s);
            }
            ini++;
            cont++;
            if (cont == 3) {
                cont = 0;
            }
        }
        System.out.println("\nLa suma es: " + s);
    }

    public static void main(String args[]) {
        int valorN = Validaciones.generaPositivo("Intrudusca la cantidad de numeros: ");
        generaSucesion(valorN);
    }
}
