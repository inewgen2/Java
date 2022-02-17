package Ejer_Cadenas;

import javax.swing.JOptionPane;

public class Pruebas2String {

    public static void palabraSecreta() {
        int intentos = 0;
        String secreta, palabra;

        secreta = JOptionPane.showInputDialog("Introduzca la palabra secreta");
        do {
            palabra = JOptionPane.showInputDialog("Intenta averiguar la palabra, intento: " + (intentos + 1));
            //Se seguirán dando oportunidades mientras que el usuario no acierte ni consuma los 3 intentos
        } while (!palabra.equalsIgnoreCase(secreta) && ++intentos < 3);
        if (intentos == 3) {
            JOptionPane.showMessageDialog(null, "Lo siento, la palabra secreta era: " + secreta);
        } else {
            JOptionPane.showMessageDialog(null, "Enhorabuena!!");
        }
    }

    static String pasaMayusculas(String cadena, String parte) {
        int posicion;
        String subcadena;

        posicion = cadena.indexOf(parte);
        if (posicion != -1) {   //Solo si el resultado de llamar a indexOf es distinto de -1 es porque la ha encontrado
            subcadena = cadena.substring(posicion, posicion + parte.length());
            //Devuelvo la nueva cadena formada por la primera parte de la cadena principal si tocar,
            //la segunda parte pasada a mayúsculas y la tercer parte sin tocar
            return cadena.substring(0, posicion) + subcadena.toUpperCase() + cadena.substring(posicion + parte.length());
        } else {
            return cadena;
        }
    }

    public static void subCadenaMayuscula() {
        String cadena1, cadena2;

        cadena1 = JOptionPane.showInputDialog("Introduzca primera cadena:");
        cadena2 = JOptionPane.showInputDialog("Introduzca segunda cadena:");
        JOptionPane.showMessageDialog(null, "Resultado: " + pasaMayusculas(cadena1, cadena2));
    }

    public static void main(String[] args) {
        //palabraSecreta();
        subCadenaMayuscula();
    }

}
