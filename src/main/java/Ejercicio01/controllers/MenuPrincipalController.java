package Ejercicio01.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Ejercicio01.views.MenuClientes;
import Ejercicio01.views.MenuPrincipal;
import Ejercicio01.views.MenuVideos;
import models.Conexion;

public class MenuPrincipalController {

	// Atributos
	private MenuPrincipal vista;
	private Conexion modelo;
	
	// Constructores
	public MenuPrincipalController(MenuPrincipal vista, Conexion modelo) {
		this.vista = vista;
		this.modelo = modelo;
		
		vista.getBtnClientes().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirMenuClientes();		
			}
		});
		
		vista.getBtnVideos().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirMenuVideos();		
			}
		});
		
		vista.getBtnSalir().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salir();	
			}
		});
	}
	
	// Métodos
	private void abrirMenuClientes() {
		vista.dispose();
        new MenuClientesController(new MenuClientes(), modelo);
    }

    private void abrirMenuVideos() {
    	vista.dispose();
        new MenuVideosController(new MenuVideos(), modelo);
    }

    private void salir() {
    	vista.dispose();
    }
}