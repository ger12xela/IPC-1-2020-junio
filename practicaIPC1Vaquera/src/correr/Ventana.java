package correr;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	
	public Ventana(String title) {
		super(title);
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}


}
