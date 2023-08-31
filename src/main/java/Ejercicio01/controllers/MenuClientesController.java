package Ejercicio01.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Ejercicio01.views.BuscarClientes;
import Ejercicio01.views.CrearClientes;
import Ejercicio01.views.ListarClientes;
import Ejercicio01.views.MenuClientes;
import Ejercicio01.views.MenuPrincipal;
import models.Conexion;

public class MenuClientesController {

	// Atributos
	private MenuClientes vista;
	private Conexion modelo;
	private String db = "videoclub";
	private String tabla = "clientes";

	// Constructores
	public MenuClientesController(MenuClientes vista, Conexion modelo) {
		this.vista = vista;
		this.modelo = modelo;

		vista.getBtnListar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listarClientes();
			}
		});
		
		vista.getBtnCrear().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearCliente();
			}
		});
		
		vista.getBtnEditar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editarCliente();
			}
		});
		
		vista.getBtnEliminar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarCliente();
			}
		});
		
		vista.getBtnVolver().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();	
			}
		});
	}
	
	// Métodos
	private void listarClientes() {
		vista.dispose();
		ArrayList<String> registros = modelo.obtenerDatos(db, tabla, new String[] {"Id", "Nombre", "Apellido", "Direccion", "DNI", "Fecha"});
		new ListarClientesController(new ListarClientes(registros), modelo);
	}
	
	private void crearCliente() {
		vista.dispose();
		new CrearClientesController(new CrearClientes(), modelo);
	}
	
	private void editarCliente() {
		vista.dispose();
		new BuscarClientesController(new BuscarClientes(), modelo, "editar");
	}
	
	private void eliminarCliente() {
		vista.dispose();
		new BuscarClientesController(new BuscarClientes(), modelo, "eliminar");
	}
	
	private void volver() {
		vista.dispose();
		new MenuPrincipalController(new MenuPrincipal(), modelo);
	}
}