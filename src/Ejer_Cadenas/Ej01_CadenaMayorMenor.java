/*
1.  Leer una frase y encontrar la palabra de mayor longitud. El programa debe imprimir la palabra como el número de caracteres de la misma
2. Ingresar una cadena y determinar cuantas palabras se encuentran en la cadena.  Cada palabra se separa por medio de un espacio en blanco.
3. Ingresar un número telefónico en formato de cadena y luego lo convierta de la siguiente manera:
    Ej.: Número Telefónico: 5256284000 =>  Nueva Cadena: (52)-5-6284000
4. Hacer un programa que al recibir como datos dos cadenas de caracteres forme una tercera cadena intercalando los caracteres de las palabras de las cadenas recibidas.
5. Ingrese un texto e indique que letras no han aparecido en el texto.
6. Ingrese un texto e indique el porcentaje de palabras que tiene menos de 5 caracteres  y el porcentaje de palabras con 5 o más caracteres.
7. Escriba un programa que lea una frase y a continuación visualice cada palabra de la frase en columnas,  seguida del número de letras que tiene cada palabra.
8. Escriba un programa que calcule la frecuencia de aparición de las vocales de un texto porcionado por el usuario. Esta solución se debe presentar en forma de histograma, por ejmplo:
             a   15     ***************
             e    8     ********
9. Escribir un programa que cuente el número de palabras en un texto, que tengan al menos cuatro vocales diferentes. 
10. Un grupo de inteligencia militar desea codificar los mensajes secretos de tal forma que no puedan ser interpretados con una lectura directa, para lo cual han establecido las siguientes reglas:
   a) Todo mensaje debe estar sus letras en mayúsculas.
   b) Reemplazar cada letra por la que sigue según abecedario, excepto Z que  se deberá reemplazar con la letra A.
   c) reemplazar cada dígito encontrado por el siguiente numero excepto el 9 que  deberá ser reemplazado por el 0.
 */
