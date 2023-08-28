package Ejercicio01.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Ejercicio01.views.CrearClientes;
import Ejercicio01.views.MenuClientes;
import models.Conexion;

public class CrearClientesController {

	// Atributos
	private CrearClientes vista;
	private Conexion modelo;

	// Constructores
	public CrearClientesController(CrearClientes vista, Conexion modelo) {
		this.vista = vista;
		this.modelo = modelo;

		vista.getBtnCrear().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = vista.getTextFieldNombre().getText();
				String apellido = vista.getTextFieldApellido().getText();
				String direccion = vista.getTextFieldDireccion().getText();
				String dni = vista.getTextFieldDNI().getText();
				String fecha = vista.getTextFieldFecha().getText();

				crear(nombre, apellido, direccion, dni, fecha);
			}
		});

		vista.getBtnVolver().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();	
			}
		});
	}

	// Métodos
	private void crear(String nombre, String apellido, String direccion, String dni, String fecha) {
		String queryCrearCliente = "INSERT INTO clientes (nombre, apellido, direccion, dni, fecha) VALUES "
				+ "('" + nombre + "', '" + apellido + "', '" + direccion + "', " + Integer.parseInt(dni) + ", '" + fecha + "');";
		modelo.insertarDatos("videoclub", queryCrearCliente);
		vista.dispose();
		new MenuClientesController(new MenuClientes(), modelo);
	}

	private void volver() {
		vista.dispose();
		new MenuClientesController(new MenuClientes(), modelo);
	}
}