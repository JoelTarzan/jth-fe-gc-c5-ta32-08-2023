package Ejercicio02.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Ejercicio02.views.MenuAsignaciones;
import Ejercicio02.views.MenuPrincipal;
import models.Conexion;

public class MenuAsignacionesController {

	// Atributos
	private MenuAsignaciones vista;
	private Conexion modelo;
	private String db = "cientificos";
	private String tabla = "asignaciones";

	// Constructores
	public MenuAsignacionesController(MenuAsignaciones vista, Conexion modelo) {
		this.vista = vista;
		this.modelo = modelo;

		vista.getBtnListar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listarAsignaciones();
			}
		});

		vista.getBtnCrear().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearAsignacion();
			}
		});

		vista.getBtnEditar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editarAsignacion();
			}
		});

		vista.getBtnEliminar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarAsignacion();
			}
		});

		vista.getBtnVolver().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();	
			}
		});
	}

	// Métodos
	private void listarAsignaciones() {
		vista.dispose();
		ArrayList<String> registros = modelo.obtenerDatos(db, tabla, new String[] {"id", "cientifico", "proyecto"});
//		new ListarClientesController(new ListarClientes(registros), modelo);
	}

	private void crearAsignacion() {
		vista.dispose();
//		new CrearClientesController(new CrearClientes(), modelo);
	}

	private void editarAsignacion() {
		vista.dispose();
//		new BuscarClientesController(new BuscarClientes(), modelo, "editar");
	}

	private void eliminarAsignacion() {
		vista.dispose();
//		new BuscarClientesController(new BuscarClientes(), modelo, "eliminar");
	}

	private void volver() {
		vista.dispose();
		new MenuPrincipalController(new MenuPrincipal(), modelo);
	}
}