package Ejercicio1.controller.command;

public class Mesa {
	private int numMesa;

public Mesa(int numMesa) {
    this.numMesa = numMesa;
}

public void reservar() {
	System.out.println("Reservando mesa " + numMesa);
}

public void cancelarReserva() {
	System.out.println("Cancelando reserva en mesa " + numMesa);
}

public void ordenar() {
	System.out.println("Ordenando mesa " + numMesa);
}

public int getNumMesa() {
    return numMesa;
}
}
