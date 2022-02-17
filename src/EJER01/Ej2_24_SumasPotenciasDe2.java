/* 2.24) Representar cualquier numero entero positivo M mediante sumas de potencias de 2
 Ej. Si N=15  => 15= 2^3 + 2^2 + 2^1 + 2^0
 */
package EJER01;

public class Ej2_24_SumasPotenciasDe2 {

    public static void potenciasDeDos(int numero) {
        int acum=0, aux=numero, dig, c=1;
        while(aux!=0){
            dig=aux%2;
            aux=aux/2;
            acum=dig*c+acum;
            c=c*10;
        }
        Operaciones.mostrar("acum", acum);
        aux=0;
        int p=0;
        while(acum!=0){
            dig=acum%10;
            if(dig!=0){
                aux= (int) (Math.pow(2, p)+aux);
                System.out.println("2^"+p+" = "+((int)Math.pow(2, p)));
            }
            p++;
            acum /=10;
        }
        System.out.println("=========\n      " + aux);
    }

    public static void main(String[] args) {
        int _valor1 = Validaciones.generaPositivo("Ingrese el valor M: ");
        potenciasDeDos(_valor1);
    }
}
