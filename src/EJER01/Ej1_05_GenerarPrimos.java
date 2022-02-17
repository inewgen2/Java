/* 1.5) Generar los T primeros numeros primos
 */
//System.out.print(" - " + var);
//Scanner in=new Scanner(System.in);
//w = in.nextInt();
package EJER01;

import static EJER01.Ej1_04_ContarPostivosEntreNegativos.validaNumero;
import java.io.IOException;
import java.util.Scanner;

public class Ej1_05_GenerarPrimos {

    public static int leerNumero(String mensaje) {
        Scanner in = new Scanner(System.in);
        String val = "";
        int x = 0, sw = 0;
        do {
            System.out.print(mensaje);
            val = in.nextLine();
            if (val.matches("^[0-9]+$")) {
                sw = 1;
                x = Integer.parseInt(val);
            } else {
                System.out.println("NO es valido, introdusca un numero");
                sw = 0;
            }
        } while (!(sw == 1));
        return x;
    }

    public static void main(String[] args) throws IOException {
        int numprim = 1, contDiv = 0, contGral = 1, i, cantSerie;
        Scanner in = new Scanner(System.in);
        //System.out.print("Introdusca un valor:  ");
        //t = in.nextInt();
        cantSerie = leerNumero("Introducir un numero positivo:  ");
        while (contGral <= cantSerie) {
            numprim++;
            contDiv = 0;
            for (i = 1; i <= numprim; i++) {
                if (numprim % i == 0) {
                    contDiv++;
                }
            }
            if (contDiv == 2) {//verifica si cumple la regla para ser primo
                System.out.print(numprim + ",  ");
                contGral++;
            }
        }
        System.out.print("\n");
    }
}
