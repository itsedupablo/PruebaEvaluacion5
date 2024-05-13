package Ejercicio1.controller.command;

public class ComandoOrdenarMesa implements Comando {
	private Mesa mesa;

	public ComandoOrdenarMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	@Override
	public void ejecutar() {
		mesa.ordenar();
	}
}