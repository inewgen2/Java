/*2.47) Introducir un numero N entero positivo, luego mostrar el siguiente triangulo numerico para N filas.
 Si N=5 =>
 1, 3, 5, 7
 7, 5, 3, 1
 1, 3, 5
 5, 3, 1
 1, 3
 3, 1
 1
 1
 */
package EJER01;

public class Ej2_48_GenerarSucesionTriangulo2N {

    private static void generaSucesion(int val) {
        int i = 1;
        for (i = 1; i <= val; i++) {
            for (int j = 1; j <= val + 1 - i; j++) {
                if (j != (val + 1 - i)) {
                    System.out.print((j * 2 - 1) + ", ");
                } else {
                    System.out.print((j * 2 - 1) + "\n");
                }
            }
            for (int j = val + 1 - i; j >= 1; j--) {
                if (j != 1) {
                    System.out.print((j * 2 - 1) + ", ");
                } else {
                    System.out.print((j * 2 - 1) + "\n");
                }
            }
        }
    }

    public static void main(String args[]) {
        int valorN = Validaciones.generaPositivo("Intrudusca la cantidad de numeros: ");
        generaSucesion(valorN);
    }
}
