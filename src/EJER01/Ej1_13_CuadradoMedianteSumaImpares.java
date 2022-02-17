/*1.12) Dado un numero M entero positivo hallar el cuadrado
 de cada digito mediante suma de numeros impares
 Ej. Si M=23 => 3 -> 1+3+5=9
 2 -> 1+3=4    
 */
package EJER01;

public class Ej1_13_CuadradoMedianteSumaImpares {

    public static void generaSerie(int valor) {
        int i;
        while (valor != 0) {
            int dig1 = valor % 10;//extrae el digito
            i = 1;//acumulador de digitos impares
            int cuad = 0;//almacena la suma total de cada numero
            System.out.print(dig1 + " = ");
            for (int j = 1; j <= dig1; j++) {
                cuad = cuad + i;//almacena la suma de impares
                if (j != dig1) {
                    System.out.print(i + " + ");
                } else {
                    System.out.print(i + "");
                }
                i += 2;
            }
            valor /= 10;//elimina el ultimo digito
            System.out.print(" = " + cuad + "\n");// muestra el resultado final de cada digito
        }
    }

    public static void main(String[] args) {
        int valor = Ej1_05_GenerarPrimos.leerNumero("Leer valor de datos a mostrar: ");
        generaSerie(valor);
    }
}
