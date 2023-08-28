package Ejercicio01.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Ejercicio01.views.ListarClientes;
import Ejercicio01.views.MenuClientes;
import models.Conexion;

public class ListarClientesController {

	// Atributos
	private ListarClientes vista;
	private Conexion modelo;

	// Constructores
	public ListarClientesController(ListarClientes vista, Conexion modelo) {
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
		new MenuClientesController(new MenuClientes(), modelo);
	}
}