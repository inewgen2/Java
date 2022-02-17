/* 2.9) Leer los valores de variables X,Y,Z, calcular T en las siguientes condiciones:
 Si V=23 W=35, X=4, Y=675 y Z=287 => Menor=4.
 */
package EJER01;

public class Ej2_09_CalcularT {

    public static void calculaT(int x, int y, int z) {
        int t;
        if (x < 0) {
            t = (-x) * (-y) * z;
            System.out.println("t = (-x) * (-y) * (z)");
            System.out.println(t + " = (-" + x + ") * (-" + y + ") * (" + z + ")");
        }
        if (0 < x && x < 10) {
            if (y < 0) {
                if (z - y > 100) {
                    t = x * (-y) * (-z);
                    System.out.println("t = (x) * (-y) * (-z)");
                    System.out.println(t + " = (" + x + ") * (-" + y + ") * (-" + z + ")");
                } else {
                    t = x * (y) * (-z);
                    System.out.println("t = (x) * (y) * (-z)");
                    System.out.println(t + " = (" + x + ") * (" + y + ") * (-" + z + ")");
                }
            } else {
                t = x * (y) * (-3 * z);
                System.out.println("t = (x) * (y) * (-3z)");
                System.out.println(t + " = (" + x + ") * (" + y + ") * (-" + (3 * z) + ")");
            }
        }
        if (10 < x && x < 100) {
            if (y > 10) {
                if (3 * z >= 50) {
                    t = 2 * x * (-y) * (-3 * z);
                    System.out.println("t = (2*x) * (-y) * (-3*z)");
                    System.out.println(t + " = (" + (2 * x) + ") * (-" + y + ") * (-" + (3 * z) + ")");
                } else {
                    t = 2 * x * (-y) * (3 * z);
                    System.out.println("t = (2*x) * (-y) * (3*z)");
                    System.out.println(t + " = (" + (2 * x) + ") * (-" + y + ") * (" + (3 * z) + ")");
                }
            } else {
                if (4 + y - z >= y - z) {
                    t = x * (-2 * y) * (-z);
                    System.out.println("t = (x) * (-2*y) * (-z)");
                    System.out.println(t + " = (" + (x) + ") * (-" + (2 * y) + ") * (-" + (z) + ")");
                } else {
                    t = x * (-y) * (-2 * z);
                    System.out.println("t = (x) * (-y) * (-2*z)");
                    System.out.println(t + " = (" + (x) + ") * (-" + y + ") * (-" + (2 * z) + ")");
                }
            }
        }
        if (x > 100) {
            t = x * (-y) * (z);
            System.out.println("t = (x) * (-y) * (z)");
            System.out.println(t + " = (" + (x) + ") * (-" + y + ") * (" + (z) + ")");
        }
    }

    public static void main(String[] args) {
        int valor1, valor2, valor3;
        valor1 = Validaciones.generaEntero("Introduce el valor de X: ");
        valor2 = Validaciones.generaEntero("Introduce el valor de Y: ");
        valor3 = Validaciones.generaEntero("Introduce el valor de Z: ");
        calculaT(valor1, valor2, valor3);
    }
}
