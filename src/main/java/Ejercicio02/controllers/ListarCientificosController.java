package Ejercicio02.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Ejercicio02.views.ListarCientificos;
import Ejercicio02.views.MenuCientificos;
import models.Conexion;

public class ListarCientificosController {

	// Atributos
	private ListarCientificos vista;
	private Conexion modelo;

	// Constructores
	public ListarCientificosController(ListarCientificos vista, Conexion modelo) {
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
		new MenuCientificosController(new MenuCientificos(), modelo);
	}
}