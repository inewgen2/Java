/* 2.30) Dado un lote de N numeros enteros rotar todos los digitos de cada numero hacia la derecha y averiguar cuantos primos hay en la rotacion de cada numero. Desplegar el numero y los primos de sus rotaciones
 Si N=3 =>  124         231         25 => 
 412         123         52
 124         231         --
 ---         ---         0 primos
 1 primo     0 primos
 */
package EJER01;

public class Ej2_30_RotarLosDigitos {

    private static void rotarNumero(int n) {
        int aux, primo = 0, sw = 0;
        for (int i = 0; i < n; i++) {
            int valorK = Validaciones.generaPositivo("Introducir un valor: ");
            aux = valorK;
            primo = 0;
            sw = 0;
            while ((aux != valorK) || (sw == 0)) {
                System.out.println(" " + aux);
                sw = 1;
                if (Operaciones.esPrimo(aux)) {
                    System.out.println("Es primo: " + aux);
                    primo++;
                }
                aux = rotar(aux);
                //System.out.println(aux);
            }
            System.out.println("El numero: " + valorK + " tiene: " + primo + " numeros primos");
        }
    }

    public static int rotar(int n) {
        int aux = 0, c = 1, dig, dig2;
        dig = n % 10;
        n /= 10;
        while (n != 0) {
            dig2 = n % 10;
            n /= 10;
            aux = aux + c * dig2;
            c *= 10;
        }
        aux = aux + dig * c;
        return aux;
    }

    public static void main(String[] args) {
        int _valor1 = Validaciones.generaPositivo("Cuantos numeros desea ingresar: ");
        rotarNumero(_valor1);
    }
}
