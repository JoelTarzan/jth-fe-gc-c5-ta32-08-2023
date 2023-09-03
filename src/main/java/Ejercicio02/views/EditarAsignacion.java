package Ejercicio02.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class EditarAsignacion extends JFrame {

	private JPanel contentPane;
	private JButton btnVolver;
	private JButton btnEditar;
	private String dniCientifico;
	private String idProyecto;
	private String idAsignacion;
	private JComboBox comboBoxCientificos;
	private JComboBox comboBoxProyectos;

	/**
	 * Create the frame.
	 */
	public EditarAsignacion(String[] registro, ArrayList<String> dniCientificos, ArrayList<String> idProyectos) {
		this.idAsignacion = registro[0];
		this.dniCientifico = registro[1];
		this.idProyecto = registro[2];
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 353, 263);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitle = new JLabel("Editar asignación");
		lblTitle.setBounds(116, 11, 178, 14);
		contentPane.add(lblTitle);
		
		JLabel lblDni = new JLabel("DNI Científico");
		lblDni.setBounds(10, 61, 131, 14);
		contentPane.add(lblDni);

		comboBoxCientificos = new JComboBox();
		comboBoxCientificos.setBounds(10, 86, 131, 22);
		contentPane.add(comboBoxCientificos);

		for (int i = 0; i < dniCientificos.size(); i++) {
			comboBoxCientificos.addItem(dniCientificos.get(i));
			
			if (dniCientificos.get(i).equals(registro[1])) {
				comboBoxCientificos.setSelectedItem(dniCientificos.get(i));
			}
		}

		comboBoxCientificos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dniCientifico = (String) comboBoxCientificos.getSelectedItem();
			}
		});

		JLabel lblId = new JLabel("ID Proyecto");
		lblId.setBounds(194, 61, 131, 14);
		contentPane.add(lblId);

		comboBoxProyectos = new JComboBox();
		comboBoxProyectos.setBounds(194, 86, 131, 22);
		contentPane.add(comboBoxProyectos);

		for (int i = 0; i < idProyectos.size(); i++) {
			comboBoxProyectos.addItem(idProyectos.get(i));
			
			if (idProyectos.get(i).equals(registro[2])) {
				comboBoxProyectos.setSelectedItem(idProyectos.get(i));
			}
		}	

		comboBoxProyectos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idProyecto = (String) comboBoxProyectos.getSelectedItem();
			}
		});
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(236, 128, 89, 23);
		contentPane.add(btnEditar);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(236, 191, 89, 23);
		contentPane.add(btnVolver);
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

	public String getIdAsignacion() {
		return idAsignacion;
	}

	public void setIdAsignacion(String idAsignacion) {
		this.idAsignacion = idAsignacion;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public JButton getBtnEditar() {
		return btnEditar;
	}
}