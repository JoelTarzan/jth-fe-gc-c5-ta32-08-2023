package Ejercicio02.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Ejercicio02.views.BuscarProyecto;
import Ejercicio02.views.EditarProyecto;
import Ejercicio02.views.MenuProyectos;
import models.Conexion;

public class BuscarProyectoController {

	// Atributos
	private BuscarProyecto vista;
	private Conexion modelo;
	private String modo;

	// Constructores
	public BuscarProyectoController(BuscarProyecto vista, Conexion modelo, String modo) {
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
		String[] registro = modelo.obtenerRegistroConLike("cientificos", "proyectos", new String[] {"id", "nombre", "horas"}, "id", vista.getIdProyecto());

		if (this.modo == "editar") {
			new EditarProyectoController(new EditarProyecto(registro), modelo);

		} else if (this.modo == "eliminar") {
			String queryEliminarProyecto = "DELETE FROM proyectos WHERE id LIKE '" + registro[0] + "';";
			modelo.eliminarRegistro("cientificos", queryEliminarProyecto);

			vista.dispose();
			new MenuProyectosController(new MenuProyectos(), modelo);
		}
	}

	private void volver() {
		vista.dispose();
		new MenuProyectosController(new MenuProyectos(), modelo);
	}

}