package ej.com;
import java.awt.Color;
import javax.swing.*;
public class Formulario extends JFrame {
    private final JLabel label1;
    public Formulario() {
        setLayout(null);//establecer diseño
        label1 = new JLabel("Esto es una prueba");
        label1.setBounds(40, 20, 150, 50);//establecer limites (x,y,ancho, alto)
        label1.setForeground(Color.red);
        label1.setBackground(Color.lightGray);
        label1.setOpaque(true);//por defecto el color es transparente esto deja mostrar el color de fondo
        add(label1);
    }
    public static void main(String args[]) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0, 0, 400, 200); //establecer limites
        formulario1.setVisible(true); //establecer visibilidad 
        formulario1.setLocationRelativeTo(null);
    }
}
