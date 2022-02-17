/*1.9) Realizar un programa que genere K primeros terminos
de la serie de fibonacci.
 Ej 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,....
 */
package EJER01;

import java.io.IOException;
import java.util.Scanner;

public class Ej1_09_FibonacciRecursivo {

    public static void main(String[] args) {
        int valor;
        valor = Ej1_05_GenerarPrimos.leerNumero("Leer cantidad de valores a mostrar: ");
        for(int i=1;i<=valor;i++) //genera la serie 
            System.out.print(generarFibonacciRecursivo(i)+", ");  //devuelve el valor fibonacci
    }
//funcion recursiva de fibonacci 
    private static int generarFibonacciRecursivo(int valor) {
        if(valor>=1){            
            return (generarFibonacciRecursivo(valor-1) + generarFibonacciRecursivo(valor-2));
        }else if(valor == 0){// verifica el valor minino para el retorno
            return 1; 
        }else if(valor == (-1)){//verifica el valor minimo para el retorno
            return -1;
        }else{
            //System.out.println("Debes ingresar un valor mayor o igual a 1");
            return -1;
        }
    }
}
