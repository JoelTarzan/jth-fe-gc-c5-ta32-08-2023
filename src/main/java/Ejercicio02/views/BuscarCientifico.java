package Ejercicio02.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

public class BuscarCientifico extends JFrame {

	private JPanel contentPane;
	private JButton btnVolver;
	private JButton btnBuscar;
	private JComboBox comboBox;
	private String dniCientifico;

	/**
	 * Create the frame.
	 */
	public BuscarCientifico(ArrayList<String> dniCientificos) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 405, 188);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitle = new JLabel("Buscar científico por DNI");
		lblTitle.setBounds(116, 11, 178, 14);
		contentPane.add(lblTitle);

		JLabel lblDni = new JLabel("DNI");
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

		for (int i = 0; i < dniCientificos.size(); i++) {
			comboBox.addItem(dniCientificos.get(i));
		}

		dniCientifico = dniCientificos.get(0);

		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dniCientifico = (String) comboBox.getSelectedItem();
			}
		});
	}

	public String getDniCientifico() {
		return dniCientifico;
	}

	public void setDniCientifico(String dniCientifico) {
		this.dniCientifico = dniCientifico;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}
}