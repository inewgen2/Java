/* 2.11) Dados 3 angulos A, B, C determinar si forman un triangulo y si es asi verificar que tipo de triangulo forman (Equilatero, Isoceles, Escaleno).
 Equilatero 3 lados iguales
 Isoceles 2 lados iguales
 Escaleno 3 lados desiguales.
 */
package EJER01;

public class Ej2_11_EsTrianguloYtipo {

    public static boolean verificaTriangulo(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                if (b > c) {
                    //System.out.println("\nEl Mayor= " + a + ", Central= " + b + ", Menor= " + c);
                    return a < (b + c);
                } else {
                    //System.out.println("\nEl Mayor= " + a + ", Central= " + c + ", Menor= " + b);
                    return a < (c + b);
                }
            } else {
                //System.out.println("\nEl Mayor= " + c + ", Central= " + a + ", Menor= " + a);
                return c < (b + a);
            }
        } else {
            if (b > c) {
                if (c > a) {
                    //System.out.println("\nEl Mayor= " + b + ", Central= " + c + ", Menor= " + a);
                    return b < (c + a);
                } else {
                    //System.out.println("\nEl Mayor= " + b + ", Central= " + a + ", Menor= " + c);
                    return b < (a + c);
                }
            } else {
                //System.out.println("\nEl Mayor= " + c + ", Central= " + b + ", Menor= " + a);
                return c < (b + a);
            }
        }
    }

    public static void calculaTriangulo(int ladoA, int ladoB, int ladoC) {
        if (ladoA == ladoB && ladoA == ladoC) {
            System.out.println("Es un triangulo EQUILATERO");
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            System.out.println("Es un triangulo ISOCELES");
        } else {
            System.out.println("Es un triangulo ESCALENO");
        }
    }

    public static void main(String[] args) {
        int valor1 = Validaciones.generaPositivo("Introduce el valor del Lado A: ");
        int valor2 = Validaciones.generaPositivo("Introduce el valor del Lado B: ");
        int valor3 = Validaciones.generaPositivo("Introduce el valor del Lado C: ");
        if (verificaTriangulo(valor1, valor2, valor3)) {
            calculaTriangulo(valor1, valor2, valor3);
        } else {
            System.out.println("Los datos ingresados no forman un Triangulo");
        }
    }
}
