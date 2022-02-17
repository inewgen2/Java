/*2.42) Generar la siguiente sucesion para N terminos.
 0, 1, 1, 2, 4, 5, 7, 13, 24, ...
 */
package EJER01;

public class Ej2_42_GenerarSucesion {

    private static void generaSucesion(int val) {
        int a = 0, b = 1, c = 1, aux;
        for (int i = 1; i <= val; i++) {
            if (i == 1) {
                System.out.print(a + ", ");
            }
            if (i == 2) {
                System.out.print(b + ", ");
            }
            if (i == 3) {
                System.out.print(c + ", ");
            }
            if (i > 3) {
                aux = a + b + c;
                a = b;
                b = c;
                c = aux;
                if (i != val) {
                    System.out.print(aux + ", ");
                } else {
                    System.out.print(aux + " \n");
                }
            }
        }
    }

    public static void main(String args[]) {
        int valorN = Validaciones.generaPositivo("Intrudusca la cantidad de numeros: ");
        generaSucesion(valorN);
    }
}
