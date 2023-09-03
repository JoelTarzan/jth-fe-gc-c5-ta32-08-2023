package Ejercicio01.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Ejercicio01.views.ListarVideos;
import Ejercicio01.views.MenuVideos;
import models.Conexion;

public class ListarVideosController {

	// Atributos
	private ListarVideos vista;
	private Conexion modelo;

	// Constructores
	public ListarVideosController(ListarVideos vista, Conexion modelo) {
		this.vista = vista;
		this.modelo = modelo;

		vista.getBtnVolver().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();	
			}
		});
	}

	// Métodos
	private void volver() {
		vista.dispose();
		new MenuVideosController(new MenuVideos(), modelo);
	}
}