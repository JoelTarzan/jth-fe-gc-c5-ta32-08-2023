package Ejercicio02.views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JSpinner;

public class CrearProyecto extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private int horas = 0;
	private JButton btnVolver;
	private JButton btnCrear;
	private JTextField textFieldId;

	/**
	 * Create the frame.
	 */
	public CrearProyecto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 384, 237);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitle = new JLabel("Crear nuevo proyecto");
		lblTitle.setBounds(121, 11, 150, 14);
		contentPane.add(lblTitle);

		JLabel lblHoras = new JLabel("Horas");
		lblHoras.setBounds(266, 49, 60, 14);
		contentPane.add(lblHoras);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(138, 49, 46, 14);
		contentPane.add(lblNombre);

		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(138, 74, 86, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(266, 164, 89, 23);
		contentPane.add(btnVolver);

		btnCrear = new JButton("Crear");
		btnCrear.setBounds(266, 115, 89, 23);
		contentPane.add(btnCrear);

		JSpinner spinnerHoras = new JSpinner();
		spinnerHoras.setBounds(266, 74, 89, 20);
		contentPane.add(spinnerHoras);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(10, 49, 46, 14);
		contentPane.add(lblId);
		
		textFieldId = new JTextField();
		textFieldId.setBounds(10, 74, 86, 20);
		contentPane.add(textFieldId);
		textFieldId.setColumns(10);

		spinnerHoras.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				horas = (int) spinnerHoras.getValue();		
			}
		});
	}

	public JTextField getTextFieldNombre() {
		return textFieldNombre;
	}

	public void setTextFieldNombre(JTextField textFieldNombre) {
		this.textFieldNombre = textFieldNombre;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public JButton getBtnCrear() {
		return btnCrear;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public JTextField getTextFieldId() {
		return textFieldId;
	}

	public void setTextFieldId(JTextField textFieldId) {
		this.textFieldId = textFieldId;
	}
}