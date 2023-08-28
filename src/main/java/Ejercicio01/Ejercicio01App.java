package Ejercicio01;

import Ejercicio01.controllers.MenuPrincipalController;
import Ejercicio01.views.MenuPrincipal;
import models.Conexion;

public class Ejercicio01App {

	public static void main(String[] args) {

		// Creamos una conexion
		Conexion modelo = new Conexion("jdbc:mysql://localhost:3306?useTimezone=true&serverTimezone=UTC", "root", "root");

		// Creamos la BD
		modelo.crearDB("videoclub");

		// Creamos la query de la primera tabla y la tabla
		String queryClientes = "CREATE TABLE clientes "
				+ "(id int(11) NOT NULL AUTO_INCREMENT, nombre varchar(250) DEFAULT NULL, apellido varchar(250) DEFAULT NULL, direccion varchar(250) DEFAULT NULL, dni int(11) DEFAULT NULL, fecha date DEFAULT NULL,"
				+ "PRIMARY KEY(id));";
		modelo.crearTabla("videoclub", queryClientes);

		// Creamos la query de la segunda tabla y la tabla
		String queryVideos = "CREATE TABLE videos "
				+ "(id int(11) NOT NULL AUTO_INCREMENT, title varchar(250), director varchar(250), cli_id int(11) DEFAULT NULL,"
				+ "PRIMARY KEY(id), FOREIGN KEY(cli_id) REFERENCES clientes (id) ON DELETE cascade ON UPDATE cascade);";
		modelo.crearTabla("videoclub", queryVideos);

		// Llamamos al controlador del Menu Principal el cual ya se encargara de todo
		new MenuPrincipalController(new MenuPrincipal(), modelo);
	}
}