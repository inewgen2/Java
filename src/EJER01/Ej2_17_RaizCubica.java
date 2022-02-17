/* 2.17) Hallar la raiz cubica apriximada de un numero T mayor igual a cero
 Ej. Si P=345.2342 => 345
 
 */
package EJER01;

public class Ej2_17_RaizCubica {

    public static void hallarRaizCubica(int a) {
        int i = 0;
        int c;
        do {
            i++;
            c = i * i * i;
        } while (c < a);
        System.out.println("\nLa Raiz cubica aproximada es: " + (i - 1));
    }

    public static void main(String[] args) {
        int _valor1 = Validaciones.generaPositivo("Ingrese el valor: ");
        hallarRaizCubica(_valor1);
    }
}
