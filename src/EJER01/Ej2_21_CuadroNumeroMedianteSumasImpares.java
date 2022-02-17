/* 2.21) Hallar el cuadrado de un numero entero positivo N en base a la suma de impares
 Ej. Si N=4 => 1+3+5+7 = 16
 */
package EJER01;

public class Ej2_21_CuadroNumeroMedianteSumasImpares {

    public static void cuadradoPorSumasImpares(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            c = c + (i * 2 - 1);
            if (i != n) {
                System.out.print((i * 2 - 1) + " + ");
            } else {
                System.out.print((i * 2 - 1) + " = ");
            }
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        int _valor1 = Validaciones.generaPositivo("Ingrese el valor J: ");
        //int _valor2 = Validaciones.generaPositivo("Ingrese el valor K: ");
        cuadradoPorSumasImpares(_valor1);
    }
}
