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

public class CrearAsignacion extends JFrame {

	private JPanel contentPane;
	private JButton btnVolver;
	private JButton btnCrear;
	private JComboBox comboBoxCientificos;
	private String dniCientifico;
	private String idProyecto;
	private JLabel lblId;
	private JComboBox comboBoxProyectos;

	/**
	 * Create the frame.
	 */
	public CrearAsignacion(ArrayList<String> cientificos, ArrayList<String> proyectos) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 353, 264);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitle = new JLabel("Crear nueva Asignación");
		lblTitle.setBounds(116, 11, 178, 14);
		contentPane.add(lblTitle);

		JLabel lblDni = new JLabel("DNI Científico");
		lblDni.setBounds(10, 61, 131, 14);
		contentPane.add(lblDni);

		btnCrear = new JButton("Crear");
		btnCrear.setBounds(236, 128, 89, 23);
		contentPane.add(btnCrear);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(236, 191, 89, 23);
		contentPane.add(btnVolver);

		comboBoxCientificos = new JComboBox();
		comboBoxCientificos.setBounds(10, 86, 131, 22);
		contentPane.add(comboBoxCientificos);

		for (int i = 0; i < cientificos.size(); i++) {
			comboBoxCientificos.addItem(cientificos.get(i));
		}

		dniCientifico = cientificos.get(0);

		comboBoxCientificos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dniCientifico = (String) comboBoxCientificos.getSelectedItem();
			}
		});

		lblId = new JLabel("ID Proyecto");
		lblId.setBounds(194, 61, 131, 14);
		contentPane.add(lblId);

		comboBoxProyectos = new JComboBox();
		comboBoxProyectos.setBounds(194, 86, 131, 22);
		contentPane.add(comboBoxProyectos);

		for (int i = 0; i < proyectos.size(); i++) {
			comboBoxProyectos.addItem(proyectos.get(i));
		}

		idProyecto = proyectos.get(0);

		comboBoxProyectos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idProyecto = (String) comboBoxProyectos.getSelectedItem();
			}
		});
	}

	public String getDniCientifico() {
		return dniCientifico;
	}

	public void setDniCientifico(String dniCientifico) {
		this.dniCientifico = dniCientifico;
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

	public JButton getBtnCrear() {
		return btnCrear;
	}
}