/*2.43) Generar la siguiente sucesion para N terminos.
 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, ...
 */
package EJER01;

public class Ej2_43_GenerarSucesion {

    private static void generaSucesion(int val) {
        int a = 0, b = 1, cont = 0, aux = 1, d = 1;
        while (cont <= val) {
            while ((d <= aux) && (cont <= val)) {
                cont++;
                d++;
                if (cont != val) {
                    System.out.print(a + ", ");
                }
            }
            d = 1;
            while ((d <= aux) && (cont <= val)) {
                cont++;
                d++;
                if (cont != val) {
                    System.out.print(b + ", ");
                }
            }
            d = 1;
            aux++;
        }
    }

    public static void main(String args[]) {
        int valorN = Validaciones.generaPositivo("Intrudusca la cantidad de numeros: ");
        generaSucesion(valorN);
    }
}
