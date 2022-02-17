/* 2.1) leer 2 valores enteros positivos por teclado A y C, luego intercambiar sus valores sin utilizar variables auxiliares
si A=23 y C=678 => A=678 y C=23
 */
package EJER01;

public class Ej2_01_IntercambiarValores {
public static void intercambiaValores(int a, int b){
    System.out.println("Valor de A= "+a);
    System.out.println("Valor de B= "+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("\nValor intercambiado de A= "+a);
    System.out.println("Valor intercambiado de B= "+b);
}
    public static void main(String[] args) {
        int valor1, valor2;
        valor1=Ej1_05_GenerarPrimos.leerNumero("Introducir valor de A: ");
        valor2=Ej1_05_GenerarPrimos.leerNumero("Introducir valor de B: ");
        intercambiaValores(valor1, valor2);
    }
    
}
