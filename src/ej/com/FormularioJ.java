
package ej.com;
import javax.swing.*;
import java.awt.event.*;

public class FormularioJ extends JFrame implements ItemListener{
	private JComboBox combo1;

	public FormularioJ(){
		setLayout(null);
		combo1= new JComboBox();
		combo1.setBounds(10,10,80,20);
		add(combo1);

		combo1.addItem("Rojo");
		combo1.addItem("Verde");
		combo1.addItem("Azul");
		combo1.addItem("Amarillo");
		combo1.addItem("Negro");
		combo1.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent e){
		if(e.getSource()==combo1){
			String seleccion=combo1.getSelectedItem().toString();
			setTitle(seleccion);
		}
	}

	public static void main(String args[]){
		FormularioJ formulario1=new FormularioJ();
		formulario1.setBounds(0,0,200,150);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
	}
}
