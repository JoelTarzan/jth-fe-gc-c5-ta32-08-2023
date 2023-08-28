package Ejercicio01.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;
	private JButton btnClientes;
	private JButton btnVideos;
	private JButton btnSalir;

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 165);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Bienvenido/a, elija una opción");
		lblTitle.setBounds(129, 11, 172, 14);
		contentPane.add(lblTitle);
		
		btnClientes = new JButton("Clientes");
		btnClientes.setBounds(37, 67, 89, 23);
		contentPane.add(btnClientes);
		
		btnVideos = new JButton("Vídeos");
		btnVideos.setBounds(170, 67, 89, 23);
		contentPane.add(btnVideos);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(303, 67, 89, 23);
		contentPane.add(btnSalir);
				
	}

	public JButton getBtnClientes() {
		return btnClientes;
	}

	public JButton getBtnVideos() {
		return btnVideos;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}
}