package Ejercicio02.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Ejercicio02.views.CrearProyecto;
import Ejercicio02.views.MenuProyectos;
import models.Conexion;

public class CrearProyectoController {

	// Atributos
	private CrearProyecto vista;
	private Conexion modelo;

	// Constructores
	public CrearProyectoController(CrearProyecto vista, Conexion modelo) {
		this.vista = vista;
		this.modelo = modelo;

		vista.getBtnCrear().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = vista.getTextFieldId().getText();
				String nombre = vista.getTextFieldNombre().getText();
				int horas = vista.getHoras();

				crear(id, nombre, horas);
			}
		});

		vista.getBtnVolver().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();	
			}
		});
	}

	// Métodos
	private void crear(String id, String nombre, int horas) {
		String queryCrearProyecto = "INSERT INTO proyectos (id, nombre, horas) VALUES "
				+ "('" + id + "', '" + nombre + "', " + horas + ");";
		modelo.insertarDatos("cientificos", queryCrearProyecto);
		vista.dispose();
		new MenuProyectosController(new MenuProyectos(), modelo);
	}

	private void volver() {
		vista.dispose();
		new MenuProyectosController(new MenuProyectos(), modelo);
	}
}