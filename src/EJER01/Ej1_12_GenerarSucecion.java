/*1.12) Generar la siguiente sucesion para n terminos
 Ej. Si N=5 => 0, 0, 1, 1, 0, 0, 1, 1, 0, 0,...
 */
package EJER01;

public class Ej1_12_GenerarSucecion {

    public static void generaSerie(int valor) {
        int k=0, r=1, l;
        while (k < valor) {
            if (r == 1) {//intercambia valor de salida a 0
                r = 0;
            } else {//intercambia el valor de salida a 1
                r = 1;
            }
            l = 0;
            while ((l < 2) && (k < valor)) {//imprime 2 valores luego sale
                if (k + 1 != valor) {//solo sirve para no colocar la coma al ultimo dato
                    System.out.print(r + ", ");
                } else {
                    System.out.print(r + " \n");
                }
                l = l + 1;//cuenta las veces antes de cambiar de valor
                k++;//contador general de la serie
            }
        }
    }

    public static void main(String[] args) {
        int valor = Ej1_05_GenerarPrimos.leerNumero("Leer valor de datos a mostrar: ");
        generaSerie(valor);
    }
}
