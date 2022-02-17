/* 2.13) Introducir dos numeros A y B con partes decimales, luego mostrar la parte entera del numero que contiene la mayor parte decimal
 Si A=67.345 y B=123.3 => mostrar 67
 */
package EJER01;

public class Ej2_13_MostrarParteEnteraDeUnDecimal {

    public static void main(String[] args) {
        float valor1 = Validaciones.generaDecimal("Introduce el valor A: ");
        float valor2 = Validaciones.generaDecimal("Introduce el valor B: ");
        float aux1 = Operaciones.separaDecimal(valor1, 1);
        float aux2 = Operaciones.separaDecimal(valor2, 1);
        float aux1A = Operaciones.separaDecimal(valor1, 2);
        float aux2A = Operaciones.separaDecimal(valor2, 2);
        if (aux1A > aux2A) {
            System.out.println("El mayor es: " + aux1);
        } else {
            System.out.println("El mayor es: " + aux2);
        }
    }
}
