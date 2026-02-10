package ventana;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MiPanel extends JPanel {
	public MiPanel() {
		setLayout(null);
		setBackground(Color.BLUE);
		setSize(100, 100);
		setBounds(50, 50, 50, 50);
		JButton boton = new JButton("Mi boton");
		boton.setBounds(100, 100, 100, 50);
		boton.setBackground(Color.RED);
		add(boton);
	}
}
