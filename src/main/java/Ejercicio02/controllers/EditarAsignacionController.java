package Ejercicio02.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Ejercicio02.views.EditarAsignacion;
import Ejercicio02.views.MenuAsignaciones;
import models.Conexion;

public class EditarAsignacionController {

	// Atributos
	private EditarAsignacion vista;
	private Conexion modelo;

	// Constructores
	public EditarAsignacionController(EditarAsignacion vista, Conexion modelo) {
		this.vista = vista;
		this.modelo = modelo;

		vista.getBtnEditar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = vista.getIdAsignacion();
				String dniCientifico = vista.getDniCientifico();
				String idProyecto = vista.getIdProyecto();

				editar(id, dniCientifico, idProyecto);
			}
		});

		vista.getBtnVolver().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();	
			}
		});
	}

	// Métodos
	private void editar(String id, String dniCientifico, String idProyecto) {
		String queryEditarAsignacion = "REPLACE INTO asignaciones (id, cientifico, proyecto) VALUES "
				+ "('" + id + "', '" + dniCientifico + "', '" + idProyecto + "');";
		modelo.modificarRegisto("cientificos", queryEditarAsignacion);
		vista.dispose();
		new MenuAsignacionesController(new MenuAsignaciones(), modelo);
	}

	private void volver() {
		vista.dispose();
		new MenuAsignacionesController(new MenuAsignaciones(), modelo);
	}
}