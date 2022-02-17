/* 1.2) Introducir un numero entero positivo K y generar 
la siguiente serie 1, 3, 6, 10, 15, 21, 28,...
Ej. si K=5 -> 1, 3, 6, 10, 15
 */
package EJER01;
import java.io.IOException;
import java.util.Scanner;
public class Ej1_02_GenerarSerie {
    public static void main(String[] args) throws IOException{
        int k, i, c, s;
        Scanner in=new Scanner(System.in);
            System.out.print("Introdusca un valor: ");
            k = in.nextInt();
        s=1;
        c=2;
        for(i=1;i<=k;i++) {            
            if (i!=k)
                System.out.print(s + ", ");
            else
                System.out.print(s + " \n");
            s = s + c;
            c = c + 1;
        }        
    }
}
