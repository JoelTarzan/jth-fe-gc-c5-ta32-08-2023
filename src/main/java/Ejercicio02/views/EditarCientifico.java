package Ejercicio02.views;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class EditarCientifico extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomApels;
	private JButton btnVolver;
	private JButton btnEditar;
	private String dniCliente;

	/**
	 * Create the frame.
	 */
	public EditarCientifico(String[] registro) {
		this.dniCliente = registro[0];

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 282, 214);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitle = new JLabel("Editar científico");
		lblTitle.setBounds(91, 11, 115, 14);
		contentPane.add(lblTitle);

		JLabel lblNomApels = new JLabel("Nombre y Apellidos");
		lblNomApels.setBounds(87, 36, 136, 14);
		contentPane.add(lblNomApels);

		textFieldNomApels = new JTextField();
		textFieldNomApels.setText(registro[1]);
		textFieldNomApels.setBounds(91, 61, 86, 20);
		contentPane.add(textFieldNomApels);
		textFieldNomApels.setColumns(10);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(167, 142, 89, 23);
		contentPane.add(btnVolver);

		btnEditar = new JButton("Editar");
		btnEditar.setBounds(167, 96, 89, 23);
		contentPane.add(btnEditar);
	}

	public JTextField getTextFieldNomApels() {
		return textFieldNomApels;
	}

	public void setTextFieldNomApels(JTextField textFieldNomApels) {
		this.textFieldNomApels = textFieldNomApels;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public JButton getBtnEditar() {
		return btnEditar;
	}

	public String getDniCliente() {
		return dniCliente;
	}
}