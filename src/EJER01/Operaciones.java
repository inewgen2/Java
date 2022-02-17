/* 2.7) Introducir dos numeros A y B, con partes decimales, luego obtener la suma de las partes decimales.
 Si A=23.45 y B=345.765 => 0.45 + 0.765 =1.215.
 */
package EJER01;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Operaciones {

    public static void mostrar(String val, int valor) {
        System.out.println(val + " = " + valor);
    }

    public static void mostrar(String val, float valor) {
        System.out.println(val + " = " + valor);
    }

    public static void sumaParteDecimal(float a, float b) {
        a = a - (int) a;
        b = b - (int) b;
        System.out.println("valor A: " + a);
        System.out.println("valor B: " + b);
        System.out.println("La suma: " + (a + b));
    }

    public static float separaDecimal(float numero, int parte) {
        String elNumero = String.valueOf(numero);
        int parteEntera = Integer.parseInt(elNumero.substring(0, elNumero.indexOf('.')));
        float parteDecimal = Float.parseFloat(elNumero.substring(elNumero.indexOf('.')));
        int decimal_Entero = Integer.parseInt(elNumero.substring(elNumero.indexOf('.') + 1));
        if (parte == 1) {
            System.out.println(parteEntera);
            return parteEntera;
        } else if (parte == 2) {
            System.out.println(parteDecimal);
            return parteDecimal;
        } else if (parte == 3) {
            System.out.println(decimal_Entero);
            return decimal_Entero;
        } else {
            return 0;
        }

    }

    public static BigDecimal separaDecimal2(float numero, int parte) {
        BigDecimal bd = new BigDecimal(String.valueOf(numero));
        BigDecimal iPart = new BigDecimal(bd.toBigInteger());
        BigDecimal fPart = bd.remainder(BigDecimal.ONE);
        BigDecimal fPartToInt = bd.subtract(bd.setScale(0, RoundingMode.FLOOR)).movePointRight(bd.scale());
        if (parte == 1) {
            System.out.println("Parte Entera= " + iPart);
            return iPart;
        } else if (parte == 2) {
            System.out.println("Parte Fraccionaria= " + fPart);
            return fPart;
        } else if (parte == 3) {
            System.out.println("Fraccionaria a Entero= " + fPartToInt);
            return fPartToInt;
        } else {
            return null;
        }
    }

    public static void sumaParteDecimal2(float a, float b) {
        float parteDecimal1 = separaDecimal(a, 2);
        float parteDecimal2 = separaDecimal(b, 2);
        System.out.println("valor A: " + parteDecimal1);
        System.out.println("valor B: " + parteDecimal2);
        System.out.println("La suma: " + (parteDecimal1 + parteDecimal2));
    }

    public static void sumaParteDecimal1(float a, float b) {
        long parteEntera1 = (long) a;
        long parteEntera2 = (long) b;
        DecimalFormat df = new DecimalFormat("0.000");
        float parteDecimal1 = a - parteEntera1;
        float parteDecimal2 = b - parteEntera2;
        System.out.println("valor A: " + parteDecimal1);
        System.out.println("valor B: " + parteDecimal2);
        System.out.println("La suma: " + df.format(parteDecimal1 + parteDecimal2));
    }

    public static void sumaParteDecimal3(float a, float b) {
        float parteDecimal1 = separaDecimal2(a, 2).floatValue();
        float parteDecimal2 = separaDecimal2(b, 2).floatValue();
        System.out.println("valor A: " + parteDecimal1);
        System.out.println("valor B: " + parteDecimal2);
        System.out.println("La suma: " + (parteDecimal1 + parteDecimal2));
    }

    public static void main(String[] args) {
        float valor1, valor2;
        valor1 = Validaciones.generaDecimal("Introduce el primer valor: ");
        valor2 = Validaciones.generaDecimal("Introduce el segundo valor: ");
        System.out.println("METODO 1");
        sumaParteDecimal(valor1, valor2);
        System.out.println("METODO 2");
        sumaParteDecimal1(valor1, valor2);
        System.out.println("METODO 3");
        sumaParteDecimal2(valor1, valor2);
        System.out.println("METODO 4");
        sumaParteDecimal3(valor1, valor2);
    }

    public static boolean esPrimo(int numprim) {
        int contDiv = 0;
        for (int i = 1; i <= numprim; i++) {
            if (numprim % i == 0) {
                contDiv++;
            }
        }
        return contDiv == 2;
    }

    public static boolean esPerfecto(int n) {
        int c = 0;
        if (n != 0) {
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    c = c + i;
                }
            }
            return c == n;
        } else {
            return false;
        }
    }

    public static boolean sonDigitosDiferentes(int numero) {
        int aux, aux2, sw, dig, dig2;
        aux2 = numero;
        sw = 1;
        while ((aux2 != 0) && (sw == 1)) {
            dig = aux2 % 10;
            aux2 /= 10;
            aux = aux2;
            while ((aux != 0) && (sw == 1)) {
                dig2 = aux % 10;
                aux /= 10;
                if (dig == dig2) {
                    sw = 0;
                }
            }
        }
        return sw == 1;
    }
     public static int factorial(int num) {
        int aux=1;
        for (int i = 1; i <= num; i++) {
            aux = aux * i;
        }
        return aux;
    }
}
