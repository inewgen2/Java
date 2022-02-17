/* 2.10) Deducir el numero de dias de un mes M correspondiente a un año A en funcion del numero que le corresponde dentro del calendario es decir:
1=Enero             5=Mayo          9=Septiembre
2=Febrero           6=Junio         10=Octrubre
3=Marzo             7=Julio         11=Noviembre
4=Abril             8=Agosto        12=Diciembre
 */
package EJER01;

public class Ej2_10_DiasDelMesPorAnho {

    public static void calculaMes(int anho, int mes) {
       switch(mes){
           case 1:
               System.out.println("El mes es Enero y tiene 31 dias");
               break;
           case 2:
               if(anho%4==0)
                   System.out.println("El mes es Febrero Biciesto y tiene 29 dias");
               else
                   System.out.println("El mes es Febrero y tiene 28 dias");
               break;
           case 3:
               System.out.println("El mes es Marzo y tiene 31 dias");
               break;
           case 4:
               System.out.println("El mes es Abril y tiene 30 dias");
               break;
           case 5:
               System.out.println("El mes es Mayo y tiene 31 dias");
               break;
           case 6:
               System.out.println("El mes es Junio y tiene 30 dias");
               break;
           case 7:
               System.out.println("El mes es Julio y tiene 31 dias");
               break;
           case 8:
               System.out.println("El mes es Agosto y tiene 31 dias");
               break;
           case 9:
               System.out.println("El mes es Septiembre y tiene 30 dias");
               break;
           case 10:
               System.out.println("El mes es Octubre y tiene 31 dias");
               break;
           case 11:
               System.out.println("El mes es Noviembre y tiene 30 dias");
               break;
           case 12:
               System.out.println("El mes es Diciembre y tiene 31 dias");
               break;
       }       
    }

    public static void main(String[] args) {
        int valor1, valor2;        
        valor1 = Validaciones.generaPositivo("Introduce el valor de Año: ");
        valor2 = Validaciones.generaPositivo("Introduce el valor de Mes: ",1,12);
        calculaMes(valor1, valor2);
    }
}
