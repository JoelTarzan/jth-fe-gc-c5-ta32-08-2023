package Ejercicio02.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Ejercicio02.views.BuscarCientifico;
import Ejercicio02.views.EditarCientifico;
import Ejercicio02.views.MenuCientificos;
import models.Conexion;

public class BuscarCientificoController {

	// Atributos
	private BuscarCientifico vista;
	private Conexion modelo;
	private String modo;

	// Constructores
	public BuscarCientificoController(BuscarCientifico vista, Conexion modelo, String modo) {
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
		String[] registro = modelo.obtenerRegistro("cientificos", "cientificos", new String[] {"dni", "nom_apels"}, "dni", vista.getDniCientifico());

		if (this.modo == "editar") {
			new EditarCientificoController(new EditarCientifico(registro), modelo);

		} else if (this.modo == "eliminar") {
			String queryEliminarCientifico = "DELETE FROM cientificos WHERE dni = '" + registro[0] + "';";
			modelo.eliminarRegistro("cientificos", queryEliminarCientifico);

			vista.dispose();
			new MenuCientificosController(new MenuCientificos(), modelo);
		}
	}

	private void volver() {
		vista.dispose();
		new MenuCientificosController(new MenuCientificos(), modelo);
	}
}