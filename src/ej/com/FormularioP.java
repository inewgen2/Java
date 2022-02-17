
package ej.com;
import javax.swing.*;
import javax.swing.event.*;//para las casillas de checkBox
import java.awt.event.*;

public class FormularioP extends JFrame implements  ChangeListener{ // mas de un evento
	private JRadioButton radio1, radio2, radio3;
	private ButtonGroup bg;

	public FormularioP(){
		setLayout(null);
		bg=new ButtonGroup();

		radio1=new JRadioButton("640x480");
		radio1.setBounds(10,20,100,30);
		radio1.addChangeListener(this);
		add(radio1);
		bg.add(radio1);

		radio2=new JRadioButton("800x600");
		radio2.setBounds(10,70,100,30);
		radio2.addChangeListener(this);
		add(radio2);
		bg.add(radio2);

		radio3=new JRadioButton("1024x768");
		radio3.setBounds(10,120,100,30);
		add(radio3);
		bg.add(radio3);
	}

	public void stateChanged(ChangeEvent e){
		if (radio1.isSelected()) {
			setSize(640,480);
		}
		if (radio2.isSelected()) {
			setSize(800,600);	
		}
		if (radio3.isSelected()) {
			setSize(1024,768);
		}
	}
	public static void main(String args[]){
		FormularioP formulario1=new FormularioP();
		formulario1.setBounds(0,0,350,200);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
	}
}

