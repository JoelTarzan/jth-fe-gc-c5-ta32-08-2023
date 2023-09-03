package Ejercicio02.views;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ListarAsignaciones extends JFrame {

	private JPanel contentPane;
	private JButton btnVolver;

	/**
	 * Create the frame.
	 */
	public ListarAsignaciones(ArrayList<String> registros) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitle = new JLabel("Lista de Asignaciones");
		lblTitle.setBounds(172, 11, 133, 14);
		contentPane.add(lblTitle);

		String registrosString[] = new String[registros.size()];
		for (int i = 0; i < registrosString.length; i++) {
			registrosString[i] = registros.get(i);
		}

		JList<String> list = new JList<String>(registrosString);
		list.setBounds(21, 46, 395, 148);
		contentPane.add(list);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(327, 227, 89, 23);
		contentPane.add(btnVolver);
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}
}