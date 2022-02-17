package ej.com;
import javax.swing.*;
import java.awt.event.*;
public class FormularioE extends JFrame implements ActionListener {
    private JTextField textfield1;
    private JLabel label1;
    private JButton boton1;
    public FormularioE() {
        setLayout(null);
        label1 = new JLabel("Usuario:");
        label1.setBounds(10, 10, 100, 30);
        add(label1);
        textfield1 = new JTextField();
        textfield1.setBounds(120, 17, 150, 20);
        add(textfield1);
        boton1 = new JButton("Aceptar");
        boton1.setBounds(10, 80, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {//captura la ultima accion 
        if (e.getSource() == boton1) {
            String texto = textfield1.getText();//obtener el texto de algun componente
            setTitle(texto);//inserta el titulo al cuadro
        }
    }
    public static void main(String args[]) {
        FormularioE formulario1 = new FormularioE();
        formulario1.setBounds(0, 0, 300, 150);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}
