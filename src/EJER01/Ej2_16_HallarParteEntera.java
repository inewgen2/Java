/* 2.16) Dado un numero P se desea encontrar la parte entera (sin utilizar la funcion INT).
Ej. Si P=345.2342 => 345
 
 */
package EJER01;

public class Ej2_16_HallarParteEntera {

    public static void hallarParteEntera(float a) {
        float val=Operaciones.separaDecimal(a, 1);
        System.out.println("\nLa Parte entera es: " + val);
    }

    public static void main(String[] args) {
    float _valor1 = Validaciones.generaDecimal("Ingrese el valor A: ");
        hallarParteEntera(_valor1);   
    }
}
