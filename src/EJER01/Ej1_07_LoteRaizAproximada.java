/*1.7) Introducir Z numeros enteros positivos, de cada numero 
calcular su raiz cuadrada tomando en cuenta que el resultado 
debe ser el entero mas cercano.
Ej. Si Z=60 -> 7
*/
package EJER01;
import EJER01.Ej1_05_GenerarPrimos;
import java.io.IOException;
import java.util.Scanner;
public class Ej1_07_LoteRaizAproximada {
    public static void main(String[] args) throws IOException{
        int raizAprox=1, valorLeido, i, cantElem;
        //Scanner in =  new Scanner(System.in);
        //System.out.println("Introdusca un valor");
        //z = in.nextInt();
        cantElem=Ej1_05_GenerarPrimos.leerNumero("Introdusca la cantidad de datos a leer: ");
        for(i=1;i<=cantElem;i++){
            //System.out.print("Introduce un valor => ");
            valorLeido = Ej1_05_GenerarPrimos.leerNumero("Ingrese el valor => ");
            raizAprox=1;
            while(raizAprox*raizAprox<=valorLeido)
                raizAprox++;
            System.out.print("La raiz aproximada es:  "+(raizAprox-1)+"\n");
        }
    }
}
