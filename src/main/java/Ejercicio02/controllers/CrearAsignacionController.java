package Ejercicio02.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Ejercicio02.views.CrearAsignacion;
import Ejercicio02.views.MenuAsignaciones;
import models.Conexion;

public class CrearAsignacionController {

	// Atributos
	private CrearAsignacion vista;
	private Conexion modelo;

	// Constructores
	public CrearAsignacionController(CrearAsignacion vista, Conexion modelo) {
		this.vista = vista;
		this.modelo = modelo;

		vista.getBtnCrear().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cientifico = vista.getDniCientifico();
				String proyecto = vista.getIdProyecto();

				crear(cientifico, proyecto);
			}
		});

		vista.getBtnVolver().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();	
			}
		});
	}

	// Métodos
	private void crear(String cientifico, String proyecto) {
		String queryCrearAsignacion = "INSERT INTO asignaciones (cientifico, proyecto) VALUES "
				+ "('" + cientifico + "', '" + proyecto + "');";
		modelo.insertarDatos("cientificos", queryCrearAsignacion);
		vista.dispose();
		new MenuAsignacionesController(new MenuAsignaciones(), modelo);
	}

	private void volver() {
		vista.dispose();
		new MenuAsignacionesController(new MenuAsignaciones(), modelo);
	}
}