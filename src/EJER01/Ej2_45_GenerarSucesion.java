/*2.45) Generar la siguiente sucesion para N terminos.
 2, 12, 30, 56, 90, 30, 56, 104, ...
 */
package EJER01;

public class Ej2_45_GenerarSucesion {

    private static void generaSucesion(int val) {
        int ini = 2, aun = 10;
        for (int i = 1; i <= val; i++) {
            if (i != val) {
                System.out.print(ini + ", ");
            } else {
                System.out.print(ini + "\n");
            }
            ini = ini + aun;
            aun =aun+ 8;
        }
    }

    public static void main(String args[]) {
        int valorN = Validaciones.generaPositivo("Intrudusca la cantidad de numeros: ");
        generaSucesion(valorN);
    }
}
