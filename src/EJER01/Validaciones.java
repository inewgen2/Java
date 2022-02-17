/* Se realizan validaciones de diferentes tipos de datos 
 */
package EJER01;

import java.util.Scanner;

public class Validaciones {

    public static boolean validarNombre(String nombre) {
        return nombre.matches("^([A-Z]{1}[a-z]+[ ]?){1,2}$");
        //return nombre.matches("^([A-Z]{1}[a-z]+[ ]*){1,2}$");
    }

    public static boolean validaDNI(String DNI) {
        return DNI.matches("^[0-9]{7,8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");
    }

    public static boolean esNumeroEntero(String texto) {
        return texto.matches("^-?[0-9]+$");
    }

    public static boolean esNumeroPositivo(String texto) {
        return texto.matches("^[0-9]+$");
    }

    public static boolean esNumeroNegativo(String texto) {
        return texto.matches("^-[0-9]+$");
    }

    public static boolean esDecimal(String cad) {
        boolean hayPunto = false;
        StringBuffer parteEntera = new StringBuffer();
        StringBuffer parteDecimal = new StringBuffer();
        int i = 0, posicionDelPunto;

        for (i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) == '.') //Detectar si hay un punto decimal en la cadena
            {
                hayPunto = true;
            }
        }
        if (hayPunto)//Si hay punto guardar la posicion donde se encuentra el carater punto
        {
            posicionDelPunto = cad.indexOf('.');//(si la cadena tiene varios puntos, detecta donde esta el primero).
        } else {
            return false;//Si no hay punto; no es decimal
        }
        if (posicionDelPunto == cad.length() - 1 || posicionDelPunto == 0)//Si el punto esta al final o al principio no es un decimal
        {
            return false;
        }
        for (i = 0; i < posicionDelPunto; i++) {
            parteEntera.append(cad.charAt(i));//Guardar la parte entera en una variable
        }
        for (i = 0; i < parteEntera.length(); i++) {
            if (!Character.isDigit(parteEntera.charAt(i))) //Si alguno de los caracteres de la parte entera no son digitos no es decimal
            {
                return false;
            }
        }
        for (i = posicionDelPunto + 1; i < cad.length(); i++) {
            parteDecimal.append(cad.charAt(i));                 //Guardar la parte decimal en una variable
        }
        for (i = 0; i < parteDecimal.length(); i++) {
            if (!Character.isDigit(parteDecimal.charAt(i))) //Si alguno de los caracteres de la parte decimal no es un digito no es decimal
            {
                return false;                                   //Incluye el caso en el que la cadena tenga dos o mas puntos
            }
        }
        return true;                                            //Si paso todas las pruebas anteriores, la cadena es un Numero decimal
    }

    public static int generaPositivo(String mensaje) {
        Scanner in = new Scanner(System.in);
        String val;
        int x = 0, sw = 0;
        do {
            System.out.print(mensaje);
            val = in.nextLine();
            if (val.matches("^[0-9]+$")) {
                sw = 1;
                x = Integer.parseInt(val);
            } else {
                System.out.println("NO es valido, introdusca un numero");
                sw = 0;
            }
        } while (!(sw == 1));
        return x;
    }

    public static int generaPositivo(String mensaje, int minimo, int maximo) {
        Scanner in = new Scanner(System.in);
        String val;
        int x = 0, sw = 0;
        do {
            System.out.print(mensaje);
            val = in.nextLine();
            if (val.matches("^[0-9]+$")) {
                sw = 1;
                x = Integer.parseInt(val);
            } else {
                System.out.println("NO es valido, introdusca un numero");
                sw = 0;
            }
        } while (!(sw == 1 && x >= minimo && x <= maximo));
        return x;
    }

    public static int generaNegativo(String mensaje) {
        Scanner in = new Scanner(System.in);
        String val;
        int x = 0, sw = 0;
        do {
            System.out.print(mensaje);
            val = in.nextLine();
            if (val.matches("^-[0-9]+$")) {
                sw = 1;
                x = Integer.parseInt(val);
            } else {
                System.out.println("NO es valido, introdusca un numero");
                sw = 0;
            }
        } while (!(sw == 1));
        return x;
    }

    public static int generaEntero(String mensaje) {
        Scanner in = new Scanner(System.in);
        String val;
        int x = 0, sw = 0;
        do {
            System.out.print(mensaje);
            val = in.nextLine();
            if (val.matches("^-?[0-9]+$")) {
                sw = 1;
                x = Integer.parseInt(val);
            } else {
                System.out.println("NO es valido, introdusca un numero");
                sw = 0;
            }
        } while (!(sw == 1));
        return x;
    }

    public static int generaEntero(String mensaje, int minimo, int maximo) {
        Scanner in = new Scanner(System.in);
        String val;
        int x = 0, sw = 0;
        do {
            System.out.print(mensaje);
            val = in.nextLine();
            if (val.matches("^-?[0-9]+$")) {
                sw = 1;
                x = Integer.parseInt(val);
            } else {
                System.out.println("NO es valido, introdusca un numero");
                sw = 0;
            }
        } while (!(sw == 1 && x >= minimo && x <= maximo));
        return x;
    }

    public static float generaDecimal(String mensaje) {
        boolean hayPunto = false;

        int i = 0, posicionDelPunto = 0;
        Scanner in = new Scanner(System.in);
        String cad;
        int sw;
        do {
            StringBuffer parteEntera = new StringBuffer();
            StringBuffer parteDecimal = new StringBuffer();
            hayPunto = false;
            posicionDelPunto = 0;
            System.out.print(mensaje);
            cad = in.nextLine();
            sw = 1;
            for (i = 0; i < cad.length(); i++) {
                if (cad.charAt(i) == '.') //Detectar si hay un punto decimal en la cadena
                {
                    hayPunto = true;
                }
            }
            if (hayPunto)//Si hay punto guardar la posicion donde se encuentra el carater punto
            {
                posicionDelPunto = cad.indexOf('.');//(si la cadena tiene varios puntos, detecta donde esta el primero).
            } else {
                sw = 0;//Si no hay punto; no es decimal
            }
            if (posicionDelPunto == cad.length() - 1 || posicionDelPunto == 0)//Si el punto esta al final o al principio no es un decimal
            {
                sw = 0;
            }
            for (i = 0; i < posicionDelPunto; i++) {
                parteEntera.append(cad.charAt(i));//Guardar la parte entera en una variable
            }
            for (i = 0; i < parteEntera.length(); i++) {
                if (!Character.isDigit(parteEntera.charAt(i))) //Si alguno de los caracteres de la parte entera no son digitos no es decimal
                {
                    sw = 0;
                }
            }
            for (i = posicionDelPunto + 1; i < cad.length(); i++) {
                parteDecimal.append(cad.charAt(i));                 //Guardar la parte decimal en una variable
            }
            for (i = 0; i < parteDecimal.length(); i++) {
                if (!Character.isDigit(parteDecimal.charAt(i))) //Si alguno de los caracteres de la parte decimal no es un digito no es decimal
                {
                    sw = 0;                                  //Incluye el caso en el que la cadena tenga dos o mas puntos
                }
            }
            if (sw == 0) {
                System.out.println("NO es un decimal, introdusca otro numero");
            }
            //Si paso todas las pruebas anteriores, la cadena es un Numero decimal
        } while (!(sw == 1));
        float x = Float.parseFloat(cad);
        return x;
    }

    public static void main(String[] args) {
        String[] seraDecimal = {"324.40", "324.6a", "3a4.00", "3a4", "656", "544", "23.213",
            "4g21.12", ".232", "dwe.23", "434.", "465..2ew", "45dsd34", "87,232..."};
        String[] seraNumero = {"-100", "abc", "100", "20000", "0", "100a", "a100", "1-00"};
        String[] seraDNI = {"0588387F", "F70588387", "70588387F", "70588387", "0", "12345678"};
        String[] seraNombre = {"Manuel", "Fernando", "Manuel Fernando", "manuel", "Manuel  Fernando", "M", "Ma"};
        /*
         for (String cadena1 : seraDecimal) {
         System.out.println("La cadena \"" + cadena1 + "\" es Decimal:" + esDecimal(cadena1));
         }
         for (String cadena1 : seraNumero) {
         System.out.println("La cadena \"" + cadena1 + "\" es Negativo:" + esNumeroNegativo(cadena1));
         }
         for (String cadena1 : seraNumero) {
         System.out.println("La cadena \"" + cadena1 + "\" es Positivo:" + esNumeroPositivo(cadena1));
         }
         for (String cadena1 : seraNumero) {
         System.out.println("La cadena \"" + cadena1 + "\" es Entero:" + esNumeroEntero(cadena1));
         }
         for (String cadena1 : seraDNI) {
         System.out.println("La cadena \"" + cadena1 + "\" es un DNI:" + validaDNI(cadena1));
         }
         for (String cadena1 : seraNombre) {
         System.out.println("La cadena \"" + cadena1 + "\" es Nombre:" + validarNombre(cadena1));
         }
         */
        //float val=generaDecimal("Introdusca un decimal: ");
        int val = generaPositivo("intro valor ", 1, 12);
        System.out.print(val);
    }
}
