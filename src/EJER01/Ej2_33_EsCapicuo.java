/*2.33) Dado un numero entero positivo P, se desea saber si es capicuo.
 Ej. Si P=39693 => Es Capicuo.

 */
package EJER01;

public class Ej2_33_EsCapicuo {

    public static boolean esCapicuo(int n) {
        int dig, s = 0, c;
        c = n;
        while (n != 0) {
            dig = n % 10;
            n /= 10;
            s = s * 10 + dig;
        }
        return s == c;
    }

    public static void main(String args[]) {

        int valorP = Validaciones.generaEntero("Ingrese un numero positivo: ");
        if (esCapicuo(valorP)) {
            System.out.println("El numero: " + valorP + " ES CAPICUO");
        } else {
            System.out.println("El numero: " + valorP + " NO ES CAPICUO");
        }
    }
}
