/* 2.26) Dado un lote de R numeros, se pide
 - Determinar la cantidad de numeros primos y su suma
 - Determinar la cantidad de numeros perfectos y su suma.
 - Determinar la cantidad de numeros no primos y su suma.
 - Determinar el primedio total de los numeros.
 Ej. Si N=15  => 15= 2^3 + 2^2 + 2^1 + 2^0
 */
package EJER01;

public class Ej2_26_LoteHallarPrimosPerfectosTotal {

    public static boolean esPrimo(int numprim) {
        int contDiv = 0;
        for (int i = 1; i <= numprim; i++) {
            if (numprim % i == 0) {
                contDiv++;
            }
        }
        return contDiv == 2;
    }

    public static boolean esPerfecto(int n) {
        int c = 0;
        if (n != 0) {
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    c = c + i;
                }
            }
            return c == n;
        } else {
            return false;
        }
    }

    public static void determinarQueEs(int numero) {
        int perfectos = 0, cantPrimos = 0, cantPerfectos = 0, cantNoPrimos = 0;
        int primos = 0, noprimos = 0, cantTotal = 0;
        for (int i = 0; i < numero; i++) {
            int valor = Validaciones.generaPositivo("Ingrese un numero: ");
            if (esPerfecto(valor)) {
                System.out.println("Perfecto" + valor);
                perfectos += valor;
                cantPerfectos++;
            } else if (esPrimo(valor)) {
                System.out.println("Primo" + valor);
                primos += valor;
                cantPrimos++;
            } else {
                noprimos += valor;
                cantNoPrimos++;
            }
            cantTotal += valor;
        }
        System.out.println("Cantidad de perfectos es " + cantPerfectos + " la suma es " + perfectos);
        System.out.println("Cantidad de primos es " + cantPrimos + " la suma es " + primos);
        System.out.println("Cantidad de no primos es " + cantNoPrimos + " la suma es " + noprimos);
        System.out.println("Cantidad de datos leidos es " + numero + " la suma es " + cantTotal);
    }

    public static void main(String[] args) {
        int _valor1 = Validaciones.generaPositivo("Cuantos numeros desea ingresar: ");
        determinarQueEs(_valor1);
    }
}
