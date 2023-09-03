package Ejercicio02.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Ejercicio02.views.BuscarAsignacion;
import Ejercicio02.views.EditarAsignacion;
import Ejercicio02.views.MenuAsignaciones;
import models.Conexion;

public class BuscarAsignacionController {

	// Atributos
	private BuscarAsignacion vista;
	private Conexion modelo;
	private String modo;

	// Constructores
	public BuscarAsignacionController(BuscarAsignacion vista, Conexion modelo, String modo) {
		this.vista = vista;
		this.modelo = modelo;
		this.modo = modo;

		vista.getBtnBuscar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscar();
			}
		});

		vista.getBtnVolver().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();	
			}
		});
	}

	// Métodos
	private void buscar() {
		vista.dispose();
		String[] registro = modelo.obtenerRegistro("cientificos", "asignaciones", new String[] {"id", "cientifico", "proyecto"}, "id", vista.getIdAsignacion());
		ArrayList<String> dniCientificos = modelo.obtenerCampo("cientificos", "cientificos", "dni");
		ArrayList<String> idProyectos = modelo.obtenerCampo("cientificos", "proyectos", "id");

		if (this.modo == "editar") {
			new EditarAsignacionController(new EditarAsignacion(registro, dniCientificos, idProyectos), modelo);

		} else if (this.modo == "eliminar") {
			String queryEliminarAsignacion = "DELETE FROM asignaciones WHERE id = '" + registro[0] + "';";
			modelo.eliminarRegistro("cientificos", queryEliminarAsignacion);

			vista.dispose();
			new MenuAsignacionesController(new MenuAsignaciones(), modelo);
		}
	}

	private void volver() {
		vista.dispose();
		new MenuAsignacionesController(new MenuAsignaciones(), modelo);
	}
}