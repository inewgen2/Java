/* 2.4) Hallar la suma de los primeros N numeros naturales.
Si N=5 => S=1+2+3+4+5 = 15.
 */
package EJER01;

public class Ej2_04_SumatoriNumerosNaturales {
public static void sumaNumerosNaturales(int a){
    System.out.println("La cantidad es= "+a);
    
    int s=(a*(a+1))/2;
    System.out.println("\nLa suma es:  "+s);
}
    public static void main(String[] args) {
        int valor1, valor2;
        valor1=Ej1_05_GenerarPrimos.leerNumero("Introducir valor de X: ");
        sumaNumerosNaturales(valor1);
    }    
}
