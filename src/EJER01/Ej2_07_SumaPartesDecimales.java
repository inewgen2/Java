/* 2.7) Introducir dos numeros A y B, con partes decimales, luego obtener la suma de las partes decimales.
 Si A=23.45 y B=345.765 => 0.45 + 0.765 =1.215.
 */
package EJER01;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Ej2_07_SumaPartesDecimales {

    public static void sumaParteDecimal(float a, float b) {
        a = a - (int) a;
        b = b - (int) b;
        System.out.println("valor A: " + a);
        System.out.println("valor B: " + b);
        System.out.println("La suma: " + (a + b));
    }

    public static float separaDecimal(float numero) {
        String elNumero = String.valueOf(numero);
        int parteEntera = Integer.parseInt(elNumero.substring(0, elNumero.indexOf('.')));
        float parteDecimal = Float.parseFloat(elNumero.substring(elNumero.indexOf('.')));
        int decimal_Entero = Integer.parseInt(elNumero.substring(elNumero.indexOf('.') + 1));
        System.out.println(parteEntera);
        System.out.println(parteDecimal);
        System.out.println(decimal_Entero);
        return parteDecimal;
    }

    public static BigDecimal separaDecimal2(float numero) {
        BigDecimal bd = new BigDecimal(String.valueOf(numero));
        BigDecimal iPart = new BigDecimal(bd.toBigInteger());
        BigDecimal fPart = bd.remainder(BigDecimal.ONE);
        BigDecimal fPartToInt = bd.subtract(bd.setScale(0, RoundingMode.FLOOR)).movePointRight(bd.scale());

        System.out.println("Parte Entera= " + iPart);
        System.out.println("Parte Fraccionaria= " + fPart);
        System.out.println("Fraccionaria a Entero= " + fPartToInt);
        return fPart;
    }

    public static void sumaParteDecimal2(float a, float b) {
        float parteDecimal1 = separaDecimal(a);
        float parteDecimal2 = separaDecimal(b);
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
        float parteDecimal1 = separaDecimal2(a).floatValue();
        float parteDecimal2 = separaDecimal2(b).floatValue();
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
}
