package ej.com;
import javax.swing.*;
public class FormularioG extends JFrame{
	private JTextField textfield1;
	private JScrollPane scrollpane1;
	private JTextArea textarea1;
	public FormularioG(){
		setLayout(null);
		textfield1=new JTextField();
		textfield1.setBounds(10,10,200,30);
		add(textfield1);
		textarea1=new JTextArea();
		scrollpane1 = new JScrollPane(textarea1);// se inserta el textarea dentro del scroll
		scrollpane1.setBounds(10,50,400,300);
		add(scrollpane1);
	}
	public static void main(String[] args) {
		FormularioG formulario1=new FormularioG();
		formulario1.setBounds(0,0,540,400);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
	}
}

