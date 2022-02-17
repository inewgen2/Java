package EJER01;
/* 1.2) Introudcir un numero entero positivo K 
y generar la siguiente serie: 1, 3, 6, 10, 15, 21, 25,...
Ej. Si K=5 => 1, 3, 6, 10, 15         */
import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class Ej1_02_GenerarSerieA {
    public static boolean validaNumero(String datos){
        return datos.matches("[0-9]*");
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String val="";
        int x=0, sw=0;        
        do{
            System.out.print("Introducir un numero positivo:  ");
            val=in.nextLine();
            if(!validaNumero(val.trim())){
               System.out.println("NO es un Numero introdusca un numero entero");
               sw=0;               
            }else{
                System.out.println("El resultado es...");
                sw=1;
                x=parseInt(val);
            }  
        }while(!(x>1 && x<100 && sw==1));
        int c=2, s=1;
        for(int i=1;i<=x;i++){           
            if(i!=x)
                System.out.print(s+" + ");
            else
                System.out.print(s+" \n");
            s=s+c;
            c++;
        }
    }
}
