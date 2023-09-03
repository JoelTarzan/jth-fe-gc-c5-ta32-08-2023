package Ejercicio01.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Ejercicio01.views.EditarVideos;
import Ejercicio01.views.MenuVideos;
import models.Conexion;

public class EditarVideosController {

	// Atributos
	private EditarVideos vista;
	private Conexion modelo;

	// Constructores
	public EditarVideosController(EditarVideos vista, Conexion modelo) {
		this.vista = vista;
		this.modelo = modelo;

		vista.getBtnEditar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = vista.getIdVideo();
				String titulo = vista.getTextFieldTitulo().getText();
				String director = vista.getTextFieldDirector().getText();
				String idCliente = vista.getIdCliente();

				editar(id, titulo, director, idCliente);
			}
		});

		vista.getBtnVolver().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();	
			}
		});
	}

	// Métodos
	private void editar(String id, String titulo, String director, String idCliente) {
		String queryEditarVideo = "REPLACE INTO videos (id, title, director, cli_id) VALUES "
				+ "('" + id + "', '" + titulo + "', '" + director + "', " + Integer.parseInt(idCliente) + ");";
		modelo.modificarRegisto("videoclub", queryEditarVideo);
		vista.dispose();
		new MenuVideosController(new MenuVideos(), modelo);
	}

	private void volver() {
		vista.dispose();
		new MenuVideosController(new MenuVideos(), modelo);
	}
}