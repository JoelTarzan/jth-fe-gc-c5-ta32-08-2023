package Ejercicio01.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

public class CrearVideos extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTitulo;
	private JTextField textFieldDirector;
	private String idCliente;
	private JButton btnVolver;
	private JButton btnCrear;

	/**
	 * Create the frame.
	 */
	public CrearVideos(ArrayList<String> idClientes) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 223);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Crear nuevo vídeo");
		lblTitle.setBounds(141, 11, 124, 14);
		contentPane.add(lblTitle);

		JLabel lblTitulo = new JLabel("Título");
		lblTitulo.setBounds(10, 49, 71, 14);
		contentPane.add(lblTitulo);

		textFieldTitulo = new JTextField();
		textFieldTitulo.setBounds(10, 74, 86, 20);
		contentPane.add(textFieldTitulo);
		textFieldTitulo.setColumns(10);

		JLabel lblDirector = new JLabel("Director");
		lblDirector.setBounds(161, 49, 63, 14);
		contentPane.add(lblDirector);

		textFieldDirector = new JTextField();
		textFieldDirector.setBounds(161, 74, 86, 20);
		contentPane.add(textFieldDirector);
		textFieldDirector.setColumns(10);

		JLabel lblCliente = new JLabel("Id Cliente");
		lblCliente.setBounds(318, 49, 63, 14);
		contentPane.add(lblCliente);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(318, 150, 89, 23);
		contentPane.add(btnVolver);
		
		btnCrear = new JButton("Crear");
		btnCrear.setBounds(318, 116, 89, 23);
		contentPane.add(btnCrear);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(318, 73, 89, 22);
		contentPane.add(comboBox);
		
		for (int i = 0; i < idClientes.size(); i++) {
			comboBox.addItem(idClientes.get(i));
		}
		
		idCliente = idClientes.get(0);
		
		comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                idCliente = (String) comboBox.getSelectedItem();
            }
        });
	}
	
	public JButton getBtnVolver() {
		return btnVolver;
	}
	
	public JButton getBtnCrear() {
		return btnCrear;
	}

	public JTextField getTextFieldTitulo() {
		return textFieldTitulo;
	}

	public void setTextFieldTitulo(JTextField textFieldTitulo) {
		this.textFieldTitulo = textFieldTitulo;
	}

	public JTextField getTextFieldDirector() {
		return textFieldDirector;
	}

	public void setTextFieldDirector(JTextField textFieldDirector) {
		this.textFieldDirector = textFieldDirector;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
}