package Ejer_Cadenas;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ej01_CadenaMayorMenor {

    public static void limpiarAnt() {
        try {
            System.out.println("Presione Enter para continual...");
            new java.util.Scanner(System.in).nextLine();

            Robot pressbot = new Robot();
            pressbot.keyPress(KeyEvent.VK_CONTROL);
            pressbot.keyPress(KeyEvent.VK_L);
            pressbot.keyRelease(KeyEvent.VK_CONTROL);
            pressbot.keyRelease(KeyEvent.VK_L);

        } catch (AWTException ex) {
            System.out.println("El Error es: " + ex.getMessage());
        }
    }

    public static void cadenaMayorMenor() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, may = 0, min = 100;
        String cadena, palabra = "", mayorCadena = null, menorCadena = null;
        System.out.println("Ingrese la cadena: ");
        cadena = br.readLine();
        cadena += "";

        for (i = 0; i < cadena.length(); i++) {//cuenta los caracteres
            palabra = palabra + cadena.charAt(i);//añade a palabra cada caracter extraido
            if (cadena.charAt(i) == ' ') {//separa mediante espacios
                if (palabra.length() - 1 > may) {
                    may = palabra.length() - 1;
                    mayorCadena = palabra.trim();//extrae la palabra sin espacios al final.
                }
                if (palabra.length() - 1 < min) {
                    min = palabra.length() - 1;
                    menorCadena = palabra.trim();
                }
                palabra = "";
            }
        }
        System.out.println("La palabra de mayor longitud es: " + mayorCadena);
        System.out.println("Su longitud es: " + may);
        System.out.println("La palabra de menor longitud es: " + menorCadena);
        System.out.println("Su longitud es: " + min);
        limpiarAnt();
    }

    public static void contarPalabras() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, con = 1;
        String cadena, palabra = "";
        System.out.println("Ingrese la cadena a evaluar: ");
        cadena = br.readLine();
        for (i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {//encuentra los espacios para determinar las palabras
                con++;//cuenta los espacios y muestra de esta manera las palabras
            }
        }
        System.out.println("La cadena contiene " + con + " palabras");
        limpiarAnt();
    }

    public static void numeroTelefonico() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i;
        String cadena, cad1 = "", cad2 = "", cad3 = "";
        System.out.println("Ingrese la cadena a evaluar: ");
        cadena = br.readLine();
        for (i = 0; i < cadena.length(); i++) {//interacion hasta completar la cantidad de caracteres introducidos
            if (i < 2) {
                cad1 = cad1 + cadena.charAt(i);//extrae caracter por caracter
            } else {
                if (i == 2) {
                    cad2 += cadena.charAt(i);//extrae caracter por caracter
                } else {
                    cad3 += cadena.charAt(i);//extrae caracter por caracter
                }
            }
        }
        System.out.println("La nueva cadena es: (" + cad1 + ")" + "-" + cad2 + "-" + cad3);
        limpiarAnt();
    }

    public static void uneDosCadenasEnTercera() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, j, k = 0;
        String cadena1, cadena2, cadena3 = "";
        System.out.println("Ingrese la primera cadena: ");
        cadena1 = br.readLine();
        System.out.println("Ingrese la segunda cadena: ");
        cadena2 = br.readLine();
        for (i = 0; i < cadena1.length(); i++) {
            cadena3 += cadena1.charAt(i);
            for (j = k; j < cadena2.length(); j++) {
                cadena3 += cadena2.charAt(j);
                j = cadena2.length();
                k++;
            }
        }
        System.out.println("La cadena intercalada es: " + cadena3);
        limpiarAnt();
    }

    public static void letrasNoHanAparecido() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ini, con = 0;
        String texto, nueva = "", mensaje = "";
        System.out.println("Ingrese el texto a evaluar:");
        texto = br.readLine();
        for (ini = 0; ini < texto.length(); ini++) {
            if (texto.charAt(ini) != ' ') {
                nueva = nueva + texto.charAt(ini);
            }
        }
        nueva = nueva.toLowerCase();
        for (char caracter = 'a'; caracter <= 'z'; caracter++) {
            for (ini = 0; ini < nueva.length(); ini++) {
                if (caracter == nueva.charAt(ini)) {
                    con++;
                }
            }
            if (con == 0) {
                mensaje += caracter + "";
            }
            con = 0;
        }
        System.out.println("\nLos caracteres que faltan son: \n" + mensaje);
        limpiarAnt();
    }

    public static void porcentajeMenorAcincoCaracteres() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i;
        double porcentaje1, porcentaje2, con = 0, p5 = 0, p6 = 0;
        String texto, palabra = "";

        System.out.println("Ingrese el texto a evaluar: ");
        texto = br.readLine();
        texto = texto + " ";
        for (i = 0; i < texto.length(); i++) {
            palabra += texto.charAt(i);
            if (texto.charAt(i) == ' ') {
                palabra = palabra.trim();
                if (palabra.length() < 5) {
                    p5++;
                } else {
                    p6++;
                }
                palabra = "";
                con++;
            }
        }

        porcentaje1 = (double) ((p5 / con) * 100);
        porcentaje2 = (double) ((p6 / con) * 100);
        System.out.println("El porcentaje de palabras con menos de 5 caracteres es: " + porcentaje1 + " %");
        System.out.println("El porcentaje de palabras con 5 o mas caracteres es: " + porcentaje2 + " %");
        limpiarAnt();
    }

    public static void visualizarCadaPalabraDeFrase() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, j;
        String frase, palabra = "", nueva = "";
        System.out.println("Ingrese la frase a evaluar:");
        frase = br.readLine();
        frase += " ";
        for (i = 0; i < frase.length(); i++) {
            palabra += frase.charAt(i);
            if (frase.charAt(i) == ' ') {
                palabra = palabra.trim();
                nueva = palabra;
                for (j = 0; j < nueva.length(); j++) {
                    System.out.println("\t" + nueva.charAt(j));
                }
                System.out.println("\t" + nueva.length() + "\n\n");
                palabra = "";

            }
        }
        limpiarAnt();
    }

    public static void frecuenciaAparicionVocales() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, c1, c2, c3, c4, c5;
        c1 = c2 = c3 = c4 = c5 = 0;
        String texto, m1 = "", m2 = "", m3 = "", m4 = "", m5 = "";
        System.out.println("Ingrese el texto a evaluar");
        texto = br.readLine();
        texto = texto.toLowerCase();
        for (i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a') {
                c1++;
                m1 += "*";
            }
            if (texto.charAt(i) == 'e') {
                c2++;
                m2 += "*";
            }
            if (texto.charAt(i) == 'i') {
                c3++;
                m3 += "*";
            }
            if (texto.charAt(i) == 'o') {
                c4++;
                m4 += "*";
            }
            if (texto.charAt(i) == 'u') {
                c5++;
                m5 += "*";
            }
        }
        System.out.println("");
        System.out.println("a" + " " + c1 + " " + m1);
        System.out.println("e" + " " + c2 + " " + m2);
        System.out.println("i" + " " + c3 + " " + m3);
        System.out.println("o" + " " + c4 + " " + m4);
        System.out.println("u" + " " + c5 + " " + m5);
        limpiarAnt();
    }

    public static void cuentaVocalesDiferentes() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i, con = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, vocales;
        String texto, palabra = "";

        System.out.println("Ingrese la palabra a evaluar: ");
        texto = br.readLine();
        texto = texto.toLowerCase();
        texto += " ";
        for (i = 0; i < texto.length(); i++) {
            palabra += texto.charAt(i);
            if (texto.charAt(i) == ' ') {
                palabra = palabra.trim();
                for (int j = 0; j < palabra.length(); j++) {
                    if (palabra.charAt(j) == 'a') {
                        c1++;
                        if (c1 > 1) {
                            c1 = 1;
                        }
                    }
                    if (palabra.charAt(j) == 'e') {
                        c2++;
                        if (c2 > 1) {
                            c2 = 1;
                        }
                    }
                    if (palabra.charAt(j) == 'i') {
                        c3++;
                        if (c3 > 1) {
                            c3 = 1;
                        }
                    }
                    if (palabra.charAt(j) == 'o') {
                        c4++;
                        if (c4 > 1) {
                            c4 = 1;
                        }
                    }
                    if (palabra.charAt(j) == 'u') {
                        c5++;
                        if (c5 > 1) {
                            c5 = 1;
                        }
                    }
                }
                vocales = c1 + c2 + c3 + c4 + c5;
                c1 = 0;
                c2 = 0;
                c3 = 0;
                c4 = 0;
                c5 = 0;
                if (vocales >= 4) {
                    con++;
                    System.out.println(con + ".- " + palabra);
                }
                palabra = "";
            }
        }
        System.out.println("Las palabras son: " + con);
        limpiarAnt();
    }

    public static void codificaMensaje() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mensaje, cod1 = "", cod2 = "", caracter;
        String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";
        System.out.println("Ingrese el mensaje");
        mensaje = br.readLine();
        System.out.println("" + mensaje);
        mensaje = mensaje.toUpperCase();
        for (int i = 0; i < mensaje.length(); i++) {
            caracter = mensaje.substring(i, i + 1);
            if (caracter.equals(" ")) {
                cod1 = cod1 + caracter;
            } else {
                for (int j = 0; j < ABC.length(); j++) {
                    if (caracter.equals(ABC.substring(j, j + 1))) {
                        if (caracter.equals("Z")) {
                            cod1 = cod1 + "A";
                            break;
                        } else {
                            cod1 = cod1 + ABC.substring(j + 1, j + 2);
                            break;
                        }
                    }
                }
                for (int k = 0; k < numeros.length(); k++) {
                    if (caracter.equals(numeros.substring(k, k + 1))) {
                        if (caracter.equals("9")) {
                            cod1 = cod1 + "0";
                            break;
                        } else {
                            cod1 = cod1 + numeros.substring(k + 1, k + 2);
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("\nMENSAJE INGRESADO: " + mensaje);
        System.out.println("CODIGO RESULTANTE: " + cod1);
        limpiarAnt();
    }

    public static void cadenaEspejo() {
        Scanner in = new Scanner(System.in);
        int i;
        String nueva = "", original;
        System.out.print("Introducir la cadena original: ");
        original = in.nextLine();
        for (i = original.length() - 1; i >= 0; i--) {
            nueva = nueva + original.charAt(i);
        }
        System.out.println("La frase espejo es: "+nueva);
        limpiarAnt();

    }

    public static void subCadena_A_Mayusculas() {
        Scanner in = new Scanner(System.in);
        String cad1;
        String cad2, subCadena;
        int posicion;
        System.out.print("Introducir la cadena original: ");
        cad1 = in.nextLine();
        System.out.print("Introducir la cadena a buscar: ");
        cad2 = in.nextLine();
        posicion = cad1.indexOf(cad2);
        if (posicion != -1) {
            subCadena = cad1.substring(posicion, posicion + cad2.length());
            System.out.println(cad1.substring(0, posicion) + subCadena.toUpperCase() + cad1.substring(posicion + cad2.length()));
        } else {
            System.out.println(cad1);
        }
        limpiarAnt();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//carga buffer para teclado
        int opcion;
        do {
            System.out.println("Menu principal");
            System.out.println("==============\n");
            System.out.println("1. Hallar la cadena mayor y menor de un texto");
            System.out.println("2. Determina cuantas palabras has en una cadena");
            System.out.println("3. Introduce un numero telefonico lo formatea");
            System.out.println("4. Hallar la cadena mayor y menor de un texto");
            System.out.println("5. Muestra los caracteres que faltan en la oracion");
            System.out.println("6. Porcentaje de caracteres menores a cinco letras");
            System.out.println("7. Visualilza palabras en columnas separadas de una frases");
            System.out.println("8. Frecuencia de vocales que estan en un oracion");
            System.out.println("9. Cuenta el numero de palabras con 4 vocales diferentes");
            System.out.println("10. Codifica mensaje");
            System.out.println("11. Reemplaza una subcadena a mayusculas");
            System.out.println("12. Cadena en forma de espejo");
            System.out.println("21. Salir del programa");
            System.out.print("\nIngrese la opcion:  ");
            opcion = Integer.parseInt(br.readLine());
            switch (opcion) {
                case 1:
                    cadenaMayorMenor();
                    break;
                case 2:
                    contarPalabras();
                    break;
                case 3:
                    numeroTelefonico();
                    break;
                case 4:
                    uneDosCadenasEnTercera();
                    break;
                case 5:
                    letrasNoHanAparecido();
                    break;
                case 6:
                    porcentajeMenorAcincoCaracteres();
                    break;
                case 7:
                    visualizarCadaPalabraDeFrase();
                    break;
                case 8:
                    frecuenciaAparicionVocales();
                    break;
                case 9:
                    cuentaVocalesDiferentes();
                    break;
                case 10:
                    codificaMensaje();
                    break;
                case 11:
                    subCadena_A_Mayusculas();
                    break;
                case 12:
                    cadenaEspejo();
                    break;
                default:
                    System.out.println("La opcion no existe intente nuevamente...");
                    limpiarAnt();
                    break;
            }
        } while (opcion != 21);//sale al presionar 11 logica inversa
    }
}
