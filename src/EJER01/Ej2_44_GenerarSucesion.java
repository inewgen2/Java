/*2.44) Generar la siguiente sucesion para N terminos.
 0, 2, 3, 8, 15, 30, 56, 104, ...
 */
package EJER01;

public class Ej2_44_GenerarSucesion {

    private static void generaSucesion(int val) {
        int a = -1, b = 1, cont = 1, aux = 1, c = 0;
        for (int i = 1; i <= val; i++) {
            c = a + b;
            a = b;
            b = c;
            aux = cont * c;
            if (i != val) {
                System.out.print(aux + ", ");
            } else {
                System.out.print(aux + "\n");
            }
            cont++;
        }
    }

    public static void main(String args[]) {
        int valorN = Validaciones.generaPositivo("Intrudusca la cantidad de numeros: ");
        generaSucesion(valorN);
    }
}
