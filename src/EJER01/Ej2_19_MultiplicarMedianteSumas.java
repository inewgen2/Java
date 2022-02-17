/* 2.19) Hallar el producto de 2 numeros enteros positivos Ri y HO, mediante sumas sucesivas
 Ej. Si RI=32 y HO=7 => 224 
 */
package EJER01;

public class Ej2_19_MultiplicarMedianteSumas {

    public static void main(String[] args) {
        int _valor1 = Validaciones.generaPositivo("Ingrese el valor RI: ");
        int _valor2 = Validaciones.generaPositivo("Ingrese el valor HO: ");
        int c=0;
        for(int i=0;i<_valor1;i++){
            c=c+_valor2;
        }
        System.out.println("El resultado es: "+c);
    }
}
