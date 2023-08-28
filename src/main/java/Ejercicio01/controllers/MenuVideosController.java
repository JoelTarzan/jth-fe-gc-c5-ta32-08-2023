package Ejercicio01.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Ejercicio01.views.CrearClientes;
import Ejercicio01.views.ListarClientes;
import Ejercicio01.views.MenuPrincipal;
import Ejercicio01.views.MenuVideos;
import models.Conexion;

public class MenuVideosController {

	// Atributos
	private MenuVideos vista;
	private Conexion modelo;
	private String db = "videoclub";
	private String tabla = "videos";

	// Constructores
	public MenuVideosController(MenuVideos vista, Conexion modelo) {
		this.vista = vista;
		this.modelo = modelo;

		vista.getBtnListar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listarVideos();
			}
		});

		vista.getBtnCrear().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearVideo();
			}
		});

		vista.getBtnEditar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editarVideo();
			}
		});

		vista.getBtnEliminar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarVideo();
			}
		});

		vista.getBtnVolver().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();	
			}
		});
	}

	// Métodos
	private void listarVideos() {

	}

	private void crearVideo() {

	}

	private void editarVideo() {

	}

	private void eliminarVideo() {

	}

	private void volver() {
		vista.dispose();
		new MenuPrincipalController(new MenuPrincipal(), modelo);
	}
}