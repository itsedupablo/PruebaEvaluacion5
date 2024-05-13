package Ejercicio1.controller.command;

// Clase concreta para reservar una mesa
public class ComandoReservarMesa implements Comando {
    private Mesa mesa;

    public ComandoReservarMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    @Override
    public void ejecutar() {
        mesa.reservar();
    }
}