package ej.com;
import javax.swing.*;
public class FormularioF extends JFrame{
	private JTextField textfield1;
	private JTextArea textarea1;
	public FormularioF(){
		setLayout(null);//establecer diseño
		textfield1=new JTextField();//campo de texto
		textfield1.setBounds(10,10,200,30);
		add(textfield1);
		textarea1=new JTextArea();//area de texto
		textarea1.setBounds(10, 50, 400, 300);
		add(textarea1);
	}
	public static void main(String[] args) {
		FormularioF formulario1=new FormularioF();
		formulario1.setBounds(0,0,540,400);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
	}
}

