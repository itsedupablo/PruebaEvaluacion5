package Ejercicio1.controller.strategy;

public class ServicioLujo implements EstrategiaServicioCliente {
    @Override
    public void ofrecerServicio() {
        System.out.println("Ofreciendo servicio de lujo.");
    }
}
