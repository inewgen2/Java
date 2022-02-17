/* 1.3) Calcular la suma S= 1!/2^0 - 3!/4^1 + 5!/6^2 - 7!/8^3
Si W=1 -> 1, W=2 -> -0.5, W=3 -> 2.833, W=4 -> -7.0104, 
W=5 -> 29.2776, W=6 -> -131.139, W=7 -> 695.8735
 */
package EJER01;
import java.io.IOException;
import static java.lang.Math.pow;
import java.util.Scanner;
public class Ej1_03_SumaSerie {
    public static void main(String[] args) throws IOException{
        int w, i, den, a, j;
        double num;
        double s,s1;
        Scanner in=new Scanner(System.in);
            System.out.print("Introdusca un valor: ");
            w = in.nextInt();
        s=0;        
        den=0;
        for(i=1;i<=w;i++) {            
            a=1;
            num=1;
            for(j=1;j<=(i*2-1);j++){
                num=(double)num*j;
            }
            den=(int) pow(i*2,i-1);   
            s1=(double)num/den;
            a=(int)pow(-1,i+1);
            s=(double)(s+a*s1);
            //System.out.println("\n a = "+a+"  num= "+num+"  den= "+den + " =   "+s1);
            if (i%2==0)
                System.out.print(" - " + " " + (i*2-1) + "!/" + i*2 + "^" + (i-1) + " ");
            else
                System.out.print(" + " + " " + (i*2-1) + "!/" + i*2 + "^" + (i-1) + " ");
        }  
        System.out.println("\n La suma es: " + s);
    }
}
