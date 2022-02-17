/*2.35) Dado un numero entero positivo N, ordenar sus digitos en forma ascendente:
Ej. Si N=129756 => N=125679
*/
package EJER01;
import java.util.Scanner;
public class Ej2_35_OrdenarSusDigitos {
    
    public static void main(String[] args){
        int n=0, c, d1, d2, a, aux, c1=1, d=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el valor");
        n = in.nextInt();
        a=n;
        while(a!=0){
            c=0;
            d1=a%10;
            a=a/10;
            while(a!=0){
                d2=a%10;
                a=a/10;
                if(d1<d2){
                    aux=d2;
                    d2=d1;
                    d1=aux;
                }
                c=c*10+d2;
            }
            d=d1*c1+d;
            c1*=10;
            a=c;
        }
        System.out.println("ordenado es: "+d);
    }
}
