package Ejercicio02.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Ejercicio02.views.EditarProyecto;
import Ejercicio02.views.MenuProyectos;
import models.Conexion;

public class EditarProyectoController {

	// Atributos
	private EditarProyecto vista;
	private Conexion modelo;

	// Constructores
	public EditarProyectoController(EditarProyecto vista, Conexion modelo) {
		this.vista = vista;
		this.modelo = modelo;

		vista.getBtnEditar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = vista.getIdProyecto();
				String nombre = vista.getTextFieldNombre().getText();
				int horas = vista.getHoras();

				editar(id, nombre, horas);
			}
		});

		vista.getBtnVolver().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();	
			}
		});
	}

	// Métodos
	private void editar(String id, String nombre, int horas) {
		String queryEditarProyecto = "REPLACE INTO proyectos (id, nombre, horas) VALUES "
				+ "('" + id + "', '" + nombre + "', " + horas + ");";
		modelo.modificarRegisto("cientificos", queryEditarProyecto);
		vista.dispose();
		new MenuProyectosController(new MenuProyectos(), modelo);
	}

	private void volver() {
		vista.dispose();
		new MenuProyectosController(new MenuProyectos(), modelo);
	}
}