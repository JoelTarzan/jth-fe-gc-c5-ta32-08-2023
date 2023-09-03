package Ejercicio01.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Ejercicio01.views.BuscarVideos;
import Ejercicio01.views.EditarVideos;
import Ejercicio01.views.MenuVideos;
import models.Conexion;

public class BuscarVideosController {

	// Atributos
	private BuscarVideos vista;
	private Conexion modelo;
	private String modo;

	// Constructores
	public BuscarVideosController(BuscarVideos vista, Conexion modelo, String modo) {
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
		String[] registro = modelo.obtenerRegistro("videoclub", "videos", new String[] {"id", "title", "director", "cli_id"}, "id", vista.getTextField().getText());
		ArrayList<String> idClientes = modelo.obtenerCampo("videoclub", "clientes", "id");

		if (this.modo == "editar") {
			new EditarVideosController(new EditarVideos(registro, idClientes), modelo);

		} else if (this.modo == "eliminar") {
			String queryEliminarVideo = "DELETE FROM videos WHERE id = '" + registro[0] + "';";
			modelo.eliminarRegistro("videoclub", queryEliminarVideo);

			vista.dispose();
			new MenuVideosController(new MenuVideos(), modelo);
		}
	}

	private void volver() {
		vista.dispose();
		new MenuVideosController(new MenuVideos(), modelo);
	}
}