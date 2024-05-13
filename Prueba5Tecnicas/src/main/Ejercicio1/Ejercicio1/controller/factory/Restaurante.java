package Ejercicio1.controller.factory;

import Ejercicio1.model.*;
import Ejercicio1.model.composite.GrupoRestaurantes;


// Clase abstracta que permite la creación de restaurantes
public abstract class Restaurante {
	String nombre;

	// Constructor
	public Restaurante() {
	}

	// Factory Method
	public static Restaurante crearRestaurante(int tipoRestaurante) {
		if (tipoRestaurante == 1) {
			return new RestauranteRapido();
		} else if (tipoRestaurante == 2) {
			return new RestauranteTematico();
		} else {
			return new RestauranteLujo();
		}

	}

	public static Restaurante crearGrupoRestaurantes() {

		return new GrupoRestaurantes();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Método que muestra el restaurante
	public String mostrarRestaurante() {
		return "Restaurante " + nombre;
	}

		
	
}
