package Ejercicio02.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Ejercicio02.views.CrearCientifico;
import Ejercicio02.views.ListarCientificos;
import Ejercicio02.views.MenuCientificos;
import Ejercicio02.views.MenuPrincipal;
import models.Conexion;

public class MenuCientificosController {

	// Atributos
	private MenuCientificos vista;
	private Conexion modelo;
	private String db = "cientificos";
	private String tabla = "cientificos";

	// Constructores
	public MenuCientificosController(MenuCientificos vista, Conexion modelo) {
		this.vista = vista;
		this.modelo = modelo;

		vista.getBtnListar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listarCientificos();
			}
		});

		vista.getBtnCrear().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearCientifico();
			}
		});

		vista.getBtnEditar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editarCientifico();
			}
		});

		vista.getBtnEliminar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarCientifico();
			}
		});

		vista.getBtnVolver().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();	
			}
		});
	}

	// Métodos
	private void listarCientificos() {
		vista.dispose();
		ArrayList<String> registros = modelo.obtenerDatos(db, tabla, new String[] {"dni", "nom_apels"});
		new ListarCientificosController(new ListarCientificos(registros), modelo);
	}

	private void crearCientifico() {
		vista.dispose();
		new CrearCientificoController(new CrearCientifico(), modelo);
	}

	private void editarCientifico() {
		vista.dispose();
//		new BuscarClientesController(new BuscarClientes(), modelo, "editar");
	}

	private void eliminarCientifico() {
		vista.dispose();
//		new BuscarClientesController(new BuscarClientes(), modelo, "eliminar");
	}

	private void volver() {
		vista.dispose();
		new MenuPrincipalController(new MenuPrincipal(), modelo);
	}
}