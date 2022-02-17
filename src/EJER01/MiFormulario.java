package EJER01;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

//implements hereda de itemListener 
//extends cuando se desea atributos de una clase / interfaz
public final class MiFormulario extends JFrame implements ActionListener, ItemListener {

    //variables globales
    JButton boton1 = null, boton2 = null;
    JButton boton3 = null, boton4 = null;
    String texto = "";
    JTextField caja1, caja2;
    JTextArea areaTexto;
    JLabel label03;
    JComboBox combo1, cbo1, cbo2, cbo3;
    JLabel etiquetaSur;

    public MiFormulario() {//contructor
        setLayout(null);
        JLabel label01 = null, label02 = null;
        // datos para un label
        /* label1 = new JLabel("Esto es un label");//inserta el texto la label
         label1.setBounds(40, 20, 150, 30);//determina (x,y,ancho, alto)
         label1.setForeground(Color.red);//color de texto
         label1.setBackground(Color.lightGray);//color de fondo
         label1.setOpaque(true);//opacidad para ver el fondo         */
        //Otra forma de crear un LABEL enviando a un constructor con los parametro necesarios
        ImageIcon icon = new ImageIcon(getClass().getResource("../imagenes/uno.png"));
        ImageIcon etiquetaIcono = new ImageIcon(getClass().getResource("../imagenes/dos.png"));
        label01 = Milabel(label01, "label1", 10, 10, 150, 30, Color.CYAN, Color.BLACK);
        label02 = Milabel(label02, "label2", 10, 50, 150, 30, Color.ORANGE, Color.BLUE);
        boton1 = new JButton("Boton 1", icon);
        boton1.setBounds(10, 100, 150, 30);
        boton1.setHorizontalTextPosition(SwingConstants.CENTER);
        boton1.setVerticalTextPosition(SwingConstants.CENTER);
        add(boton1);
        boton2 = new JButton("Boton 2", etiquetaIcono);
        boton2.setBounds(200, 100, 150, 30);
        boton2.setHorizontalTextPosition(SwingConstants.CENTER);
        boton2.setVerticalTextPosition(SwingConstants.CENTER);
        add(boton2);
        boton1.addActionListener(this);
        boton2.addActionListener(this);

        etiquetaSur = new JLabel(etiquetaIcono);
        etiquetaSur.setBounds(10, 150, 150, 40);
        etiquetaSur.setText("LABEL...");
        etiquetaSur.setHorizontalTextPosition(SwingConstants.CENTER);
        etiquetaSur.setVerticalTextPosition(SwingConstants.CENTER);
        add(etiquetaSur);

        caja1 = new JTextField();
        caja1.setBounds(200, 10, 400, 30);
        add(caja1);
        caja2 = new JTextField();
        caja2.setBounds(200, 50, 400, 30);
        add(caja2);

        areaTexto = new JTextArea();
        JScrollPane scrollpane1;
        //areaTexto.setBounds(200, 150, 400, 250);
        scrollpane1 = new JScrollPane(areaTexto);
        scrollpane1.setBounds(200, 150, 400, 250);
        //add(areaTexto);
        add(scrollpane1);

        combo1 = new JComboBox();
        combo1.setBounds(10, 200, 150, 30);
        add(combo1);

        combo1.addItem("Primero");
        combo1.addItem("Segundo");
        combo1.addItem("Tercero");
        combo1.addItem("Cuarto");
        combo1.addItem("Quinto");
        combo1.addItemListener(this);

        cbo1 = new JComboBox();
        cbo1.setBounds(10, 240, 150, 30);
        cbo2 = new JComboBox();
        cbo2.setBounds(10, 280, 150, 30);
        cbo3 = new JComboBox();
        cbo3.setBounds(10, 320, 150, 30);
        add(cbo1);
        add(cbo2);
        add(cbo3);
        for (int i = 0; i <= 255; i += 10) {
            cbo1.addItem(String.valueOf(i));
            cbo2.addItem(String.valueOf(i));
            cbo3.addItem(String.valueOf(i));
        }
        boton3 = new JButton("Colocar Color");
        boton3.setBounds(10, 360, 150, 30);
        add(boton3);
        boton3.addActionListener(this);

        boton4 = new JButton("SALIR");
        boton4.setBounds(10, 410, 150, 30);
        add(boton4);
        boton4.addActionListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == combo1) {
            String seleccion = combo1.getSelectedItem().toString();
            etiquetaSur.setText(seleccion);
            etiquetaSur.setHorizontalTextPosition(SwingConstants.CENTER);
            etiquetaSur.setVerticalTextPosition(SwingConstants.CENTER);
            setTitle(seleccion);
        }
    }

    public JLabel Milabel(JLabel label1, String texto, int x, int y, int ancho, int alto, Color letra, Color fondo) {
        label1 = new JLabel(texto);//inserta el texto la label
        label1.setBounds(x, y, ancho, alto);//determina (x,y,ancho, alto)
        label1.setForeground(letra);//color de texto
        label1.setBackground(fondo);//color de fondo
        label1.setOpaque(true);//opacidad para ver el fondo
        add(label1);//agrega el objeto al Frame
        return label1;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            texto += caja1.getText() + "\n";
            areaTexto.setText(texto);
            caja1.setText("");
        }

        if (e.getSource() == boton2) {
            texto += caja2.getText() + "\n";
            areaTexto.setText(texto);
            caja2.setText("");
        }
        if (e.getSource() == boton3) {
            String cad1 = cbo1.getSelectedItem().toString();
            String cad2 = cbo2.getSelectedItem().toString();
            String cad3 = cbo3.getSelectedItem().toString();
            int rojo = Integer.parseInt(cad1);
            int verde = Integer.parseInt(cad2);
            int azul = Integer.parseInt(cad3);
            Color color1 = new Color(rojo, verde, azul);
            boton3.setBackground(color1);
            areaTexto.setBackground(color1);

        }
        if (e.getSource() == boton4) {
            //System.exit(0);
            this.dispose();
        }
    }

    public static void main(String[] args) {
        MiFormulario formulario1 = new MiFormulario();//creamos un formulario
        formulario1.setBounds(0, 0, 640, 480);//posicion y tamaño
        formulario1.setVisible(true);//visibilidad del formulario
        formulario1.setLocationRelativeTo(null);//posicion del Frame
        formulario1.setResizable(false);//puede ser escalable no
    }
}
