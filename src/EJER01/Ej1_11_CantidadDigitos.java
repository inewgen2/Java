/*1.8) Mostrar la cantidad e digitos de un numero dado
Ej. Si Z=6034 -> 4, Z=18234 -> 5
*/
package EJER01;

import java.io.IOException;
import java.util.Scanner;
public class Ej1_11_CantidadDigitos {
    public static void main(String[] args) throws IOException{
        int cant=0, cont=0, aux;
        //Scanner in =  new Scanner(System.in);
        //System.out.println("Introdusca un valor: ");
        //cant = in.nextInt();
        cant=Ej1_05_GenerarPrimos.leerNumero("Introdusca un valor:  ");
        aux = cant;
        while(cant != 0){
            cant /=10;
            cont +=1;
        }
        System.out.println("La cantidad de digitos de N= "+ aux +", es igual a: "+cont);
    }
}
