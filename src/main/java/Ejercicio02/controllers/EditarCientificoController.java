package Ejercicio02.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Ejercicio02.views.EditarCientifico;
import Ejercicio02.views.MenuCientificos;
import models.Conexion;

public class EditarCientificoController {

	// Atributos
	private EditarCientifico vista;
	private Conexion modelo;

	// Constructores
	public EditarCientificoController(EditarCientifico vista, Conexion modelo) {
		this.vista = vista;
		this.modelo = modelo;

		vista.getBtnEditar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dni = vista.getDniCliente();
				String nombre = vista.getTextFieldNomApels().getText();

				editar(dni, nombre);
			}
		});

		vista.getBtnVolver().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();	
			}
		});
	}

	// Métodos
	private void editar(String dni, String nombre) {
		String queryEditarCientifico = "REPLACE INTO cientificos (dni, nom_apels) VALUES "
				+ "('" + dni + "', '" + nombre + "');";
		modelo.modificarRegisto("cientificos", queryEditarCientifico);
		vista.dispose();
		new MenuCientificosController(new MenuCientificos(), modelo);
	}

	private void volver() {
		vista.dispose();
		new MenuCientificosController(new MenuCientificos(), modelo);
	}
}