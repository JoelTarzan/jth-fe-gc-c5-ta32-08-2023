package Ejercicio02.views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;
	private JButton btnCientificos;
	private JButton btnProyectos;
	private JButton btnAsignaciones;
	private JButton btnSalir;

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 207);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitle = new JLabel("Bienvenido/a, elija una opción");
		lblTitle.setBounds(129, 11, 172, 14);
		contentPane.add(lblTitle);

		btnCientificos = new JButton("Científicos");
		btnCientificos.setBounds(10, 67, 119, 23);
		contentPane.add(btnCientificos);

		btnProyectos = new JButton("Proyectos");
		btnProyectos.setBounds(164, 67, 104, 23);
		contentPane.add(btnProyectos);

		btnAsignaciones = new JButton("Asignaciones");
		btnAsignaciones.setBounds(303, 67, 121, 23);
		contentPane.add(btnAsignaciones);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(335, 134, 89, 23);
		contentPane.add(btnSalir);
	}

	public JButton getBtnCientificos() {
		return btnCientificos;
	}

	public JButton getBtnProyectos() {
		return btnProyectos;
	}

	public JButton getBtnAsignaciones() {
		return btnAsignaciones;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}
}