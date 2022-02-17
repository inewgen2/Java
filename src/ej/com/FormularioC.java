package ej.com;
import javax.swing.*;
import java.awt.event.*;
public class FormularioC extends JFrame implements ActionListener {
    JButton boton1;
    public FormularioC() {
        setLayout(null);
        boton1 = new JButton("Cerrar");
        boton1.setBounds(300, 250, 100, 30);//(x, y, ancho, alto)
        add(boton1); //agregar el boton al formulario
        boton1.addActionListener(this);// agrega accion de escucha
    }
    public void actionPerformed(ActionEvent e) {//captura el evento y se guarda en una variable y lo guarda en memoria
        if (e.getSource() == boton1) {//getSouerce recupera el evento y compara con si esta con el boton que yo presione
            System.exit(0);// cierra la interfaz grafica.
        }
    }
    public static void main(String args[]) {
        FormularioC formulario1 = new FormularioC();
        formulario1.setBounds(0, 0, 450, 350);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}
