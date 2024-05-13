package Ejercicio1.controller.strategy;

public class ServicioNormal implements EstrategiaServicioCliente {
    @Override
    public void ofrecerServicio() {
        System.out.println("Ofreciendo servicio normal.");
    }
}
