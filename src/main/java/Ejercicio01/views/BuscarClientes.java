package Ejercicio01.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BuscarClientes extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnVolver;
	private JButton btnBuscar;

	/**
	 * Create the frame.
	 */
	public BuscarClientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 193);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Buscar cliente por ID");
		lblTitle.setBounds(156, 11, 122, 14);
		contentPane.add(lblTitle);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(98, 61, 32, 14);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(140, 58, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(258, 57, 89, 23);
		contentPane.add(btnBuscar);
		
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(335, 120, 89, 23);
		contentPane.add(btnVolver);
	}
	
	public JButton getBtnVolver() {
		return btnVolver;
	}
	
	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public JTextField getTextField() {
		return textField;
	}
}