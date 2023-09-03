package Ejercicio02.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Ejercicio02.views.CrearCientifico;
import Ejercicio02.views.MenuCientificos;
import models.Conexion;

public class CrearCientificoController {

	// Atributos
	private CrearCientifico vista;
	private Conexion modelo;

	// Constructores
	public CrearCientificoController(CrearCientifico vista, Conexion modelo) {
		this.vista = vista;
		this.modelo = modelo;

		vista.getBtnCrear().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dni = vista.getTextFieldDNI().getText();
				String nomApels = vista.getTextFieldNomApels().getText();

				crear(dni, nomApels);
			}
		});

		vista.getBtnVolver().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();	
			}
		});
	}

	// Métodos
	private void crear(String dni, String nomApels) {
		String queryCrearCientifico = "INSERT INTO cientificos (dni, nom_apels) VALUES "
				+ "('" + dni + "', '" + nomApels + "');";
		modelo.insertarDatos("cientificos", queryCrearCientifico);
		vista.dispose();
		new MenuCientificosController(new MenuCientificos(), modelo);
	}

	private void volver() {
		vista.dispose();
		new MenuCientificosController(new MenuCientificos(), modelo);
	}
}