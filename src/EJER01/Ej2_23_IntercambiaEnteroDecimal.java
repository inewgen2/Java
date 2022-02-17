/* 2.23) Dado un real N intercambiar la parte decimal con la parte entera
 Ej. Si N=213.5672  => 5672.213
 */
package EJER01;

public class Ej2_23_IntercambiaEnteroDecimal {

    public static void intercambiaEnteroPorDecimal(float n) {
        float val1 = Operaciones.separaDecimal(n, 1);
        float val2 = Operaciones.separaDecimal(n, 3);
        while (val1 > 1) {
            val1 /= 10;
        }
        float union = val2 + val1;
        System.out.println("No es un numero: " + union);
    }

    public static void main(String[] args) {
        float _valor1 = Validaciones.generaDecimal("Ingrese el valor J: ");
        //float _valor2 = Validaciones.generaDecimal("Ingrese el valor K: ");
        intercambiaEnteroPorDecimal(_valor1);
    }
}
