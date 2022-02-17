/* 2.27) Se tiene N numeros, que representan el sueldo de N personas, se pide mostrar la suma total de suledos, el sueldo promedio, el sueldo mino y el sueldo maximo
 */
package EJER01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej2_27_SueldosPromedios {

    public static void determinarQueEs(int numero) {
        float maximo = 0, minimo = 0, cont = 0;
        Scanner in = new Scanner(System.in);
        int sw = 1;
        float Promedio = 0, sueldo = 0;
        DecimalFormat df = new DecimalFormat("0.000");
        for (int i = 0; i < numero; i++) {
            int aux = 0;
            do {
                System.out.print("Ingrese el sueldo: ");
                String val = in.nextLine();
                if (Validaciones.esDecimal(val)) {
                    sueldo = Float.parseFloat(val);
                    aux = 1;
                } else if (Validaciones.esNumeroEntero(val)) {
                    sueldo = Integer.parseInt(val);
                    aux = 1;
                } else {
                    System.out.println("El valor Ingresado no es valido");
                }
            } while (aux == 0);
            if (sw == 1) {
                sw = 0;
                maximo = sueldo;
                minimo = sueldo;
            } else {
                if (sueldo > maximo) {
                    maximo = sueldo;
                }
                if (sueldo < minimo) {
                    minimo = sueldo;
                }
            }
            cont = (float) cont + sueldo;
        }
        Promedio = (float) cont / numero;
        System.out.println("El sueldo maximo es: " + maximo);
        System.out.println("El sueldo minimo es: " + minimo);
        System.out.println("El sueldo total es: " + cont + " el promedio de sueldo es: " + df.format(Promedio));
    }

    public static void main(String[] args) {
        int _valor1 = Validaciones.generaPositivo("Cuantos numeros desea ingresar: ");
        determinarQueEs(_valor1);
    }
}
