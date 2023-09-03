package Ejercicio02.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Ejercicio02.views.MenuPrincipal;
import Ejercicio02.views.MenuProyectos;
import models.Conexion;

public class MenuProyectosController {

	// Atributos
	private MenuProyectos vista;
	private Conexion modelo;
	private String db = "cientificos";
	private String tabla = "proyectos";

	// Constructores
	public MenuProyectosController(MenuProyectos vista, Conexion modelo) {
		this.vista = vista;
		this.modelo = modelo;

		vista.getBtnListar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listarProyectos();
			}
		});

		vista.getBtnCrear().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearProyecto();
			}
		});

		vista.getBtnEditar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editarProyecto();
			}
		});

		vista.getBtnEliminar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarProyecto();
			}
		});

		vista.getBtnVolver().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();	
			}
		});
	}

	// Métodos
	private void listarProyectos() {
		vista.dispose();
		ArrayList<String> registros = modelo.obtenerDatos(db, tabla, new String[] {"id", "nombre", "horas"});
//		new ListarClientesController(new ListarClientes(registros), modelo);
	}

	private void crearProyecto() {
		vista.dispose();
//		new CrearClientesController(new CrearClientes(), modelo);
	}

	private void editarProyecto() {
		vista.dispose();
//		new BuscarClientesController(new BuscarClientes(), modelo, "editar");
	}

	private void eliminarProyecto() {
		vista.dispose();
//		new BuscarClientesController(new BuscarClientes(), modelo, "eliminar");
	}

	private void volver() {
		vista.dispose();
		new MenuPrincipalController(new MenuPrincipal(), modelo);
	}
}