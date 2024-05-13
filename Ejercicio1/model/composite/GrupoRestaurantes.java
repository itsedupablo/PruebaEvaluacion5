package Ejercicio1.model.composite;

import java.util.ArrayList;
import java.util.List;

import Ejercicio1.controller.factory.Restaurante;

public class GrupoRestaurantes extends Restaurante {
    private List<Restaurante> restaurantes;

    public GrupoRestaurantes() {
    	super();
        restaurantes = new ArrayList<>();
    }

    public void agregarRestaurante(Restaurante restaurante) {
        restaurantes.add(restaurante);
    }

    public void quitarRestaurante(Restaurante restaurante) {
        restaurantes.remove(restaurante);
    }

    public void mostrarRestaurantes() {
        System.out.println("Este grupo de restaurantes contiene:");
        for (Restaurante restaurante : restaurantes) {
            restaurante.mostrarRestaurante();
        }
    }




}
