package Ejercicio01.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Ejercicio01.views.BuscarClientes;
import Ejercicio01.views.EditarClientes;
import Ejercicio01.views.MenuClientes;
import models.Conexion;

public class BuscarClientesController {

	// Atributos
	private BuscarClientes vista;
	private Conexion modelo;
	private String modo;

	// Constructores
	public BuscarClientesController(BuscarClientes vista, Conexion modelo, String modo) {
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
		String[] registro = modelo.obtenerRegistro("videoclub", "clientes", new String[] {"id", "nombre", "apellido", "direccion", "dni", "fecha"}, "id", vista.getTextField().getText());
		
		if (this.modo == "editar") {
			new EditarClientesController(new EditarClientes(registro), modelo);
			
		} else if (this.modo == "eliminar") {
			String queryEliminarCliente = "DELETE FROM clientes WHERE id = '" + registro[0] + "';";
			modelo.eliminarRegistro("videoclub", queryEliminarCliente);
			
			vista.dispose();
			new MenuClientesController(new MenuClientes(), modelo);
		}
	}
	
	private void volver() {
		vista.dispose();
		new MenuClientesController(new MenuClientes(), modelo);
	}
}