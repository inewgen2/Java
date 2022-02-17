
package ej.com;
import javax.swing.*;
import javax.swing.event.*;//para las casillas de checkBox
import java.awt.event.*;

public class FormularioO extends JFrame implements ActionListener, ChangeListener{ // mas de un evento
	private JLabel label1;
	private JCheckBox check1;
	private JButton boton1;

	public FormularioO(){
		setLayout(null);
		label1=new JLabel("Aceptar terminos y condiciones");
		label1.setBounds(10,10,400,30);
		add(label1);

		check1=new JCheckBox("Acepto");
		check1.setBounds(10,50,100,30);
		check1.addChangeListener(this);
		add(check1);

		boton1=new JButton("Continuar");
		boton1.setBounds(10,100,100,30);
		add(boton1);
		boton1.addActionListener(this);
		boton1.setEnabled(false);// para que el boton este desabilitado		
	}

	public void stateChanged(ChangeEvent e){//estado cambiado – llamado cuando el estado del listener has cambiado.
		if (check1.isSelected()==true) {
			boton1.setEnabled(true);			
		}else {
			boton1.setEnabled(false);			
		}		
	}

	public void actionPerformed(ActionEvent e){// acción reallizada 
		if(e.getSource()==boton1){
			System.exit(0);
		}
	}

	public static void main(String args[]){
		FormularioO formulario1=new FormularioO();
		formulario1.setBounds(0,0,350,200);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
	}
}
