/* 2.25) Dado un lote de N numeros determinar el promedio de los que no son primos
 Ej. Si N=15  => 15= 2^3 + 2^2 + 2^1 + 2^0
 */
package EJER01;

import java.text.DecimalFormat;

public class Ej2_25_DeUnLoteHallarPrimos {

    public static boolean esPrimo(int numprim) {
        int contDiv = 0;
        for (int i = 1; i <= numprim; i++) {
            if (numprim % i == 0) {
                contDiv++;
            }
        }
        return contDiv == 2;
    }

    public static void determinarQueEs(int numero) {
        int cantPrimos = 0, cantNoPrimos = 0;
        int primos = 0, noprimos = 0; 
        float Promedio = 0;
        DecimalFormat df = new DecimalFormat("0.000");
        for (int i = 0; i < numero; i++) {
            int valor = Validaciones.generaPositivo("Ingrese un numero: ");
            if (esPrimo(valor)) {
                //System.out.println("Primo" + valor);
                primos += valor;
                cantPrimos++;
            } else {
                noprimos += valor;
                cantNoPrimos++;
            }
            Promedio = (float)noprimos/cantNoPrimos;
        }
        System.out.println("Cantidad de primos es " + cantPrimos + " la suma es " + primos);
        System.out.println("Cantidad de no primos es " + cantNoPrimos + " la suma es " + noprimos);
        System.out.println("El promedio de los no primos es " + df.format(Promedio));
    }

    public static void main(String[] args) {
        int _valor1 = Validaciones.generaPositivo("Cuantos numeros desea ingresar: ");
        determinarQueEs(_valor1);
    }
}
