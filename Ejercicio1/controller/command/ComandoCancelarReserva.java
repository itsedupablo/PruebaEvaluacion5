package Ejercicio1.controller.command;

public class ComandoCancelarReserva implements Comando{
    private Mesa mesa;

    public ComandoCancelarReserva(Mesa mesa) {
        this.mesa = mesa;
    }

    @Override
    public void ejecutar() {
        mesa.cancelarReserva();
    }
}

