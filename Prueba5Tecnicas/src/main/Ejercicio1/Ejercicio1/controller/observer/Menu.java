package Ejercicio1.controller.observer;

import java.util.*;

public class Menu {
    private List<ObserverMenu> observadores;
    private String nuevoMenu;

    public Menu() {
        observadores = new ArrayList<>();
    }

    public void agregarObservador(ObserverMenu observador) {
        observadores.add(observador);
    }

    public void quitarObservador(ObserverMenu observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (ObserverMenu observador : observadores) {
            observador.actualizar(nuevoMenu);
        }
    }

    // Método para cambiar el menú y notificar a los observadores
    public void cambiarMenu(String nuevoMenu) {
        this.nuevoMenu = nuevoMenu;
        notificarObservadores();
    }
    
	public String getMenu() {
		return nuevoMenu;
	}
}
