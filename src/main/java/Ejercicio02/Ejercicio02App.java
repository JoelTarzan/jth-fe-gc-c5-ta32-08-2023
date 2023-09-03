package Ejercicio02;

import Ejercicio02.controllers.MenuPrincipalController;
import Ejercicio02.views.MenuPrincipal;
import models.Conexion;

public class Ejercicio02App {

	public static void main(String[] args) {

		// Creamos una conexion
		Conexion modelo = new Conexion("jdbc:mysql://localhost:3306?useTimezone=true&serverTimezone=UTC", "root", "root");

		// Creamos la BD
		modelo.crearDB("cientificos");

		// Creamos las querys y sus tablas
		String queryCientificos = "CREATE TABLE cientificos "
				+ "(dni varchar(8), nom_apels varchar(250), "
				+ "PRIMARY KEY(dni));";
		modelo.crearTabla("cientificos", queryCientificos);

		String queryProyectos = "CREATE TABLE proyectos "
				+ "(id char(4), nombre varchar(250), horas int, "
				+ "PRIMARY KEY(id));";
		modelo.crearTabla("cientificos", queryProyectos);

		String queryAsignaciones = "CREATE TABLE asignaciones "
				+ "(id int AUTO_INCREMENT, cientifico varchar(8), proyecto char(4), "
				+ "PRIMARY KEY(id), FOREIGN KEY(cientifico) REFERENCES cientificos (dni) ON DELETE cascade ON UPDATE cascade, FOREIGN KEY(proyecto) REFERENCES proyectos (id) ON DELETE cascade ON UPDATE cascade);";
		modelo.crearTabla("cientificos", queryAsignaciones);

		// Llamamos al controlador del Menu Principal el cual ya se encargara de todo
		new MenuPrincipalController(new MenuPrincipal(), modelo);
	}
}