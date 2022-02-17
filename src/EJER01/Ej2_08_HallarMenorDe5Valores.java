/* 2.8) Dados 5 numeros V, W, X, Y, Z hallar el nemor de ellos.
 Si V=23 W=35, X=4, Y=675 y Z=287 => Menor=4.
 */
package EJER01;

public class Ej2_08_HallarMenorDe5Valores {

    public static void main(String[] args) {
        int valor1, valor2, valor3, valor4, valor5;
        valor1 = Validaciones.generaEntero("Introduce el 1er valor: ");
        valor2 = Validaciones.generaEntero("Introduce el 2do valor: ");
        valor3 = Validaciones.generaEntero("Introduce el 3er valor: ");
        valor4 = Validaciones.generaEntero("Introduce el 4to valor: ");
        valor5 = Validaciones.generaEntero("Introduce el 5to valor: ");
        int menor = valor1;
        if (valor2 < menor) {
            menor = valor2;
        } else if (valor3 < menor) {
            menor = valor3;
        } else if (valor4 < menor) {
            menor = valor4;
        } else if (valor5 < menor) {
            menor = valor5;
        }
        System.out.println("El valor minimo es: " + menor);

    }
}
