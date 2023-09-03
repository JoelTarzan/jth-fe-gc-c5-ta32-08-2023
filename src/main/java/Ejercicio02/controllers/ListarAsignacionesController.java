package Ejercicio02.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Ejercicio02.views.ListarAsignaciones;
import Ejercicio02.views.MenuAsignaciones;
import models.Conexion;

public class ListarAsignacionesController {

	// Atributos
	private ListarAsignaciones vista;
	private Conexion modelo;

	// Constructores
	public ListarAsignacionesController(ListarAsignaciones vista, Conexion modelo) {
		this.vista = vista;
		this.modelo = modelo;

		vista.getBtnVolver().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();	
			}
		});
	}

	// Métodos
	private void volver() {
		vista.dispose();
		new MenuAsignacionesController(new MenuAsignaciones(), modelo);
	}
}