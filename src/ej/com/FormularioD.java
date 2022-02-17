/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.com;
import javax.swing.*;
import java.awt.event.*;
public class FormularioD extends JFrame implements ActionListener{
	JButton boton1;
	public FormularioD(){
		setLayout(null);
		boton1=new JButton("Cerrar");
		boton1.setBounds(300,250,100,30);
		add(boton1);
		boton1.addActionListener(this);		
	}
	public void actionPerformed(ActionEvent e){//captura el evento y se guarda en una variable y lo guarda en memoria
		if(e.getSource()==boton1){//getSource recupera el evento y compara con si esta con el boton que yo presione
			System.exit(0);// cierra la interfaz grafica.
		}
	}
	public static void main(String args[]){
		FormularioC formulario1=new FormularioC();
		formulario1.setBounds(0,0,450,350);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);	
	}
}
