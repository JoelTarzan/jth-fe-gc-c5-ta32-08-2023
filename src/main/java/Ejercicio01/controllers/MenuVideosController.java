package Ejercicio01.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Ejercicio01.views.CrearClientes;
import Ejercicio01.views.CrearVideos;
import Ejercicio01.views.ListarClientes;
import Ejercicio01.views.ListarVideos;
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
		vista.dispose();
		ArrayList<String> registros = modelo.obtenerDatos(db, tabla, new String[] {"Id", "Title", "Director", "Cli_id"});
		new ListarVideosController(new ListarVideos(registros), modelo);
	}

	private void crearVideo() {
		vista.dispose();
		ArrayList<String> idClientes = modelo.obtenerCampo(db, "clientes", "id");
		new CrearVideosController(new CrearVideos(idClientes), modelo);
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