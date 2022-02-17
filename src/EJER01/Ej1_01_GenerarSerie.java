/* 1.1) Introudcir un numero entero X positivo mayor que 1 y menor que 10 
generar y sumar con dicho numero la siguiente serie: 1, 22, 333, 4444, 55555,...
Ej. Si X=3 -> S = 1 + 22 + 333
 */
package EJER01;
import java.io.IOException;
import java.util.Scanner;
public class Ej1_01_GenerarSerie {
    public static void main(String[] args) throws IOException{
        int x, i, j, a, s;
        Scanner in=new Scanner(System.in);
        do{
            System.out.print("Introdusca un valor: ");
            x = in.nextInt();
        }while(!(x>1 && x<10));
        s=0;
        for(i=1;i<=x;i++) {
            a=0;
            for(j=1;j<=i;j++){
                a=a*10+i;
            }
            s=s+a;
            if (i!=x)
                System.out.print(a + " + ");
            else
                System.out.print(a+" \n");
        }        
        System.out.println("Suma es:"+s);
    }
}
