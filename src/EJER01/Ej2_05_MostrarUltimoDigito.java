/* 2.5) Dado un numero N, mostrar el ultimo digito del numero.
Si N=2345 => =5.
Si N=78   => =8
 */
package EJER01;

public class Ej2_05_MostrarUltimoDigito {
public static void extraeDigito(int a){
    //System.out.println("La valor es= "+a);
    a=a%10;
    System.out.println("\nEl digitoes:  "+a);
}
    public static void main(String[] args) {
        int valor1;
        valor1=Ej1_05_GenerarPrimos.leerNumero("Introducir valor de X: ");
        extraeDigito(valor1);
    }    
}
