package EJER01;
/* 1.1) Introudcir un numero entero X positivo mayor que 1
y menor que 10, generar y sumar con dicho numero la siguiente
serie 1, 22, 333, 4444, 55555,...
Ej. Si X=3 => S=1+22+333    */
import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class Ej1_01_GenerarSerieA {
    public static boolean validaNumero(String datos){
        return datos.matches("[0-9]*");
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String val="";
        int x=0, sw=0;        
        do{
            System.out.print("Introducir un Numero mayor a 1 y menor 10:  ");
            val=in.nextLine();
            if(!validaNumero(val.trim())){
               System.out.println("NO es un Numero introdusca un numero entero");
               sw=0;//si no es un numero pone sw=0 para que no pase condicion               
            }else{
                System.out.println("El resultado es...");
                sw=1;//significa que el valor introducido es un numero
                x=parseInt(val);//convierte el valor introducido en un entero y lo almacena en X
            }  
        }while(!(x>1 && x<10 && sw==1));//verifica que se cumpla todos las condiciones
        int s=0;//sumatoria total
        for(int i=1;i<=x;i++){
            int num=0;// inicia el numero a generar 
            for(int j=1;j<=i;j++)
                num=num*10+i;//genera el numeros
            s=s+num;//realiza la suma 
            if(i!=x)
                System.out.print(num+" + ");
            else
                System.out.print(num+" ");
        }
        System.out.println("\nLa suma es "+s);
    }
}
