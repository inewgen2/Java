/* 2.3) Dados 2 valores X, Y, enteros positivos sumar el valor de X y Y en S sin utilizar el operador "+".
Si X=12 y Y=6  => S=18.
 */
package EJER01;

public class Ej2_03_SumarSinSignoSuma {
public static void sumarSinMas(int a,int b){
    System.out.println("Valor de X= "+a);
    System.out.println("Valor de Y= "+b);
    int s=a-(-b);
    System.out.println("\nLa suma es:  "+s);
}
    public static void main(String[] args) {
        int valor1, valor2;
        valor1=Ej1_05_GenerarPrimos.leerNumero("Introducir valor de X: ");
        valor2=Ej1_05_GenerarPrimos.leerNumero("Introducir valor de Y: ");
        sumarSinMas(valor1,valor2);
    }    
}
