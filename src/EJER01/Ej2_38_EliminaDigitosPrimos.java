/*2.38) Dado un numero entero positivo X, eliminar todos los digitos primos que contenga.
Ej. Si X=52471803 => 4180
*/
package EJER01;

public class Ej2_38_EliminaDigitosPrimos {
    
    public static void main(String args[]){
        int valorN=Validaciones.generaPositivo("Introducir un numero: ");
        int dig1=0, c=1, nuevoDig=0;
        while(valorN!=0){
            dig1=valorN%10;
            valorN/=10;
            if(!Operaciones.esPrimo(dig1)){
                nuevoDig=c*dig1+nuevoDig;
                c*=10;
            }
        }
        System.out.println("El valor que queda es: "+nuevoDig);
    }
}
