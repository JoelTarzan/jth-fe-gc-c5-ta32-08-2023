package Ejercicio01.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Ejercicio01.views.CrearVideos;
import Ejercicio01.views.MenuVideos;
import models.Conexion;

public class CrearVideosController {

	// Atributos
	private CrearVideos vista;
	private Conexion modelo;

	// Constructores
	public CrearVideosController(CrearVideos vista, Conexion modelo) {
		this.vista = vista;
		this.modelo = modelo;

		vista.getBtnCrear().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String titulo = vista.getTextFieldTitulo().getText();
				String director = vista.getTextFieldDirector().getText();
				String idCliente = vista.getIdCliente();

				crear(titulo, director,idCliente);
			}
		});

		vista.getBtnVolver().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();	
			}
		});
	}

	// Métodos
	private void crear(String titulo, String director, String idCliente) {
		String queryCrearCliente = "INSERT INTO videos (title, director, cli_id) VALUES "
				+ "('" + titulo + "', '" + director + "', " + Integer.parseInt(idCliente) + ");";
		modelo.insertarDatos("videoclub", queryCrearCliente);
		vista.dispose();
		new MenuVideosController(new MenuVideos(), modelo);
	}

	private void volver() {
		vista.dispose();
		new MenuVideosController(new MenuVideos(), modelo);
	}
}