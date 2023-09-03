package Ejercicio02.views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuProyectos extends JFrame {

	private JPanel contentPane;
	private JButton btnListar;
	private JButton btnCrear;
	private JButton btnEditar;
	private JButton btnEliminar;
	private JButton btnVolver;

	/**
	 * Create the frame.
	 */
	public MenuProyectos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 160);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitle = new JLabel("Proyectos");
		lblTitle.setBounds(187, 11, 78, 14);
		contentPane.add(lblTitle);

		btnListar = new JButton("Listar");
		btnListar.setBounds(10, 41, 89, 23);
		contentPane.add(btnListar);

		btnCrear = new JButton("Crear");
		btnCrear.setBounds(119, 41, 89, 23);
		contentPane.add(btnCrear);

		btnEditar = new JButton("Editar");
		btnEditar.setBounds(228, 41, 89, 23);
		contentPane.add(btnEditar);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(335, 41, 89, 23);
		contentPane.add(btnEliminar);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(335, 90, 89, 23);
		contentPane.add(btnVolver);
	}

	public JButton getBtnListar() {
		return btnListar;
	}

	public JButton getBtnCrear() {
		return btnCrear;
	}

	public JButton getBtnEditar() {
		return btnEditar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}
}