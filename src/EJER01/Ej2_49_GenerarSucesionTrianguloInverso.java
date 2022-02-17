/*2.47) Introducir un numero N entero positivo, luego mostrar el siguiente triangulo numerico para N filas.
 Si N=4 =>
 1
 2, 4
 3, 6, 9
 4, 8, 12, 16
 */
package EJER01;

public class Ej2_49_GenerarSucesionTrianguloInverso {

    private static void generaSucesion(int val) {
        int i = 1;
        for (i = 1; i <= val; i++) {
            for (int j = 1; j <= i; j++) {
                if (j != i) {
                    System.out.print((j * i) + ", ");
                } else {
                    System.out.print((j * i) + "\n");
                }
            }
        }
    }

    public static void main(String args[]) {
        int valorN = Validaciones.generaPositivo("Intrudusca la cantidad de numeros: ");
        generaSucesion(valorN);
    }
}
