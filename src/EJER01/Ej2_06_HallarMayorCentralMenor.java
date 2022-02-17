/* 2.6) Dados 3 numeros A, B y C, hallar el mayor, el central y el menor.
Si A=25 B=123 y C=94 => Mayor=123, Central=94, Menor=25.
 */
package EJER01;

public class Ej2_06_HallarMayorCentralMenor {
public static void OrdenaTresValores(int a,int b,int c){
    if(a>b){
        if(a>c){
            if(b>c)
                System.out.println("\nEl Mayor= "+a+", Central= "+b+", Menor= "+c);
            else
                System.out.println("\nEl Mayor= "+a+", Central= "+c+", Menor= "+b);
        }else
            System.out.println("\nEl Mayor= "+c+", Central= "+a+", Menor= "+a);
    }else{
        if(b>c){
            if(c>a)
                System.out.println("\nEl Mayor= "+b+", Central= "+c+", Menor= "+a);
            else
                System.out.println("\nEl Mayor= "+b+", Central= "+a+", Menor= "+c);
        }else{
            System.out.println("\nEl Mayor= "+c+", Central= "+b+", Menor= "+a);
        }
    }   
}
    public static void main(String[] args) {
        int valor1, valor2, valor3;
        valor1=Ej1_05_GenerarPrimos.leerNumero("Introducir valor de A: ");
        valor2=Ej1_05_GenerarPrimos.leerNumero("Introducir valor de B: ");
        valor3=Ej1_05_GenerarPrimos.leerNumero("Introducir valor de C: ");
        OrdenaTresValores(valor1,valor2,valor3);
    }    
}
