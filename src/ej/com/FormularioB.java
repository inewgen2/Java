package ej.com;
import java.awt.Color;
import javax.swing.*;
public class FormularioB extends JFrame{
	private JLabel label1;
	private JLabel label2;
	public FormularioB(){
		setLayout(null); //colocar elementos con coordenadas
		label1=new JLabel("Interfaz grafica");
                label1.setForeground(Color.white);
		label1.setBounds(10,20,300,30);
                label1.setBackground(Color.red);
                label1.setOpaque(true);
		add(label1);
		label2=new JLabel("Version 1.0");
		label2.setBounds(10,100,100,30);
                label2.setBackground(Color.green);
                label2.setOpaque(true);
		add(label2);
	}
	public static void main(String args[]){
		FormularioB formulario1 = new FormularioB();
		formulario1.setBounds(0,0,300,200);
		formulario1.setResizable(false);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null);		
	}
}

