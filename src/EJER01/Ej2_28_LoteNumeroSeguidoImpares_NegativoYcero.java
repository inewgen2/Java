/* 2.28) Dado un lote de n numero, se pide determinar.
- Cuantas veces en numero par esta seguido por dos impares.
- Cuantas veces un numero esta seguido por un negativo y cero.
 */
package EJER01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej2_28_LoteNumeroSeguidoImpares_NegativoYcero {

    public static void determinarQueTiene(int numero) {
        int cont=0, valA=0, valB=0, impar=0;
        for(int i=1;i<=numero;i++){
            int valorK=Validaciones.generaEntero("Ingrese un valor: ");
            if(i==1)
                valA=valorK;
            if(i==2)
                valB=valorK;
            if(i>2){
                if((valA%2==0)&&(valB%2==1)&&(valorK%2==1)){
                    impar++;
                    System.out.println("A= "+valA+" B= "+valB+" C= "+valorK);
                }
                if((valB<0)&&(valorK==0)){
                    cont++;
                    System.out.println("A= "+valA+" B= "+valB+" C= "+valorK);
                }
                valA=valB;
                valB=valorK;
            }
        }        
        System.out.println("El numero par seguido de impares es: " + impar);
        System.out.println("El numero seguido por negativo y cero es: " + cont);
    }

    public static void main(String[] args) {
        int _valor1 = Validaciones.generaPositivo("Cuantos numeros desea ingresar: ");
        determinarQueTiene(_valor1);
    }
}
