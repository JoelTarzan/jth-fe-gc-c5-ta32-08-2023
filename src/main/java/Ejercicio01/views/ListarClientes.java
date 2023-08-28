package Ejercicio01.views;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;

public class ListarClientes extends JFrame {

	private JPanel contentPane;
	private JButton btnVolver;

	/**
	 * Create the frame.
	 */
	public ListarClientes(ArrayList<String> registros) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 300);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Lista de clientes");
		lblTitle.setBounds(310, 11, 106, 14);
		contentPane.add(lblTitle);
		
		String registrosString[] = new String[registros.size()];
		for (int i = 0; i < registrosString.length; i++) {
			registrosString[i] = registros.get(i);
		}
		
		JList<String> list = new JList<String>(registrosString);
		list.setBounds(21, 46, 658, 148);
		contentPane.add(list);
		
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(310, 227, 89, 23);
		contentPane.add(btnVolver);
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}
}