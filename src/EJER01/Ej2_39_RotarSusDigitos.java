/*2.39) Dado un numero entero positivo N, rotar K veces sus digitos hacia la derecha
 Ej. Si N=52147 => k=2 => 75214      y       47521

 */
package EJER01;

public class Ej2_39_RotarSusDigitos {

    public static String rotar(int numero, int n) {
        String res = "";
        int exp = cantDig(numero) - 1;
        int aux = (int) Math.pow(10, exp);
        for (int i = 0; i < n; i++) {
            int dig = numero % 10;
            numero = numero / 10;
            int base = aux * dig;
            numero = numero + base;
            if (dig == 0) {
                res = res + 0 + numero + "\n";
            } else {
                res = res + numero + "\n";
            }
        }
        return res;
    }

    public static int cantDig(int num) {
        int res = 0;
        while (num > 0) {
            res++;
            num /= 10;
        }
        return res;
    }

    public static void rotar2(int numero, int rotaciones) {
        int aux, c, dig, cont = 0;
        int aux2 = numero;
        while (aux2 != 0) {
            cont++;
            aux2 /= 10;
        }
        c = (int) Math.pow(10, cont - 1);
        for (int i = 0; i < rotaciones; i++) {
            dig = numero % 10;
            numero /= 10;
            aux = numero;
            numero = c * dig + aux;
            if (dig == 0) {
                System.out.print("0");
            }
            System.out.println(numero);
        }
    }

    public static void main(String args[]) {

        int _numero = Validaciones.generaPositivo("Introducir un numero: ");
        int _rotaciones = Validaciones.generaPositivo("Numero de rotaciones: ");
        rotar2(_numero, _rotaciones);
        System.out.println("\nMetodo2:\n" + rotar(_numero, _rotaciones));
    }
}
