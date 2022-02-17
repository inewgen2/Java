/* 2.29) Leer N numeros enteros si el numero es perfecto formar un numero NUM con sus divisores
 Si N=3 => 10 6 25 => NUM=123
 */
package EJER01;

public class Ej2_29_GeneraNumerosConDivisoresDelPerfecto {

    private static int generaNumero(int n) {
        String c = "";
        String d = "";
        int dig;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                d = String.valueOf(i);
                c = c + i;
            }
        }
        dig = Integer.parseInt(c);
        return dig;
    }

    public static void generarNumeroConPerfecto(int numero) {
        for (int i = 1; i <= numero; i++) {
            int valorK = Validaciones.generaEntero("Introduce un valor: ");
            if (Operaciones.esPerfecto(valorK)) {
                System.out.println("El valor: " + valorK + " se genera: " + generaNumero(valorK));
            }
        }
    }

    public static void main(String[] args) {
        int _valor1 = Validaciones.generaPositivo("Cuantos numeros desea ingresar: ");
        generarNumeroConPerfecto(_valor1);
    }
}
