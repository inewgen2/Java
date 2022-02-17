/* 2.12) Resolver la ecyuacion de segundo grado Ax^2+Bx+c=0 contemplando todas las souciones posibles
 B^2-4AC > 0 Raices distintas
 B^2-4AC = 0 Raices Iguales
 B^2-4AC < 0 Raices Imaginarias
 */
package EJER01;

public class Ej2_12_Ecuacion2grado {

    public static void resuelveEcuacion(int a, int b, int c) {
        int aux = (int) Math.pow(b, 2);
        aux = aux - (4 * a * c);
        if (aux > 0) {
            float x1 = (float) (-b + Math.sqrt(aux)) / (2 * a);
            float x2 = (float) (-b - Math.sqrt(aux)) / (2 * a);
            System.out.println("Las raices son distintas");
            System.out.println("Raiz X1: " + x1);
            System.out.println("Raiz X2: " + x2);
        } else if (aux == 0) {
            float x1 = (float) (-b + Math.sqrt(aux)) / (2 * a);
            System.out.println("Las raices son iguales");
            System.out.println("Raiz X: " + x1);
        }else if(aux<0){
            System.out.println("Las raices son imaginarias");
        }
    }

    public static void main(String[] args) {
        int valor1 = Validaciones.generaEntero("Introduce el valor del Lado A: ");
        int valor2 = Validaciones.generaEntero("Introduce el valor del Lado B: ");
        int valor3 = Validaciones.generaEntero("Introduce el valor del Lado C: ");
        resuelveEcuacion(valor1, valor2, valor3);
    }
}
