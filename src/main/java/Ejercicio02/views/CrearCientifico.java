package Ejercicio02.views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CrearCientifico extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomApels;
	private JTextField textFieldDNI;
	private JButton btnVolver;
	private JButton btnCrear;

	/**
	 * Create the frame.
	 */
	public CrearCientifico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 311, 224);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitle = new JLabel("Crear nuevo científico");
		lblTitle.setBounds(86, 11, 150, 14);
		contentPane.add(lblTitle);

		JLabel lblNomApels = new JLabel("Nombre y Apellidos");
		lblNomApels.setBounds(161, 49, 120, 14);
		contentPane.add(lblNomApels);

		textFieldNomApels = new JTextField();
		textFieldNomApels.setBounds(161, 74, 120, 20);
		contentPane.add(textFieldNomApels);
		textFieldNomApels.setColumns(10);

		JLabel lblDNI = new JLabel("DNI");
		lblDNI.setBounds(10, 49, 46, 14);
		contentPane.add(lblDNI);

		textFieldDNI = new JTextField();
		textFieldDNI.setBounds(10, 74, 86, 20);
		contentPane.add(textFieldDNI);
		textFieldDNI.setColumns(10);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(192, 155, 89, 23);
		contentPane.add(btnVolver);

		btnCrear = new JButton("Crear");
		btnCrear.setBounds(192, 113, 89, 23);
		contentPane.add(btnCrear);
	}

	public JTextField getTextFieldNomApels() {
		return textFieldNomApels;
	}

	public void setTextFieldNomApels(JTextField textFieldNomApels) {
		this.textFieldNomApels = textFieldNomApels;
	}

	public JTextField getTextFieldDNI() {
		return textFieldDNI;
	}

	public void setTextFieldDNI(JTextField textFieldDNI) {
		this.textFieldDNI = textFieldDNI;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public JButton getBtnCrear() {
		return btnCrear;
	}
}