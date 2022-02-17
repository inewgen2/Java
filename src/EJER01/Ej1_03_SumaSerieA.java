/*1.3) Calcular la siguiente serie
 S= 1!/2^0 - 3!/4^1 + 5!/6^2 - 7!/8^3 + ...
Si W=1 -> 1, W=2 -> -0.5, W=3 -> 2.833, W=4 -> -7.0104, 
W=5 -> 29.2776, W=6 -> -131.139, W=7 -> 695.8735
 */
package EJER01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej1_03_SumaSerieA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int cant = 0;
        int den = 0;
        double s = 0, num, signo;
        System.out.print("Introdusca el valor: ");
        cant = in.nextInt();
        for (int i = 1; i <= cant; i++) {
            double a = 1;// debe ser doble por que saca el factorial y es muy grande
            for (int j = 1; j <= i * 2 - 1; j++) {
                a = a * j;
            }
            num = a;
            den = (int) Math.pow(i * 2,i - 1);
            signo = (int) Math.pow(-1, i + 1);//determina el signo
            if(signo==1)
                System.out.print(" + [("+(i*2-1)+"!="+num+")/("+(i*2)+"^"+(i-1)+"="+den+")]= "+(double)(num/den)+" ");
            else
                System.out.print(" - [("+(i*2-1)+"!="+num+")/("+(i*2)+"^"+(i-1)+"="+den+")]= "+(double)(num/den)+" ");
            s = (double)(s + signo * (num / den));
        }
        System.out.println("\nLa suma es: " + df.format(s));//df.format redondea el resultado
    }

}
