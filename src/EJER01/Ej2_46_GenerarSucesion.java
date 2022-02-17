/*2.46) Generar la siguiente sucesion para N terminos.
 2, 1, 0, 6, 5, 4, 12, 11, 10, 20, 19, 18, ...
 */
package EJER01;

public class Ej2_46_GenerarSucesion {

    private static void generaSucesion(int val) {
        int i = 1, ini = 2, ingre = 4, sig = 0, cont;
        while (i <= val) {
            //i++;
            cont = 1;
            sig = ini + ingre;
            while ((i <= val) && (cont <= 3)) {
                cont++;
                if (i != val) {
                    System.out.print(ini + ", ");
                } else {
                    System.out.print(ini + "\n");
                }
                ini = ini - 1;
                i++;
            }
            ingre = ingre + 2;
            ini = sig;
        }
    }

    public static void main(String args[]) {
        int valorN = Validaciones.generaPositivo("Intrudusca la cantidad de numeros: ");
        generaSucesion(valorN);
    }
}
