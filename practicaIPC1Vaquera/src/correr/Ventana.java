package correr;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import usuarios.ListaUsuarios;

public class Ventana extends JFrame {
	
	ListaUsuarios usuarios;

	public Ventana(String title) {
		super(title);
		
		usuarios = new ListaUsuarios();
		
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		setLayout(null);
		
		usuarios.addUsuario("Gerson");
		usuarios.addUsuario("Bertito");
		usuarios.addUsuario("Carlos");
		usuarios.addUsuario("pedrito");
		
		JTextArea textarea1 = new JTextArea();
		textarea1.setBounds(10,50,400,300);
		add(textarea1);
		
		textarea1.setText(usuarios.getListaUsuarios());
	}


}
