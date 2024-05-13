package Ejercicio1.controller.strategy;

public class ServicioRapido implements EstrategiaServicioCliente {
    @Override
    public void ofrecerServicio() {
        System.out.println("Ofreciendo servicio rápido.");
    }
}
