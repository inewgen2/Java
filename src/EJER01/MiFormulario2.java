package EJER01;
//librerias importadas
import javax.swing.*;
import java.awt.*;//para componentes de color
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
//Realizamos una herencia doble 
//implements hereda de itemListener 
//extends cuando se desea atributos de una clase / interfaz
public class MiFormulario2 extends JFrame implements ActionListener, ChangeListener {
    //Variables Globales BARRA MENU, 3 SUB MENUS, ITEMS para las opciones 
    private final JMenuBar menubar;
    private JMenu menu1, menu2, menu3, menu4;
    private JMenuItem menuitem1, menuitem2, menuitem3;
    private JMenuItem menuitem4, menuitem5, menuitem6;
    private JMenuItem menuitem7, menuitem8, menuitem9, salir;
    //Variables global label, checkbox y Boton
    private JLabel label1, labelImagen;
    private JCheckBox check1;
    private JButton boton1;
    //Variables y grupo para boton radio 
    private JRadioButton radio1, radio2, radio3;
    private ButtonGroup bg;
    //constructor 
    public MiFormulario2() {
        setLayout(null);
        menubar = new JMenuBar();
        setJMenuBar(menubar);
        //menu principal
        menu1 = new JMenu("Colores de fondo");
        menubar.add(menu1);
        //menus secundarios
        menu2 = new JMenu("Color Primarios");//submenu1
        menu1.add(menu2);
        menu3 = new JMenu("Colores Secundarios");//submenu2
        menu1.add(menu3);
        salir = new JMenuItem("Salir");//opcion salir
        menu1.add(salir);
        salir.addActionListener(this);
        //item al sub menu1
        menuitem1 = new JMenuItem("Rojo");
        menuitem1.addActionListener(this);
        menu2.add(menuitem1);
        menuitem2 = new JMenuItem("Amarillo");
        menuitem2.addActionListener(this);
        menu2.add(menuitem2);
        menuitem3 = new JMenuItem("Verde");
        menuitem3.addActionListener(this);
        menu2.add(menuitem3);
        //item al sub menu2
        menuitem4 = new JMenuItem("Azul");
        menuitem4.addActionListener(this);
        menu3.add(menuitem4);
        menuitem5 = new JMenuItem("Gris");
        menuitem5.addActionListener(this);
        menu3.add(menuitem5);
        menuitem6 = new JMenuItem("Violeta");
        menuitem6.addActionListener(this);
        menu3.add(menuitem6);
        //menu 2 
        menu4 = new JMenu("Tamaños");
        menubar.add(menu4);
        menuitem7 = new JMenuItem("640x480");
        menuitem7.addActionListener(this);
        menu4.add(menuitem7);
        menuitem8 = new JMenuItem("800x640");
        menuitem8.addActionListener(this);
        menu4.add(menuitem8);
        menuitem9 = new JMenuItem("1024x768");
        menuitem9.addActionListener(this);
        menu4.add(menuitem9);
        
        label1 = new JLabel("Aceptar terminos y condiciones para salir");
        label1.setBounds(10, 180, 400, 30);
        add(label1);
        check1 = new JCheckBox("Acepto");
        check1.setBounds(10, 210, 100, 30);
        check1.addChangeListener(this);
        add(check1);
        boton1 = new JButton("Salir");
        boton1.setBounds(180, 210, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
        boton1.setEnabled(false);

        //definimos lo botones
        bg = new ButtonGroup();//grupo de botones
        radio1 = new JRadioButton("640x480");
        radio1.setBounds(10, 10, 100, 30);
        radio1.addChangeListener(this);
        add(radio1);
        bg.add(radio1);
        
        radio2 = new JRadioButton("800x600");
        radio2.setBounds(10, 40, 100, 30);
        radio2.addChangeListener(this);
        add(radio2);
        bg.add(radio2);
        
        radio3 = new JRadioButton("1024x768");
        radio3.setBounds(10, 70, 100, 30);
        radio3.addChangeListener(this);
        add(radio3);
        bg.add(radio3);
        //definimos un label con una imagen de fondo
        labelImagen = new JLabel();
        labelImagen.setBounds(120, 10, 250, 160);
        labelImagen.setIcon(new ImageIcon(getClass().getResource("..//imagenes/uno.png")));
        labelImagen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(labelImagen);
    }

    public void stateChanged(ChangeEvent e) {//estado cambiado – llamado cuando el estado del listener has cambiado.
        if (check1.isSelected() == true) {
            boton1.setEnabled(true);
        } else {
            boton1.setEnabled(false);
        }
        if (radio1.isSelected()) {
            setSize(640, 480);
        }
        if (radio2.isSelected()) {
            setSize(800, 600);
        }
        if (radio3.isSelected()) {
            setSize(1024, 768);
        }
    }

    public void actionPerformed(ActionEvent e) {
        Container fondo = this.getContentPane();
        if (e.getSource() == menuitem1) {
            fondo.setBackground(Color.red);
        }
        if (e.getSource() == menuitem3) {
            fondo.setBackground(Color.GREEN);
        }
        if (e.getSource() == menuitem2) {
            fondo.setBackground(Color.YELLOW);
        }
        if (e.getSource() == menuitem4) {
            fondo.setBackground(Color.BLUE);
        }
        if (e.getSource() == menuitem5) {
            fondo.setBackground(Color.GRAY);
        }
        if (e.getSource() == menuitem6) {
            fondo.setBackground(Color.MAGENTA);
        }
        if (e.getSource() == menuitem7) {
            setSize(640, 480);
        }
        if (e.getSource() == menuitem8) {
            setSize(800, 640);
        }
        if (e.getSource() == menuitem9) {
            setSize(1024, 768);
        }
        if (e.getSource() == salir) {
            System.exit(0);
        }
        if (e.getSource() == boton1) {
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        MiFormulario2 formulario1 = new MiFormulario2();
        formulario1.setBounds(0, 0, 400, 300);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}
