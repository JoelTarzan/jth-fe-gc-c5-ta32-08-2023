package Ejercicio02.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Ejercicio02.views.ListarProyectos;
import Ejercicio02.views.MenuCientificos;
import Ejercicio02.views.MenuProyectos;
import models.Conexion;

public class ListarProyectosController {

	// Atributos
	private ListarProyectos vista;
	private Conexion modelo;

	// Constructores
	public ListarProyectosController(ListarProyectos vista, Conexion modelo) {
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
		new MenuProyectosController(new MenuProyectos(), modelo);
	}
}