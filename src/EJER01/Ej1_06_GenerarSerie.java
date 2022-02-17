/*1.6) Generar la siguiente serie de R terminos
 1, 3, 3, 5, 5, 5, 7, 7, 7, 7,....
 Ej. Si R=4 -> 1, 3, 3, 5
 */
package EJER01;

import java.io.IOException;
import java.util.Scanner;

public class Ej1_06_GenerarSerie {

    public static void main(String[] args) throws IOException {
        int numSalida = 1, control = 1, reset = 0, cantElem;
        //Scanner in = new Scanner(System.in);
        //System.out.println("Introdusca un valor");
        //r = in.nextInt();
        cantElem = Ej1_05_GenerarPrimos.leerNumero("Introdusca un valor: ");
        for (int i = 1; i <= cantElem; i++) {
            if (reset < control) {
                reset++;
            } else {
                numSalida += 2;
                reset = 1;
                control++;
            }
            System.out.print(numSalida + ",  ");
        }
        System.out.println("");
    }
}
