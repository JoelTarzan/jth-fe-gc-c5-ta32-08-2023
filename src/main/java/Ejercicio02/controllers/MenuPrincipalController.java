package Ejercicio02.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Ejercicio02.views.MenuAsignaciones;
import Ejercicio02.views.MenuCientificos;
import Ejercicio02.views.MenuPrincipal;
import Ejercicio02.views.MenuProyectos;
import models.Conexion;

public class MenuPrincipalController {

	// Atributos
	private MenuPrincipal vista;
	private Conexion modelo;

	// Constructores
	public MenuPrincipalController(MenuPrincipal vista, Conexion modelo) {
		this.vista = vista;
		this.modelo = modelo;

		vista.getBtnCientificos().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirMenuCientificos();
			}
		});

		vista.getBtnProyectos().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirMenuProyectos();		
			}
		});

		vista.getBtnAsignaciones().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirMenuAsignaciones();		
			}
		});

		vista.getBtnSalir().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salir();	
			}
		});
	}

	// Métodos
	private void abrirMenuCientificos() {
		vista.dispose();
		new MenuCientificosController(new MenuCientificos(), modelo);
	}

	private void abrirMenuProyectos() {
		vista.dispose();
		new MenuProyectosController(new MenuProyectos(), modelo);
	}

	private void abrirMenuAsignaciones() {
		vista.dispose();
		new MenuAsignacionesController(new MenuAsignaciones(), modelo);
	}

	private void salir() {
		vista.dispose();
	}
}