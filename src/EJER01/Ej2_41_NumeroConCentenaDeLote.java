/*2.41)  Dado un conjunto de numeros N enteros postivis mayores a 100 generar un numero Z con los digitos centena de los numeros introducidos.
 Si N=5 => 5846, 2366, 124, 5784, 45698 => 83176
 */
package EJER01;

public class Ej2_41_NumeroConCentenaDeLote {

    private static void generarCentenas(int valorN) {
        int c = 1, aux = 0, dig;
        for (int i = 0; i < valorN; i++) {
            int valorX = Validaciones.generaPositivo("Ingrese un numero: ", 100, 10000000);
            valorX /= 100;
            dig = valorX % 10;
            aux = dig + aux * 10;
            c *= 10;
        }
        System.out.println(aux);
    }

    public static void main(String args[]) {
        int _val = Validaciones.generaPositivo("Ingrese la cantidad de datos a leer: ");
        generarCentenas(_val);
    }
}
