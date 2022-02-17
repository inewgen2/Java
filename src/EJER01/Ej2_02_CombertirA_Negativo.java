/* 2.2) Dado un numero N entero positivo volverlo negativo sin multiplicarlo por (-1).
si N=78  => N=-78
 */
package EJER01;

public class Ej2_02_CombertirA_Negativo {
public static void vuelveNegativo(int a){
    System.out.println("Valor de A= "+a);
    a=0-a;
    System.out.println("\nValor intercambiado de A= "+a);
}
    public static void main(String[] args) {
        int valor1;
        valor1=Ej1_05_GenerarPrimos.leerNumero("Introducir valor de A: ");
        vuelveNegativo(valor1);
    }
    
}
