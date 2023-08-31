package Ejercicio01.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Ejercicio01.views.EditarClientes;
import Ejercicio01.views.MenuClientes;
import models.Conexion;

public class EditarClientesController {

	// Atributos
	private EditarClientes vista;
	private Conexion modelo;

	// Constructores
	public EditarClientesController(EditarClientes vista, Conexion modelo) {
		this.vista = vista;
		this.modelo = modelo;
		
		vista.getBtnEditar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = vista.getIdCliente();
				String nombre = vista.getTextFieldNombre().getText();
				String apellido = vista.getTextFieldApellido().getText();
				String direccion = vista.getTextFieldDireccion().getText();
				String dni = vista.getTextFieldDNI().getText();
				String fecha = vista.getTextFieldFecha().getText();
				
				editar(id, nombre, apellido, direccion, dni, fecha);
			}
		});

		vista.getBtnVolver().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();	
			}
		});
	}

	// Métodos
	private void editar(String id, String nombre, String apellido, String direccion, String dni, String fecha) {
		String queryEditarCliente = "REPLACE INTO clientes (id, nombre, apellido, direccion, dni, fecha) VALUES "
				+ "('" + id + "', '" + nombre + "', '" + apellido + "', '" + direccion + "', " + Integer.parseInt(dni) + ", '" + fecha + "');";
		modelo.modificarRegisto("videoclub", queryEditarCliente);
		vista.dispose();
		new MenuClientesController(new MenuClientes(), modelo);
	}

	private void volver() {
		vista.dispose();
		new MenuClientesController(new MenuClientes(), modelo);
	}
}