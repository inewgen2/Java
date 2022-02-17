/*2.51) Hallar la suma de los N primeros terminos de la siguiente serie:
 Si 1 + 1 + 3 + 0 + 5 + -1 + 7 + -2 + 9 -3, ...
 */
package EJER01;

public class Ej2_51_SumaTerminos {

    private static void generaSucesion(int val) {
        int a = 1, b = 1, aux = 0, i = 0, s = 0;
        while (i <= val) {
            i++;
            if (i % 2 != 0) {
                aux = a;
                a = a + 2;
                //System.out.print(c + "! + ");
            } else {
                aux = b;
                b = b - 1;
                //System.out.print(c + " + ");
            }

            s = s + aux;
            if (i == 1) {
                System.out.print(aux);
            } else if (aux >= 0) {
                System.out.print(" +" + aux);
            } else {
                System.out.print(" " + aux);
            }
        }
        System.out.println("\nLa suma es: " + s);
    }

    public static void main(String args[]) {
        int valorN = Validaciones.generaPositivo("Intrudusca la cantidad de numeros: ");
        generaSucesion(valorN);
    }
}
