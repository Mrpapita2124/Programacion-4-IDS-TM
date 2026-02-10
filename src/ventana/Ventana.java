package ventana;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame {
	public Ventana() {
		setSize(1000,1000); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocation(100,100); 
		
		
		setResizable(false);
		
		setTitle("Mi Aplicación");
		//Coloca la ventana al centro de la pantalla
		setLocationRelativeTo(null);
		MiPanel panel=new MiPanel();
		add(panel);
		
		setVisible(true); //Establece visibilidad
	}

}
