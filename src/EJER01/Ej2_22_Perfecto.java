/* 2.22) Dado un numero N entero positivo verificar si es perfecto
 Ej. Si N=6 => 1+2+3 = 6
 */
package EJER01;

public class Ej2_22_Perfecto {

    public static void esPerfecto(int n) {
        int c = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                c = c + i;

                if (n / 2 > i) {
                    System.out.print(i + " + ");
                } else {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println(" = " + c);
        if (c == n) {
            System.out.println("Es un numero Perfecto");
        } else {
            System.out.println("No es un numero Perfecto");
        }
    }

    public static void main(String[] args) {
        int _valor1 = Validaciones.generaPositivo("Ingrese el valor J: ");
        //int _valor2 = Validaciones.generaPositivo("Ingrese el valor K: ");
        esPerfecto(_valor1);
    }
}
