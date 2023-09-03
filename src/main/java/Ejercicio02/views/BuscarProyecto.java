package Ejercicio02.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class BuscarProyecto extends JFrame {

	private JPanel contentPane;
	private JButton btnVolver;
	private JButton btnBuscar;
	private JComboBox comboBox;
	private String idProyecto;

	/**
	 * Create the frame.
	 */
	public BuscarProyecto(ArrayList<String> idProyectos) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 392, 188);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitle = new JLabel("Buscar proyecto por ID");
		lblTitle.setBounds(116, 11, 178, 14);
		contentPane.add(lblTitle);

		JLabel lblDni = new JLabel("ID");
		lblDni.setBounds(56, 61, 38, 14);
		contentPane.add(lblDni);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(278, 57, 89, 23);
		contentPane.add(btnBuscar);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(278, 115, 89, 23);
		contentPane.add(btnVolver);

		comboBox = new JComboBox();
		comboBox.setBounds(104, 57, 131, 22);
		contentPane.add(comboBox);

		for (int i = 0; i < idProyectos.size(); i++) {
			comboBox.addItem(idProyectos.get(i));
		}

		idProyecto = idProyectos.get(0);

		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idProyecto = (String) comboBox.getSelectedItem();
			}
		});
	}

	public String getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(String idProyecto) {
		this.idProyecto = idProyecto;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}
}