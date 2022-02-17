/*2.50) Hallar la suma de los N primeros terminos de ls siguiente serie
 Si 0! + 1 + 1! + 2 + 3! + 5 + 8! + 13 + ...
 */
package EJER01;

public class Ej2_50_SumaFibonacci {

    private static void generaSucesion(int val) {
        int a = -1, b = 1, c = 0, i, s = 0, aux;
        for (i = 1; i <= val; i++) {
            c = a + b;
            a = b;
            b = c;
            if (i % 2 != 0) {
                int fact = Operaciones.factorial(c);
                aux = fact;
                System.out.print(c + "! + ");
            } else {
                aux = c;
                System.out.print(c + " + ");
            }
            s = s + aux;
        }
        System.out.println("\nLa suma es: " + s);
    }

    public static void main(String args[]) {
        int valorN = Validaciones.generaPositivo("Intrudusca la cantidad de numeros: ");
        generaSucesion(valorN);
    }
}
