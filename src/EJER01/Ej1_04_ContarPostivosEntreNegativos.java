/* 1.4) Leer un lote de numeros cuyo ultimo nulero es -999, 
 contar cuantos numeros  positivos estan precedidos de dos 
 numeros negativos. 
 */
package EJER01;

import java.io.IOException;
import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;
import java.util.Scanner;

public class Ej1_04_ContarPostivosEntreNegativos {

    public static boolean validaNumero(String datos) {
        //return datos.matches("[0-9]*");
        return datos.matches("^-?[0-9]+$");
    }

    public static int leerNumero() {
        Scanner in = new Scanner(System.in);
        String val = "";
        int x = 0, sw = 0;
        do {
            System.out.print("Introducir un numero positivo:  ");
            val = in.nextLine();
            if (!validaNumero(val.trim())) {
                System.out.println("NO es un Numero introdusca un numero entero");
                sw = 0;
            } else {
                //System.out.println("El resultado es...");
                sw = 1;
                //x=parseInt(val);
                x = Integer.parseInt(val);
            }
        } while (!(sw == 1));
        //System.out.println("\n" + x);
        return x;
    }

    public static void main(String[] args) {
        int c = 1, pos = 0, n, a = 0, b = 0, d;
        //Scanner in =  new Scanner(System.in);
        do {
            //System.out.println("Introdusca un valor");
            //n = in.nextInt();
            n = leerNumero();
            System.out.println("\n" + n);
            if (c == 1) {
                a = n;
            }
            if (c == 2) {
                b = n;
            }
            if (c > 2) {
                d = n;
                if (a < 0 && b < 0 && d > 0) {
                    pos++;
                }
                a = b;
                b = d;
            }
            c++;
        } while (!(n == -999));
        System.out.println("\nLa cantidad de positivos es: " + pos);
    }
}
