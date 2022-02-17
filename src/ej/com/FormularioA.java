package ej.com;
import javax.swing.*;
public class FormularioA extends JFrame{	
	public FormularioA(){
		setLayout(null);// establecer diseno 
	}
	public static void main(String args[]){
		FormularioA formulario1=new FormularioA();
		formulario1.setBounds(0,0,400,550); //establecer limites(x.y.ancho, largo)
		formulario1.setVisible(true); //establecer visibilidad
		formulario1.setLocationRelativeTo(null);//establecer la ubicación ralativa a…
		formulario1.setResizable(false);// establecer redimensionable
	}
}
