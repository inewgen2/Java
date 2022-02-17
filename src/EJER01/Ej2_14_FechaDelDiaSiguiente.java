/* 2.14) Se introduce por teclado la fecha del dia en el formato D(dia), M(mes), A(año). Se pide determinar la fecha del dia siguiente.
 Si D=31, M=12 y A=1995 => mostrar D=1, M=1 y A=1996
 */
package EJER01;

public class Ej2_14_FechaDelDiaSiguiente {
    public static void calendarioDiaSiguiente(int dia, int mes, int anho){
        dia=dia+1;
        if((mes==1||mes==3||mes==5||mes==7||mes==8||mes==10)&&(dia==32)){
            mes++;
            dia=1;
        }
        if((mes==4||mes==6||mes==9||mes==10)&&(dia==31)){
            mes++;
            dia=1;
        }
        if(mes==2){
            if((dia==29)&&(anho%4!=0)){
                dia=1;
                mes++;
            }
            if((dia==30)&&(anho%4==0)){
                dia=1;
                mes++;
            }
        }
        if((mes==12)&&(dia==32)){
            mes=1;
            dia=1;
            anho++;
        }
        System.out.println("La fecha del dia siguiente es: "+dia+"/"+mes+"/"+anho);
    }

    public static void main(String[] args) {
        int _dia=Validaciones.generaPositivo("Ingrese el Dia: ", 1, 31);
        int _mes=Validaciones.generaPositivo("Ingrese el Mes: ", 1, 12);
        int _anho=Validaciones.generaPositivo("Ingrese el Año: ");
        calendarioDiaSiguiente(_dia, _mes, _anho);
    }
}
