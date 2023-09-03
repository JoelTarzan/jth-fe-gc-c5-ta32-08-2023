package Ejercicio02.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Ejercicio02.views.BuscarAsignacion;
import Ejercicio02.views.CrearAsignacion;
import Ejercicio02.views.ListarAsignaciones;
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
		new ListarAsignacionesController(new ListarAsignaciones(registros), modelo);
	}

	private void crearAsignacion() {
		ArrayList<String> cientificos = modelo.obtenerCampo(db, "cientificos", "dni");
		ArrayList<String> proyectos = modelo.obtenerCampo(db, "proyectos", "id");
		vista.dispose();
		new CrearAsignacionController(new CrearAsignacion(cientificos, proyectos), modelo);
	}

	private void editarAsignacion() {
		vista.dispose();
		ArrayList<String> idAsignaciones = modelo.obtenerCampo(db, tabla, "id");
		new BuscarAsignacionController(new BuscarAsignacion(idAsignaciones), modelo, "editar");
	}

	private void eliminarAsignacion() {
		vista.dispose();
		ArrayList<String> idAsignaciones = modelo.obtenerCampo(db, tabla, "id");
		new BuscarAsignacionController(new BuscarAsignacion(idAsignaciones), modelo, "eliminar");
	}

	private void volver() {
		vista.dispose();
		new MenuPrincipalController(new MenuPrincipal(), modelo);
	}
}