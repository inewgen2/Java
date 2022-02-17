/* 2.15) hallar el maximo comun divisor MCD, y el minimo comun multiplo MCM de dos numeros enteros positivos
 
 */
package EJER01;

public class Ej2_15_HallarMCD_mcm {

    public static void hallarMCD(int a, int b) {
        int mcd = a, r;
        int aux = b;
        do {
            r = mcd % aux;
            mcd = aux;
            aux = r;
        } while (r != 0);
        int mcm = a * b / mcd;
        System.out.println("El MCD es : " + mcd);
        System.out.println("El mcm es : " + mcm);
    }

    public static void hallarMCD(int a, int b, int c) {
        int i = 2, mcm = 1, mcd = 1;
        int aa=a, bb=b, cc=c;
        while ((a != 1) || (b != 1) || (c != 1)) {
            if ((a % i == 0) || (b % i == 0) || (c % i == 0)) {
                mcm = mcm * i;
                if (a % i == 0) {
                    a = a / i;
                }
                if (b % i == 0) {
                    b = b / i;
                }
                if (c % i == 0) {
                    c = c / i;
                }
            } else {
                i++;
            }
        }
        System.out.println("\nEl mcm es : " + mcm);
        i = 2;
        while ((i <= aa) || (i <= bb) || (i <= cc)) {
            if ((aa % i == 0) && (bb % i == 0) && (cc % i == 0)) {
                mcd = mcd * i;
                if (aa % i == 0) {
                    aa = aa / i;
                }
                if (bb % i == 0) {
                    bb = bb / i;
                }
                if (cc % i == 0) {
                    cc = cc / i;
                }
            } else {
                i++;
            }
        }
        System.out.println("\nEl MCD es : " + mcd);
    }

    public static void main(String[] args) {
        int _valor1 = Validaciones.generaPositivo("Ingrese el valor A: ");
        int _valor2 = Validaciones.generaPositivo("Ingrese el valor B: ");
        int _valor3 = Validaciones.generaPositivo("Ingrese el valor C: ");
        hallarMCD(_valor1, _valor2, _valor3);
    }
}
