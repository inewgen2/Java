/*2.31) Dado un numero entero positivo N, contar los digitos difeentes de 0 que contenga.
Ej. Si N=256705083 => tiene 7 digitos.

*/
package EJER01;

public class Ej2_31_DigitosDiferentesDeCero {
    
    public static void main(String args[]){
        int numero=Validaciones.generaEntero("Introduce el numero: ");
        int dig, cont=0;
        while(numero!=0){
            dig=numero%10;
            numero/=10;
            if(dig!=0){
                cont++;
            }
        }
        System.out.println("la cantidad de digitos diferentes de CERO son: "+cont);
    }
}
