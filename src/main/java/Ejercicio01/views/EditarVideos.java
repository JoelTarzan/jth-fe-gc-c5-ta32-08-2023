package Ejercicio01.views;

import java.awt.EventQueue;
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

public class EditarVideos extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTitulo;
	private JTextField textFieldDirector;
	private JButton btnVolver;
	private JButton btnEditar;
	private String idVideo;
	private String idCliente;
	private JComboBox comboBox;

	/**
	 * Create the frame.
	 */
	public EditarVideos(String[] registro, ArrayList<String> idClientes) {
		this.idVideo = registro[0];

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 232);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitle = new JLabel("Editar vídeo");
		lblTitle.setBounds(174, 11, 97, 14);
		contentPane.add(lblTitle);

		JLabel lblTitulo = new JLabel("Título");
		lblTitulo.setBounds(10, 49, 71, 14);
		contentPane.add(lblTitulo);

		textFieldTitulo = new JTextField();
		textFieldTitulo.setText(registro[1]);
		textFieldTitulo.setBounds(10, 74, 86, 20);
		contentPane.add(textFieldTitulo);
		textFieldTitulo.setColumns(10);

		JLabel lblDirector = new JLabel("Director");
		lblDirector.setBounds(161, 49, 63, 14);
		contentPane.add(lblDirector);

		textFieldDirector = new JTextField();
		textFieldDirector.setText(registro[2]);
		textFieldDirector.setBounds(161, 74, 86, 20);
		contentPane.add(textFieldDirector);
		textFieldDirector.setColumns(10);

		JLabel lblCliente = new JLabel("Id Cliente");
		lblCliente.setBounds(318, 49, 63, 14);
		contentPane.add(lblCliente);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(318, 160, 89, 23);
		contentPane.add(btnVolver);

		btnEditar = new JButton("Editar");
		btnEditar.setBounds(318, 116, 89, 23);
		contentPane.add(btnEditar);

		comboBox = new JComboBox();
		comboBox.setBounds(318, 73, 89, 22);
		contentPane.add(comboBox);

		for (int i = 0; i < idClientes.size(); i++) {
			comboBox.addItem(idClientes.get(i));

			if (idClientes.get(i).equals(registro[3])) {
				comboBox.setSelectedItem(idClientes.get(i));
			}
		}

		idCliente = registro[3];

		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idCliente = (String) comboBox.getSelectedItem();
			}
		});
	}

	public JTextField getTextFieldTitulo() {
		return textFieldTitulo;
	}

	public void setTextFieldTitulo(JTextField textFieldTitulo) {
		this.textFieldTitulo = textFieldTitulo;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public JTextField getTextFieldDirector() {
		return textFieldDirector;
	}

	public void setTextFieldDirector(JTextField textFieldDirector) {
		this.textFieldDirector = textFieldDirector;
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

	public String getIdVideo() {
		return idVideo;
	}

	public void setIdVideo(String idVideo) {
		this.idVideo = idVideo;
	}
}