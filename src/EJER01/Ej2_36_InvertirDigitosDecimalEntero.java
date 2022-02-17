/*2.36)Dado un numero real positivo N se pide invertir los digitos del numero manteniendo la cantidad de digitos en laparte entera como la decimal.
 Ej. Si N=8234.734 => 4374.328

 */
package EJER01;

public class Ej2_36_InvertirDigitosDecimalEntero {

    public static void main(String args[]) {
        int c = 0, dig, aux2;
        float aux;
        float numero = Validaciones.generaDecimal("Introducir un numero decimal: ");
        aux = Operaciones.separaDecimal(numero, 2);
        while (aux > (int) (aux)) {
            c++;
            aux *= 10;
        }
        //Operaciones.mostrar("aux", aux);
        aux = (float) (Math.pow(10, c) * numero);
        //Operaciones.mostrar("aux", aux);
        float ndig = 0;
        aux2 = (int) aux;
        while (aux2 != 0) {
            dig = (int) (aux2 % 10);
            aux2 /= 10;
            //Operaciones.mostrar("aux2=", aux2);
            ndig = ndig * 10 + dig;
        }
        ndig = (float) (ndig / Math.pow(10, c));
        System.out.println("el resultado es: " + ndig);
    }
}
