/* 2.18) Dados dos numeros A y B. Hallar C que satisfaga A+C=B, sin realizar la operacion algebraica C=B-A.
 Ej. Si A=7 y B=12 => C=5
 
 */
package EJER01;

public class Ej2_18_HallarCqueSatisfagaEcuacion {

    public static void hallarCdeEcuacion(int a, int b) {
        int c, aux;
        if (a > b) {
            c = a % b;
            c=a-b;
        } else {
            c = b % a;
            c= b-a;
        }
        System.out.println("\nEl valor de C es: " + c);
    }

    public static void main(String[] args) {
        int _valor1 = Validaciones.generaPositivo("Ingrese el valor A: ");
        int _valor2 = Validaciones.generaPositivo("Ingrese el valor B: ");
        hallarCdeEcuacion(_valor1, _valor2);
    }
}
