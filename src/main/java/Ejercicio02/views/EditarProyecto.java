package Ejercicio02.views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EditarProyecto extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JButton btnVolver;
	private JButton btnEditar;
	private String idProyecto;
	private int horas;

	/**
	 * Create the frame.
	 */
	public EditarProyecto(String[] registro) {
		this.idProyecto = registro[0];
		this.horas = Integer.parseInt(registro[2]);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 259, 217);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitle = new JLabel("Editar proyecto");
		lblTitle.setBounds(81, 11, 115, 14);
		contentPane.add(lblTitle);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 36, 80, 14);
		contentPane.add(lblNombre);

		textFieldNombre = new JTextField();
		textFieldNombre.setText(registro[1]);
		textFieldNombre.setBounds(10, 61, 86, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(143, 148, 89, 23);
		contentPane.add(btnVolver);

		btnEditar = new JButton("Editar");
		btnEditar.setBounds(143, 106, 89, 23);
		contentPane.add(btnEditar);

		JLabel lblHoras = new JLabel("Horas");
		lblHoras.setBounds(143, 36, 60, 14);
		contentPane.add(lblHoras);

		JSpinner spinnerHoras = new JSpinner();
		spinnerHoras.setBounds(143, 61, 89, 20);
		contentPane.add(spinnerHoras);
		
		spinnerHoras.setValue(horas);

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

	public String getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(String idProyecto) {
		this.idProyecto = idProyecto;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public JButton getBtnEditar() {
		return btnEditar;
	}
}