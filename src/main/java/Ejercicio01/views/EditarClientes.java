package Ejercicio01.views;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class EditarClientes extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldDireccion;
	private JTextField textFieldDNI;
	private JTextField textFieldFecha;
	private JButton btnVolver;
	private JButton btnEditar;
	private String idCliente;

	/**
	 * Create the frame.
	 */
	public EditarClientes(String[] registro) {
		this.idCliente = registro[0];
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Editar cliente");
		lblTitle.setBounds(174, 11, 97, 14);
		contentPane.add(lblTitle);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 49, 71, 14);
		contentPane.add(lblNombre);

		textFieldNombre = new JTextField();
		textFieldNombre.setText(registro[1]);
		textFieldNombre.setBounds(10, 74, 86, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(161, 49, 63, 14);
		contentPane.add(lblApellido);

		textFieldApellido = new JTextField();
		textFieldApellido.setText(registro[2]);
		textFieldApellido.setBounds(161, 74, 86, 20);
		contentPane.add(textFieldApellido);
		textFieldApellido.setColumns(10);

		JLabel lblDireccion = new JLabel("Dirección");
		lblDireccion.setBounds(318, 49, 63, 14);
		contentPane.add(lblDireccion);

		textFieldDireccion = new JTextField();
		textFieldDireccion.setText(registro[3]);
		textFieldDireccion.setBounds(318, 74, 86, 20);
		contentPane.add(textFieldDireccion);
		textFieldDireccion.setColumns(10);

		JLabel lblDNI = new JLabel("DNI");
		lblDNI.setBounds(10, 133, 46, 14);
		contentPane.add(lblDNI);

		textFieldDNI = new JTextField();
		textFieldDNI.setText(registro[4]);
		textFieldDNI.setBounds(10, 158, 86, 20);
		contentPane.add(textFieldDNI);
		textFieldDNI.setColumns(10);

		JLabel lblNewFecha = new JLabel("Fecha Reg.");
		lblNewFecha.setBounds(161, 133, 71, 14);
		contentPane.add(lblNewFecha);

		textFieldFecha = new JTextField();
		textFieldFecha.setEditable(false);
		textFieldFecha.setBounds(161, 158, 86, 20);
		contentPane.add(textFieldFecha);
		textFieldFecha.setColumns(10);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");
		LocalDate localDate = LocalDate.now();
		textFieldFecha.setText(localDate.toString());

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(315, 227, 89, 23);
		contentPane.add(btnVolver);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(315, 157, 89, 23);
		contentPane.add(btnEditar);
	}

	public String getIdCliente() {
		return idCliente;
	}

	public JTextField getTextFieldNombre() {
		return textFieldNombre;
	}

	public void setTextFieldNombre(JTextField textFieldNombre) {
		this.textFieldNombre = textFieldNombre;
	}

	public JTextField getTextFieldApellido() {
		return textFieldApellido;
	}

	public void setTextFieldApellido(JTextField textFieldApellido) {
		this.textFieldApellido = textFieldApellido;
	}

	public JTextField getTextFieldDireccion() {
		return textFieldDireccion;
	}

	public void setTextFieldDireccion(JTextField textFieldDireccion) {
		this.textFieldDireccion = textFieldDireccion;
	}

	public JTextField getTextFieldDNI() {
		return textFieldDNI;
	}

	public void setTextFieldDNI(JTextField textFieldDNI) {
		this.textFieldDNI = textFieldDNI;
	}

	public JTextField getTextFieldFecha() {
		return textFieldFecha;
	}

	public void setTextFieldFecha(JTextField textFieldFecha) {
		this.textFieldFecha = textFieldFecha;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

	public JButton getBtnEditar() {
		return btnEditar;
	}

	public void setBtnEditar(JButton btnEditar) {
		this.btnEditar = btnEditar;
	}
}